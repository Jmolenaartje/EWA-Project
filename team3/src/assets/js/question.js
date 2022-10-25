export class Question {
    id = 0;
    static amountOfQuestions = 0;
    question = "";
    answer;
    score;

    constructor(question, answer, score) {
        this.id = Question.amountOfQuestions;
        Question.amountOfQuestions++;
        this.question = question;
        this.answer = answer;
        this.score = score;
    }
}