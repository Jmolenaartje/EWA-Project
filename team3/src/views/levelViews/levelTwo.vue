<template>
  <div class="d-flex justify-content-center masthead bg-primary">

    <div v-if="showScore">
      <b-card id="score" title="Results"> You Scored {{ score }} of {{ questions.length }}</b-card>
    </div>

    <div class="questions" v-else>
      <span v-if="!startQuiz">
        <b-card src="../../assets/img/logoLevels/Q&a.png" img-alt="" title="Awareness Quizz" class="mb-2">
          <b-card-text id="titleText" class="d-flex justify-content-center">Welcome to the quiz, Here you will get
            several questions to test your awareness and knowledge.<br><br></b-card-text>
          <b-button id="startingButton" class="d-flex justify-content-center" @click="start()">Start Quiz</b-button>
         </b-card>
    </span>

      <span v-else>
    <b-card title="Simple Quiz Application" class="mb-2 justify-content-center">
      <b-card-text id="questionAmount">
       Question No.{{ currentQuestion + 1 }} of {{ questions.length }}
     <b-progress id="progress" class="d-flex justify-content-center" variant="warning" :value="countDown"></b-progress><br><br>
    </b-card-text>
      <b-card-text>
        <span id="counter" class="d-flex justify-content-center">{{ countDown }}</span>
      </b-card-text>
      <b-card-text class="d-flex justify-content-center"> {{ questions[currentQuestion].questionText }} </b-card-text>
      <div class="answer-section"> <br>
        <b-button id="clicking" :key="index" v-for="(option, index) in questions[currentQuestion].answerOptions"
                  @click="handleAnswerClick(option.isCorrect)" class="ans-option-btn d-flex justify-content-center bg-primary rounded"
                  variant="primary">{{ option.answerText }}</b-button>
      </div>
  </b-card>
    </span>
    </div>
  </div>
</template>

<script>
export default {
  name: "levelTwo",
  data() {
    return {
      currentQuestion: 0,
      showScore: false,
      score: 0,
      countDown: 30,
      timer: null,
      startQuiz: false,
      questions: [
        {
          questionText: 'what % of people in the Netherlands have a chronic condition ?',
          answerOptions: [
            {answerText: '15%', isCorrect: false},
            {answerText: '32%', isCorrect: false},
            {answerText: '58%', isCorrect: true},
            {answerText: '74%', isCorrect: false},
          ],
        },
        {
          questionText: 'Approximately how many Dutch people use a wheelchair?',
          answerOptions: [
            {answerText: '50000 - 80000', isCorrect: false},
            {answerText: '150000 - 180000', isCorrect: false},
            {answerText: '220000 - 250000', isCorrect: true},
            {answerText: '280000 - 310000', isCorrect: false},
          ],
        },
        {
          questionText: 'The Paralympics are for people with disabilities. ',
          answerOptions: [
            {answerText: 'Correct', isCorrect: true},
            {answerText: 'Incorrect', isCorrect: false},
          ],
        },
        {
          questionText: 'Which one of these is an example of direct discrimination?',
          answerOptions: [
            {answerText: 'Asking someone with a wheelchair to work downstairs', isCorrect: false},
            {answerText: 'only advertising a job on the internet', isCorrect: false},
            {answerText: 'Refusing access to a promotion for an autistic worker', isCorrect: true},
          ],
        },
        {
          questionText: 'You should not pet a service or guide dog while they are working because ' +
              'petting them will distract them from working. ',
          answerOptions: [
            {answerText: 'Incorrect', isCorrect: false},
            {answerText: 'Correct', isCorrect: true},
          ],
        },
        {
          questionText: 'For a disability to be covered by the Equality Act, how long must the person have had the condition?',
          answerOptions: [
            {answerText: '12 months or more', isCorrect: true},
            {answerText: '2 year or more', isCorrect: false},
            {answerText: '6 months or more', isCorrect: false},
            {answerText: '1 month or more', isCorrect: false},
          ],
        },
      ],
    }
  },
  methods: {
    start() {
      this.startQuiz = true
      this.countDownTimer()
    },

    handleAnswerClick(isCorrect) {
      clearTimeout(this.timer);
      let nextQuestion = this.currentQuestion + 1;
      if (isCorrect) {
        this.score = this.score + 1;
      }
      if (nextQuestion < this.questions.length) {
        this.currentQuestion = nextQuestion;
        this.countDown = 30;
        this.countDownTimer();
      } else {
        this.showScore = true;
      }
    },

    countDownTimer() {
      if (this.countDown > 0) {
        this.timer = setTimeout(() => {
          this.countDown -= 1
          this.countDownTimer()
        }, 1000)
      } else {
        this.handleAnswerClick(false)
      }
    }
  },
}
</script>

<style scoped>

#titleText, #questionAmount{
  text-align: center;
  font-size: 20px;
}

#startingButton {
  font-size: 40px;
}

#counter, #score {
  font-size: 60px;
  font-weight: bold;
}

.questions {
  min-width: 80%;
}

.ans-option-btn {
  min-width: 50%;
  font-size: 16px;
  color: black;
  align-items: center;
  cursor: pointer;
  margin-bottom: 5px;
}

.answer-section {
  width: 100%;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
}
</style>