export class Quiz {
    title;
    questions = [];


    constructor(title) {
        this.title = title;
    }

    addQuestion(question) {
        this.questions[this.questions.length] = question;
    }

}