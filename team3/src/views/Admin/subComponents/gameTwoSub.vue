<template>
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
      let quiz1 = new Quiz("Quiz 1");
      let question1 = new Question("Wat is 3 + 3", 2, 6, 5, 12, 50);
      let question2 = new Question("Wat is het volume van een kilo water?", "Een liter", "Een milliliter", "Een centiliter", "Een deciliter", 25);
      quiz1.addQuestion(question1);
      quiz1.addQuestion(question2);

      let quiz2 = new Quiz("Quiz 2");
      let question4 = new Question("Voor hoeveel procent bestaat een menselijk lichaam uit water?", "31%", "12%", "70%", "99%" ,10);
      quiz2.addQuestion(question4);

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