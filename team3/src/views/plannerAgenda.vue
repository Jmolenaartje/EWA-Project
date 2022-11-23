<template>
  <header class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">

      <div class="card agenda-container">

        <div class="agenda-body">
        <div class="row">
          <div class="col-lg-auto">Geplanden evenmeten</div>
          <div class="col-lg-auto">
            <select v-model="this.gameLevel">
              <option disabled value="">Please select one</option>
              <option>Game-1</option>
              <option>Game-2</option>
              <option>Game-3</option>
              <option>Game-4</option>
              <option>Game-5</option>
              <option>Game-6</option>
              <option>All</option>
            </select>
          </div>
        </div>

        <div class="row">
          <div class="col-sm">&lt;</div>
          <div class="col-sm" >1/3</div>
          <div class="col-sm">&gt; </div>
        </div>

          <hr>
          <div v-for="(agendaItem) in this.agendaItems" :key="agendaItem.id" class="agenda-item">
            <div class="agenda-item-body" v-if="agendaItem.gameLevel === this.gameLevel || this.gameLevel === '' || this.gameLevel === 'All'">
              <div class="row test">{{new Date(agendaItem.startDate).toLocaleTimeString("nl-NL", this.options)}}</div>
              <div class="row testtt">{{agendaItem.title}}</div>
              <div class="row testt">{{agendaItem.location}}</div>
            </div>
            <hr v-if="agendaItem.gameLevel === this.gameLevel || this.gameLevel === '' || this.gameLevel === 'All'">
          </div>
      </div>
      </div>



    </div>
  </header>
</template>

<script>
import AgendaItemRepository from "@/repository/agendaItemRepository";

export default {
  name: "plannerAgenda",
  data() {
    return {
      agendaItems: [],
      repository: new AgendaItemRepository(),
      options: { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric', hour: '2-digit',
        minute: '2-digit', hour12: false},
      gameLevel: "",
      showAgendaItems: [],
      // pageCount: 0,
      // gameCount: 2,
      // currentPage: 1,
    }
  },

  created() {
    setTimeout(() => {
      this.getAgendaItems();
    }, 25);

  },

  methods: {
    async getAgendaItems() {
      this.agendaItems = await this.repository.getAgendaItems();
      // this.showAgendaItems = [this.agendaItems[0], this.agendaItems[1], this.agendaItems[2]]
    },

    // switchGame() {
    //   this.currentPage = 1;
    //   this.gameCount = 2;
    //   this.sortOnGame()
    //   this.showAgendaItems = [this.showAgendaItems[0], this.showAgendaItems[1], this.showAgendaItems[2]]
    // },

    // sortOnGame() {
    //   this.showAgendaItems = [];
    //   for (let i = 0; i < this.agendaItems.length; i++) {
    //     let current = this.agendaItems[i];
    //     if (current.gameLevel === this.gameLevel) {
    //       this.showAgendaItems[this.showAgendaItems.length] = current;
    //     }
    //   }
    // },
  },
}
</script>

<style scoped>
.agenda-container {
  background: none;
}

.agenda-body {
  padding: 0.5em;
}

select {
  background: none;
  border-radius: .3em;
}

hr {
  margin: 0;
}

.agenda-item-body {
  /*border: #53CDB4;*/
  padding-left: 1em;
}

.test {
  font-size: 0.8em;
}

.testt {
  font-size: 0.6em;
}

.testtt {
  font-weight: bold;
}
</style>