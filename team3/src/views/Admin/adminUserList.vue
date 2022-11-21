<template>
  <header class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">
      <h1>Users:</h1>
      <div class="container" >
  <div @click="test" v-for="user in users" :key="user" class="card" >
    <div class="card-body">

      <img
          src="https://www.w3schools.com/howto/img_avatar.png"
          alt="Avatar"
          class="avatar"
      />

      <div class="col">
        <div @click="toEditUser(user)"  class="userName">{{user.userName}}</div>
      </div>

    </div>
  </div>
      </div>
    </div>
  </header>

</template>

<script>
// import {User} from "@/assets/js/user.js";

import UserRepository from "@/repository/userRepository";
export default {
  name: "adminUserList",


  data() {
    return {
      users: [],
      id:'',

      repository: new UserRepository(),
    }
  },

  async created() {
    const  data = await this.repository.getUserAll();
    for (let i = 0; i < data.length; i++) {

      this.users.push(data[i]);
    }

  },

  methods: {
    async test(){

    },

    toEditUser(user){
      this.$router.push("/admin-edit-user/" + user.id)

      localStorage.id = "";
      localStorage.name = "";
      localStorage.email = "";

      localStorage.id = user.id;
      localStorage.name = user.name;
      localStorage.email = user.email;


    }

  }

}

</script>

<style scoped>

.card {
  background: transparent;
  margin: 0.2em;
}

.card-body {
  padding: 0.1em;
  padding-left: 0.2em;
  padding-right: 0.2em;
}

.card:hover {
  background: #5dbea0;
  cursor: pointer;
}
.avatar {
  width: 2em;
  border-radius: 50%;
  float: left;
}

.userName {
  float: left;
  padding-left: 1em;
}



</style>