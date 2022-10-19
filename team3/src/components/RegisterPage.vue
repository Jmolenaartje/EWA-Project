<template>
  <div class="content">
    <div class="header border-0"></div>
    <div class="body text-center pb-5">
      <div class="container">
        <div class="row justify-content-center">
          <div class="col-lg-8 shadow-lg p-3 m-5 bg-white rounded">
            <!-- title -->
            <p class="mb-1 h-1">Create account</p>
            <!-- Icon Divider-->
            <div class="divider-custom">
              <div class="divider-custom-line"></div>
              <div class="divider-custom-icon"><i class="fas fa-star"></i></div>
              <div class="divider-custom-line"></div>
            </div>
            <!-- divider -->
            <div class="d-flex flex-column align-items-center">
              <div class="d-flex align-items-center">
                <div class="form-group mb-3">
                  <label for="exampleInputEmail1">User Name</label>
                  <input
                    type="email"
                    class="form-control"
                    v-model="email"
                    aria-describedby="emailHelp"
                    placeholder="user name"
                  />
                  <label for="exampleInputEmail1">First name</label>
                  <input
                    type="text"
                    class="form-control"
                    v-model="firstName"
                    placeholder="first name"
                  />
                  <label for="exampleInputEmail1">Last name</label>
                  <input
                    type="text"
                    class="form-control"
                    v-model="lastName"
                    placeholder="last name"
                  />
                  <label for="exampleInputEmail1">Password</label>
                  <input
                    type="password"
                    class="form-control"
                    v-model="password1"
                    placeholder="password"
                  />
                  <label for="exampleInputEmail1">Password</label>
                  <input
                    type="password"
                    class="form-control"
                    v-model="password2"
                    placeholder="password"
                  />
                </div>
              </div>

              <router-link to="/">
                <div class="btn btn-primary">
                  Create Account<span class="fas fa-chevron-right ms-1"></span>
                </div>
              </router-link>

              <router-link to="/">
                <div class="btn btn-secondary mt-1">
                  Sign in<span class="fas fa-chevron-right ms-1"></span>
                </div>
              </router-link>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return{
    error: [],
    email: null,
    phone: null,
    password1: null,
    password2: null,
    }
  },
  methods: {
       validate() {
      this.errors = [];
      if (!this.firstName) this.errors.push("First name is required");
      if (!this.lastName) this.errors.push("Surname is required");
      if (!this.email) this.errors.push("Email is required");
      if (!this.password1) this.errors.push("Password is required");
      if (!this.password2)
        this.errors.push("Please repeat your password");
      if (this.password1 != this.password2)
        this.errors.push("The repeated password is not a match");
    },
     signup() {
      this.validate();
      if (this.errors.length !== 0) return;
      // const user = {
      //   firstName: this.first_name,
      //   lastName: this.surname,
      //   email: this.email,
      //   password: this.password,
      // };
    },
  }
}
</script>

<style></style>
