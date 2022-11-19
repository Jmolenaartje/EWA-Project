<template>
  <header class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">
      <div class="row">

        <!-- Header-->
        <div class="col-12">
          <h1 class="text-center">Notes</h1>
        </div>
      </div>

      <!-- Note cards -->
      <div class="row">
        <div v-for="note in notes" :key="note.id" class="col-12 col-md-4">
          <div class="card">
            <div class="card-body">
              <h5 class="card-title">NoteId: {{ note['userId'] }}</h5>
              <p class="card-text">
                {{
                  note['note']
                }}
              </p>
            </div>
          </div>
        </div>
      </div>

      <!-- Create new note button -->
      <div class="row">
        <div class="col-12">
          <!--          <button class="btn btn-primary"> <router-link to="createNote">Create a new note</router-link></button>-->
          <button class="btn btn-primary">Create a new note</button>
        </div>
      </div>
    </div>



  </header>
</template>

<script>
import NotesRepository from "@/repository/notesRepository";

export default {
  name: "userNotes",
  data() {
    return {
      notes: [],
      repository: new NotesRepository(),
    }
  },

  created() {
    // retrieve id from url using vue
    const id = this.$route.params.id;

    this.getNotes(id);
  },

  methods: {
    // get notes async
    async getNotes(id) {
      this.notes = await this.repository.getNotes(id);
      console.log(this.notes);
    },
  }
}



</script>

<style scoped>
/* Card styling */
.card {
  background: transparent;
  margin-left: 5em;
  margin-right: 5em;
  margin-bottom: 1em;

  /* give min width and height to the card */
  min-width: 300px;
  min-height: 200px;

}

.card-body {
  background: #fff;
  border-radius: 0.5em;
  padding: 0.5em;
}

.card-title {
  color: black;
  font-size: 1.5em;
  font-weight: bold;
}

.card-text {
  color: black;
  font-size: 1em;
}

/* Button styling */
.btn {
  background: #fff;
  border-radius: 0.5em;
  padding: 0.5em;
  font-size: 1em;
  font-weight: bold;
}

.btn:hover {
  background: #f5f5f5;
}

.btn:active {
  background: #e8e8e8;
}

.btn:focus {
  outline: none;
}

.btn-primary {
  color: #fff;
  background-color: #007bff;
  border-color: #007bff;
}

.btn-primary:hover {
  color: #fff;
  background-color: #0069d9;
  border-color: #0062cc;
}

</style>