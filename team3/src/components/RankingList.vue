<template>

  <header class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">
      <h1>Ranking List:</h1>
      <div class="container">
        <div v-for="user in users" :key="user" class="card" >
          <div class="card-body">

            <div class="col">
              <div class="ranking">{{baseRank + user.rank}}</div>
            </div>

            <img
                src="https://www.w3schools.com/howto/img_avatar.png"
                alt="Avatar"
                class="avatar"
            />

            <div class="col">
              <div class="userName">{{user.userName}}</div>
            </div>

            <div class="col">
              <div class="score">{{user.score}}</div>
            </div>
          </div>
        </div>

        <!--            todo check page-size and page-number WF examplest-->
        <!--            todo check into bread crumbs-->

        <div class="btn btn-primary" id="previous"><span class="fas fa-chevron-left ms-1"></span>Previous</div>

        <div class="btn btn-primary" id="next">Next<span class="fas fa-chevron-right ms-1 "></span></div>

      </div>
    </div>
  </header>
</template>

<script>
import {User} from "@/assets/js/user.js";
export default {
  name: "RankingList",

  data() {
    return {
      users: [],
      baseRank: 0,
    }
  },

  created() {
    for (let i = 0; i <10 ; i++) {
      this.users.push(User.createUser())
    }

  },
}
</script>

<style scoped>
.card {
  background: transparent;
  margin: 1em;
}

.card-body {
  padding: 0.2em;
  size: auto;
}

.card:hover {
  background: #5dbea0;
  cursor: pointer;
}

@font-face {

}
.ranking, .score {
  font-size: 60px;
}

.ranking {
  float: left;
  padding: 10px;
  margin-right: 40px;
}

.avatar {
  width: 90px;
  border-radius: 50%;
  float: left;
}

.userName {
  float: left;
  padding-left: 2em;
  margin-top: 15px;
  font-size: 40px;
}

.score {
  float: right;
  padding-right: 30px;
}

#previous {
  float: left;
}

#next {
float: right;
}

</style>