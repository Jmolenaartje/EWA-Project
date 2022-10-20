<template>
<h1>Game 2</h1>
  <div>
    <select @change="selectChange($event)">
      <option v-for="(quiz) in quizzes" :key="quiz.title" :value="quiz.title" >{{quiz.title}}</option>
    </select>

    <router-view :selected-Quiz="selectedQuiz"> </router-view>

  </div>
</template>

<script>
import {Quiz} from "@/assets/js/quiz";
import {Question} from "@/assets/js/question";
export default {
  name: "gameTwoSub",
  data(){
    return {
      quizzes: [],
      selectedQuiz: null,
    }
  },

  created() {
    this.quizzes = this.createFakeQuizs();
    this.selectedQuiz = this.quizzes[0];
    this.$router.push("/admin/game-2/" + this.quizzes[0].title);
    console.log(this.quizzes);
  },

  methods: {
    createFakeQuizs() {
      let quiz1 = new Quiz("Rolstoel");
      let question1 = new Question("Hoeveel wielen heeft een rolstoel?", "twee");
      let question2 = new Question("Ut sem nulla pharetra diam sit amet?", "id diam");
      let question3 = new Question("Vestibulum lectus mauris ultrices eros in cursus turpis?", "dolor sed");
      quiz1.addQuestion(question1);
      quiz1.addQuestion(question2);
      quiz1.addQuestion(question3);

      let quiz2 = new Quiz("Blinden");
      let question4 = new Question("Kan iemand die blind is zien?", "nee");
      quiz2.addQuestion(question4);
      quiz2.addQuestion(question2);
      quiz2.addQuestion(question3);

      return [quiz1, quiz2];
    },

    selectChange(event){
      this.selectedQuiz = this.getQuizWithTitle(event.target.value);
      this.$router.push("/admin/game-2/" + this.selectedQuiz.title);
      console.log(this.selectedQuiz)
    },

    getQuizWithTitle(title){
      for (let i = 0; i < this.quizzes.length; i++) {
        if (this.quizzes[i].title === title) {
          return this.quizzes[i]
        }
      }
    }

  }
}
</script>

<style scoped>

select {
  width: 25em;
}


</style>