<template>
  <div class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">
      <div class="row">

        <div class="col-lg" @click="loadSubPage('game-1')">
          <div class="card" id="game-1">
            <div class="card-body">
            Game 1
            </div>
          </div>
        </div>

          <div class="col-lg" @click="loadSubPage('game-2')">
            <div class="card" id="game-2">
              <div class="card-body">
              Game 2
              </div>
            </div>
          </div>

        <div class="col-lg" @click="loadSubPage('game-3')">
          <div class="card" id="game-3">
            <div class="card-body">
            Game 3
            </div>
          </div>
        </div>

        <div class="col-lg" @click="loadSubPage('game-4')">
          <div class="card" id="game-4">
            <div class="card-body">
            Game 4
            </div>
          </div>
        </div>

        <div class="col-lg" @click="loadSubPage('game-5')">
          <div class="card" id="game-5">
            <div class="card-body">
              Game 5
            </div>
          </div>
        </div>

        <div class="col-lg" @click="loadSubPage('game-6')">
          <div class="card" id="game-6">
            <div class="card-body">
              Game 6
            </div>
          </div>
        </div>

      </div>
      <router-view
      v-if="subPage" :test="subPage" :selectedGame="subPage">
      </router-view>


      </div>
  </div>
</template>

<script>

export default {
  name: "adminEditGame",
  data() {
    return {
      subPage: null,
      previousSubPage: null,
    }
  },

  mounted() {
    this.subPage = this.getSubPage();
    this.highlight(this.subPage);
    console.log(this.subPage)
  },


  methods: {
    loadSubPage(subPage) {
      this.$router.push("/admin/" + subPage);
    },

    getSubPage() {
      let urlParts = this.$route.fullPath.toString().split('/');
      console.log(urlParts)
      console.log(urlParts[2])
      if (urlParts[2] != undefined && urlParts[2].match(/game-[1-6]/) ) {
          return urlParts[2];
      }
        this.$router.push("/admin/game-1");
        return "game-1";

    },

    deHighlight(id) {
      console.log(id)
      if (id != null) {
        document.getElementById(id).style.backgroundColor = null;
      }
    },

    highlight(id) {
      console.log(id)
      if (id != null) {
        document.getElementById(id).style.backgroundColor = "#5dbea0";
      }
    },

  },

  watch: {
    '$route'() {
      let sub = this.getSubPage();
      console.log(sub)
      if (sub) {
        if (sub != this.subPage) {
          this.previousSubPage = this.subPage;
          this.subPage = sub;

          this.deHighlight(this.previousSubPage);
          this.highlight(this.subPage);
        }

      }
    }
  }
}
</script>

<style scoped>

.col-lg {
  padding: 0.3em;
}

.card:hover {
  background: #5dbea0;
  cursor: pointer;
}

.card {
  background-color: transparent;
}



h2 {
  margin-top: 0;
}

p {
  margin-bottom: 0;
}

a {
  color: #4b68b8;
}

a:hover {
  color: #4b68b8;
  text-decoration: none;
}
.card-body {
  padding: 0.1em;
  padding-left: 0.2em;
  padding-right: 0.2em;
}

.row {
  margin-bottom: 1em;
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