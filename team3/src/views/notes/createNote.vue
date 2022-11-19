<template>
  <header class="masthead bg-primary text-white text-center">
  <div class="row">
    <div class="col-12">
      <h1>Create a new note</h1>
    </div>
  </div>

  <!-- Input field for note -->
  <div class="row">
    <div class="col-12">
      <div class="form-group">
        <label for="noteContent">Note content</label>
        <textarea
          class="form-control"
          id="noteContent"
          rows="3"
          placeholder="Enter note content"
          v-model="noteContent"
        ></textarea>
      </div>
    </div>
  </div>

  <!-- Create note button -->
  <div class="row">
    <div class="col-12">
      <button class="btn btn-primary" @click="createNote">Create note</button>
    </div>
  </div>
</header>
</template>

<script>
import NotesRepository from "@/repository/notesRepository";
export default {
  name: "createNote",

  created() {
    this.repository = new NotesRepository();
  },

  data() {
    return {
      // note content
      noteContent: "",
    }
  },

  methods: {
    createNote() {
      // get the content of the note
      const content = this.noteContent;

      // create note
      this.repository.createNote(this.$route.params.id, content);

      // redirect to user notes
      this.$router.push("/userNotes/" + this.$route.params.id);
    }
  }
}

</script>

<style scoped>
.form-control {
  margin: 0 auto;
  margin-bottom: 1rem;
  width: 50%;
}
</style>