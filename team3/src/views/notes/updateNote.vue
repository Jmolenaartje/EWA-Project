<template>
  <header class="masthead bg-primary text-white text-center">
    <div class="row">
      <div class="col-12">
        <h1>Update a note</h1>
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
              placeholder={{this.noteContent}}
              v-model="noteContent"
          ></textarea>
        </div>
      </div>
    </div>

    <!-- Create note button -->
    <div class="row">
      <div class="col-12">
        <button class="btn btn-primary" @click="updateNote">Update note</button>
      </div>
    </div>
  </header>
</template>

<script>
import NotesRepository from "@/repository/notesRepository";

export default {
  name: "updateNote",

  created() {
    this.repository = new NotesRepository();
    this.getNote(this.$route.params.id);
  },

  data() {
    return {
      // note content
      noteContent: "",

      // userId
      userId: "",
    }
  },

  methods: {
    // get notes async
    async getNote(id) {
      // get notes from repository
      const note = await this.repository.getNoteById(id);

      console.log(note);

      // get note content
      this.noteContent = note['note'];

      // get user id
      this.userId = note['userId'];
    },

    updateNote() {
      // get the content of the note
      const content = this.noteContent;

      // update note
      this.repository.updateNoteById(this.$route.params.id, this.userId, content);

      this.$router.push("/notes/" + this.userId);
    },

  }
}
</script>

<style scoped>

</style>