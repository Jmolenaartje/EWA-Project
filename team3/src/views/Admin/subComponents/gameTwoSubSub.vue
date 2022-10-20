<template>
  <h1>{{this.selectedQuiz.title}}</h1>
  <div v-for="(question) in this.selectedQuiz.questions" :key="question.id" class="card">
    <tr>
      <td>{{question.question}}</td>
      <td>{{question.answer}}</td>
    </tr>
  </div>

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

.card {
  background: transparent;
  margin: 1em;
}

.card-body {
  padding: 0.1em;
  padding-left: 0.2em;
  padding-right: 0.2em;
}

.card:hover {
  background: #5dbea0;
  cursor: pointer;
}

</style>