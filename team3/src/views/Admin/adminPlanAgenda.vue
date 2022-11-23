<template>
  <header class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">

      <div class="b-table-no-border-collapse">
      <div class="row">
        <div class="col-sm">Title</div>
        <div class="col-sm"><input v-model="this.title"></div>
      </div>
        <hr>

      <div class="row">
        <div class="col-sm">Description</div>
        <div class="col-sm"><input v-model="this.description"></div>
      </div>
        <hr>

        <div class="row">
          <div class="col-sm">Location</div>
          <div class="col-sm"><input v-model="this.location"></div>
        </div>
        <hr>

      <div class="row">
        <div class="col-sm">Leader</div>
        <div class="col-sm"><input v-model="this.leader"></div>
      </div>
        <hr>

      <div class="row">
        <div class="col">Game level</div>
        <div class="col">
          <select v-model="this.gameLevel">
            <option disabled value="">Please select one</option>
            <option>Game-1</option>
            <option>Game-2</option>
            <option>Game-3</option>
            <option>Game-4</option>
            <option>Game-5</option>
            <option>Game-6</option>
          </select>
        </div>
      </div>
      <hr>

        <div class="row">
          <div class="col">capacity</div>
          <div class="col"><input type="number" v-model="this.capacity"></div>
        </div>
        <hr>

      <div class="row">
        <div class="col">Start date</div>
        <div class="col"><input type="datetime-local" v-model="this.startDate"></div>
      </div>
    <hr>

      <div class="row">
        <div class="col">End date</div>
        <div class="col"><input type="datetime-local" v-model="this.endDate"></div>
      </div>
      <hr>

      </div>
        <button class="btn btn-primary" v-on:click="sendToDatabase">Submit</button>



    </div>
  </header>


</template>

<script>
import AgendaItemRepository from "@/repository/agendaItemRepository";

export default {
  name: "adminPlanAgenda",

  data() {
    return {
      title: "",
      description: "",
      location: "",
      leader: "",
      gameLevel: "",
      startDate: "",
      endDate: "",
      capacity: "",
      repository: new AgendaItemRepository(),
    }
  },

  methods: {
    sendToDatabase() {
      this.repository.pushAgendaItem(this.capacity, this.description, this.endDate, this.gameLevel, this.leader, this.location, this.startDate, this.title)
      alert("Event " + this.title + " has been added to database!")
      this.title = ""
      this.description = ""
      this.location = ""
      this.leader = ""
      this.gameLevel = ""
      this.startDate = ""
      this.endDate = ""
      this.capacity = ""
    }
},
}
</script>

<style scoped>
select {
  width: 11em;
}
</style>