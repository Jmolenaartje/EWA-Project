<template>
  <header class="masthead bg-primary text-white text-center">
    <div class="container d-flex align-items-center flex-column">
      <div class="row">

        <!-- Header-->
        <div class="col-12">
          <h1 class="text-center">Notes</h1>
        </div>
      </div>

      <!-- Notes -->
      <ul>
        <li v-for="note in notes" :key="note.id">
          <a>
            <!-- Cross to delete note -->
            <button class="btn-delete" @click="deleteNote(note.id)">
              <i class="fas fa-times"></i>
            </button>

            <!-- Edit icon to edit note -->
            <button class="btn-edit" @click="editNote(note.id)">
              <i class="fas fa-edit"></i>
            </button>

            <p>{{note['note']}}</p>
          </a>
        </li>
      </ul>

      <!-- Create new note button -->
      <div class="row">
        <div class="col-12">
         <button id="jelmerbutton" class="btn text-light"> <router-link to="/createNote/1">Create a new note</router-link></button>
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

    // small timeout otherwise some updates are not shown <-- moet gefixt worden later!
    // TODO fix this
    setTimeout(() => {
      this.getNotes(id);
    }, 100);
  },

  methods: {
    // get notes async
    async getNotes(id) {
      this.notes = await this.repository.getNotes(id);
      console.log(this.notes);
    },

    // delete note async
    async deleteNote(id) {
      console.log(id);
      await this.repository.deleteNoteById(id);
      await this.getNotes(this.$route.params.id);
    },

    // onclick edit note send to edit note page with id and note content
    editNote(id) {
      this.$router.push("/updateNote/" + id);
    }
  }
}



</script>

<style scoped>
/* Card styling */
body {
  margin: 20px auto;
  font-family: 'Lato';
  background:#666;
  color:#fff;
}

*{
  margin:0;
  padding:0;
}

h2 {
  font-weight: bold;
  font-size: 2rem;
}

p {
  font-size: 1rem;
  font-weight: normal;
}

ul,li{
  list-style:none;
}
ul{
  display: flex;
  flex-wrap: wrap;
  justify-content: center;
}
ul li a{
  text-decoration:none;
  color:#000 !important;
  background:#ffc;
  display:block;
  height:10em;
  width:10em;
  padding:1em;
}
ul li{
  margin:1em;
}
/* Shadow */
ul li a{
  text-decoration:none;
  color:#000;
  background:#ffc;
  display:block;
  height:10em;
  width:10em;
  padding:1em;
  box-shadow: 5px 5px 7px rgba(33,33,33,.7);
}
/* Hover Effect */
ul li a{
  transform: rotate(-6deg);
}

/* Random tilt */
ul li:nth-child(even) a{
  transform:rotate(4deg);
  position:relative;
  top:5px;
}
ul li:nth-child(3n) a{
  transform:rotate(-3deg);
  position:relative;
  top:-5px;
}
ul li:nth-child(5n) a{
  transform:rotate(5deg);
  position:relative;
  top:-10px;
}

/* Zoom Effect */
ul li a:hover,ul li a:focus{
  box-shadow:10px 10px 7px rgba(0,0,0,.7);
  transform: scale(1.25);
  position:relative;
  z-index:5;
}

/* Transition */
ul li a{
  text-decoration:none;
  color:#000;
  background:#ffc;
  display:block;
  height:10em;
  width:10em;
  padding:1em;
  box-shadow: 5px 5px 7px rgba(33,33,33,.7);
  transition: transform .15s linear;
}

ul li:nth-child(even) a{
  position:relative;
  top:5px;
  background:#cfc;
}
ul li:nth-child(3n) a{
  position:relative;
  top:-5px;
  background:#ccf;
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
  color: #fff !important;
  background-color: #007bff;
  border-color: #007bff;
}

.btn-primary:hover {
  color: #fff;
  background-color: #0069d9;
  border-color: #0062cc;
}

/* btn delete styling */
.btn-delete {
  background: transparent;
  border: none;

  /* margin so its not to close to edit */
  margin-right: 3em;
}

.btn-edit {
  background: transparent;
  border: none;

  /* margin so its not to close to delete */
  margin-left: 3em;

}

#jelmerbutton {
  color: white;
}

</style>