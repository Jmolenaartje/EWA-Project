<template>
  <header class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">
  <div v-for="(user) in this.users" :key="user.userName" class="card">
    <div class="card-body">{{user.userName}}</div>
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
    console.log("FAKKAAA")
    this.users[0] = new User("Jaap", 12343);
    this.users[1] = new User("piet", "DAE132s!");
  }

}





</script>

<style scoped>

.card {
  background: transparent;
  margin: 1em;
  width: 50em;
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

@media (min-width: 768px) {
  .card {
    border-radius: 0.25rem;
  }
}

@media (min-width: 992px) {
  .card {
    border-radius: 0.25rem;
  }
}

@media (min-width: 1200px) {
  .card {
    border-radius: 0.25rem;
  }
}

</style>