export class Question {
    id = 0;
    static amountOfQuestions = 0;
    question = "";
    answer;

    constructor(question, answer) {
        this.id = Question.amountOfQuestions;
        Question.amountOfQuestions++;
        this.question = question;
        this.answer = answer;
    }
}