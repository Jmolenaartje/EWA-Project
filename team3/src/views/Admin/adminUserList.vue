<template>
  <header class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">
      <h1>Users:</h1>
      <div class="container">
        <div v-for="(user) in this.users" :key="user.userName" class="card" @click="toEditUser($event)">
          <div class="card-body">

            <img
                src="https://www.w3schools.com/howto/img_avatar.png"
                alt="Avatar"
                class="avatar"
            />

            <div class="col">
              <div class="userName">{{ user.userName }}</div>
            </div>
            <button @click="test"> babab</button>

          </div>
        </div>
      </div>
    </div>
  </header>

</template>

<script>
import {User} from "@/assets/js/user.js";
import UserRepository from "@/repository/UserRepository";

export default {
  name: "adminUserList",


  data() {
    return {
      users: [],

      repository: new UserRepository
    }
  },


  created() {


    this.users[0] = new User("Jaap Klok", 12343);
    this.users[1] = new User("Piet de Hond", "DAE132s!");

  },

  methods: {
    async test(){
   await  this.repository.getAllUsers();
      console.log(this.repository.getAllUsers()[0].name)
          },
    toEditUser(event) {
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