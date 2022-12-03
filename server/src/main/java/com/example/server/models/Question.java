package com.example.server.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JsonManagedReference
    private Quiz quiz;

    public boolean associateQuiz(Quiz quiz) {
        if (quiz != null && this.getQuiz() == null) {
            quiz.associateQuestion(this);
            this.setQuiz(quiz);
            return true;
        }
        return false;
    }

    @JsonProperty("question")
    private String question;

    @JsonProperty("answer")
    private String answer;


    public Question(int id, Quiz quiz, String question, String answer) {
        this(id);
        this.quiz = quiz;
        this.question = question;
        this.answer = answer;
    }

    public Question(int id) {
        this.id = id;
    }

    public Question() {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
