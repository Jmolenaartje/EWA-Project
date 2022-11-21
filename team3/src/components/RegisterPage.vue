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
                <form @submit.prevent="postUser">
                  <div class="form-group mb-3">
                    <label for="userNameLabel">user name</label>
                    <input
                        type="text"
                        class="form-control"
                        v-model="userName"
                        placeholder="user name"
                        required
                    />
                    <label for="firstNameLabel">First name</label>
                    <input
                        type="text"
                        class="form-control"
                        v-model="name"
                        placeholder="first name"
                        required
                    />
                    <label for="labelEmail">Email</label>
                    <input
                        type="email"
                        class="form-control"
                        v-model="email"
                        placeholder="email"
                        required
                    />
                    <label for="passwordLabel">Password</label>
                    <input
                        type="password"
                        class="form-control"
                        v-model="password"
                        placeholder="password"
                        required
                    />
                    <input class="btn btn-secondary mt-1" type="submit" value="create account">


                  </div>

                  <!-- <button class="fas fa-chevron-right ms-1" @click="clickEvent" />
                --></form>
              </div>


              <div class="btn btn-secondary mt-1">
                Sign in<span class="fas fa-chevron-right ms-1"></span>
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
  data() {
    return {
      error: [],
      email: null,
      name: null,
      userName: null,
      password: null,

      repository: new UserRepository(),

    };
  },
  methods: {
    async postUser() {

      await this.repository.createUser(this.userName, this.name, this.email, this.password);

    },

    validate() {

    },
    signup() {
      this.validate();
      console.log(this.error);
    },
  }
};
</script>

<style></style>
