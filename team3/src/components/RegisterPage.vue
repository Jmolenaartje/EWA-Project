<template>
  <header class="content masthead bg-primary">
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
                <form>
                  <div class="form-group mb-3">
                    <label for="exampleInputEmail1">Email</label>
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

                  <!-- <button class="fas fa-chevron-right ms-1" @click="clickEvent" />
                --></form>
              </div>
              <router-link to="/profilePage">
                <div class="btn btn-secondary mt-1">
                  Create account<span class="fas fa-chevron-right ms-1"></span>
                </div>
              </router-link>
              <router-link to="/signIn">
                <div class="btn btn-secondary mt-1">
                  Sign in<span class="fas fa-chevron-right ms-1"></span>
                </div>
              </router-link>
            </div>
          </div>
        </div>
      </div>
    </div>
  </header>
</template>

<script>
export default {
  data() {
    return {
      error: [],
      email: null,
      firstName: null,
      lastName: null,
      password1: null,
      password2: null,
    };
  },
  methods: {
    clickEvent() {
      console.log("imail");
    },
    validate() {
      this.errors = [];
      if (!this.email) this.errors.push("Email is required");
      else this.errors.email.delete;
      if (!this.firstName) this.errors.push("First name is required");
      else this.errors.firstName.delete;
      if (!this.lastName) this.errors.push("Surname is required");
      else this.errors.lastName.delete;
      if (!this.password1) this.errors.push("Password is required");
      else this.errors.password1.delete;
      if (!this.password2) this.errors.push("Please repeat your password");
      else this.errors.password2.delete;
      if (this.password1 != this.password2)
        this.errors.push("The repeated password is not a match");
    },
    signup() {
      this.validate();
      console.log(this.error);
    },
  },
  watch: {},
};
</script>

<style></style>
