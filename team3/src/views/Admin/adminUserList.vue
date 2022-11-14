<template>
  <header class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">
      <h1>Users:</h1>
      <div class="container" @click="toEditUser($event)">
  <div v-for="user in users" :key="user" class="card" >
    <div class="card-body">

      <img
          src="https://www.w3schools.com/howto/img_avatar.png"
          alt="Avatar"
          class="avatar"
      />

      <div class="col">
        <div class="userName">{{user.userName}}</div>
      </div>

    </div>
  </div>
      </div>
    </div>
  </header>

</template>

<script>
import {User} from "@/assets/js/user.js";
export default {
  name: "adminUserList",


  data() {
    return {
      users: [],
    }
  },

  created() {
    for (let i = 0; i <8 ; i++) {
      this.users.push(User.createUser())
    }

  },

  methods: {

    toEditUser(event){
      this.$router.push("/admin-edit-user/" + event.target.innerHTML)
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