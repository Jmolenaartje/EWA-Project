<template>

  <table class="table">
    <tr>
      <th>Quiz title</th>
      <td> <input v-model="this.selectedQuiz.title"/> </td>
    </tr>

  <tbody v-for="(question) in this.selectedQuiz.questions" :key="question.id" >
    <tr>
      <th>Question:</th>
      <td><input v-model="question.question"/></td>
    </tr>
    <tr>
      <th>Answer:</th>
      <td><input v-model="question.answer"/></td>
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

  created() {
    console.log(this.selectedQuiz)
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