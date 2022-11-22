<template>
  <header class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">

      <div class="card agenda-container">

        <div class="agenda-body">
        <div class="row">
          <div class="col-lg-auto">Geplanden evenmeten</div>
          <div class="col-lg-auto">
            <select>
              <option>game 1</option>
              <option>game 2</option>
            </select>
          </div>
        </div>

        <div class="row">
          <div class="col-sm" >&lt;</div>
          <div class="col-sm" >1/3</div>
          <div class="col-sm">&gt; </div>
        </div>

          <hr>
          <div class="agenda-item">
            <div class="agenda-item-body">
            <div class="row test">Woensdag 21 Nov</div>
            <div class="row testtt">Title</div>
            <div class="row testt">locatie</div>
            </div>
            <hr>
          </div>

          <div class="agenda-item">
            <div class="agenda-item-body">
              <div class="row test">Woensdag 21 Nov</div>
              <div class="row testtt">Title</div>
              <div class="row testt">locatie</div>
            </div>
            <hr>
          </div>

          <div v-for="(agendaItem) in this.agendaItems" :key="agendaItem.id" class="agenda-item">
            <div class="agenda-item-body">
              <div class="row test">{{new Date(agendaItem.startDate)}}</div>
              <div class="row testtt">{{agendaItem.title}}</div>
              <div class="row testt">{{agendaItem.location}}</div>
            </div>
            <hr>
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
    }
  },

  created() {
    setTimeout(() => {
      this.getAgendaItems();
    }, 25);
    console.log(this.agendaItems)
  },

  methods: {
    async getAgendaItems() {
      this.agendaItems = await this.repository.getAgendaItems();
      console.log(this.agendaItems)
    },
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