export class Question {
    id = 0;
    static amountOfQuestions = 0;
    question = "";
    answer1;
    answer2;
    answer3;
    answer4;
    score;

        constructor(question, answer1, answer2, answer3, answer4, score) {
            this.id = Question.amountOfQuestions;
            Question.amountOfQuestions++;
            this.question = question;
            this.answer1 = answer1;
            this.answer2 = answer2;
            this.answer3 = answer3;
            this.answer4 = answer4;
            this.score = score;
        }
}