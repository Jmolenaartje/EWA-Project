<template>
  <header class="content masthead bg-primary">
    <div class="header border-0"></div>
    <div class="body text-center pb-5">
      <div class="container">
        <div class="row justify-content-center">
          <div class="col-lg-8 shadow-lg p-3 m-5 bg-white rounded">
            <!-- Portfolio Modal - Title-->

            <p class="mb-1 h-1">Sign In</p>
            <!-- Icon Divider-->
            <div class="divider-custom">
              <div class="divider-custom-line"></div>
              <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
              <div class="divider-custom-line"></div>
            </div>
            <!-- Portfolio Modal - Image-->

            <!-- Portfolio Modal - Text-->

            <div class="d-flex flex-column  align-items-center">
              <div class="d-flex align-items-center">
                <div class="form-group mb-3">
                  <label for="exampleInputEmail1">User Name</label>
                  <input
                      type="email"
                      class="form-control"
                      id="username"
                      aria-describedby="emailHelp"
                      placeholder="Enter email/user name"
                      v-model="username"
                  />
                  <label for="exampleInputEmail1">Password</label>
                  <input
                      type="password"
                      class="form-control"
                      id="password"
                      placeholder="password"
                      v-model="password"
                  />

                </div>
              </div>
              <div class="d-flex flex-column">
                <button class="btn btn-primary" @click="login">
                  Log in
                </button>
                <router-link to="/registerPage">
                  <div class="btn btn-primary mt-1">
                    Register<span class="fas fa-chevron-right ms-1"></span>
                  </div>
                </router-link>
              </div>
            </div>

          </div>
        </div>
      </div>
    </div>
  </header>
</template>

<script>
import UserRepository from "@/repository/userRepository";

export default {
  name: "SignIn",
  data() {
    return {
      username: "",
      password: "",
    };
  },

  created() {
    this.repository = new UserRepository();
  },

  methods: {
    login() {
      // log in
      this.repository.loginUser(this.username, this.password).then((response) => {
        // if response status 500, then user does not exist
        if (response.status === 500) {
          alert("Username or password is incorrect");
        }
        else {
          // log the response
          console.log(response);
          let admin = response['admin'];
          let id = response['id'];
          let userName = response['userName'];
          let name = response['name'];
          let email = response['email'];

          sessionStorage.setItem("admin", admin);
          sessionStorage.setItem("id", id);
          sessionStorage.setItem("userName", userName);
          sessionStorage.setItem("name", name);
          sessionStorage.setItem("email", email);

          // redirect to / with 100 ms delay
          setTimeout(() => {
            location.reload();
          }, 100);
          this.$router.push("/");
        }
      }).catch((error) => {
        console.log(error);
        console.log("Wrong username or password");
      });

    },
  },

}

</script>

<style></style>
