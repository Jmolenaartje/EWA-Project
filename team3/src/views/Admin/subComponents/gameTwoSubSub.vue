<template>

  <table class="table">
    <tr>
      <th>Quiz title</th>
      <td> <input type="text" v-model="selectedQuizTitle"/> </td>
    </tr>

  <tbody v-for="(question) in this.selectedQuiz.questions" :key="question.id" >
    <tr>
      <th>Question:</th>
      <td><input v-model="question.question"/></td>
    </tr>
    <tr>
      <th>Answer 1:</th>
      <td><input v-model="question.answer1"/></td>
    </tr>
    <tr>
      <th>Answer 2:</th>
      <td><input v-model="question.answer2"/></td>
    </tr>
    <tr>
      <th>Answer 3:</th>
      <td><input v-model="question.answer3"/></td>
    </tr>
    <tr>
      <th>Answer 4:</th>
      <td><input v-model="question.answer4"/></td>
    </tr>
      <tr>
        <th>Score:</th>
        <td><input type="number" v-model="question.score"/></td>
      </tr>
  </tbody>

  </table>

</template>

<script>
export default {
  name: "gameTwoSubSub",
  props: ['selectedQuiz'],

  data() {
    return {
      selectedQuizTitle: "",
    }
  },

  created() {
    let urlId = this.$route.params.id;
    this.selectedQuizTitle = urlId;
  },

  watch: {
    '$route'() {
      let urlId = this.$route.params.id;

      this.selectedQuizTitle = urlId;
    }
  }


}
</script>

<style scoped>
input {
  width: 40em;
  border: none;
  background: none;
}

</style>