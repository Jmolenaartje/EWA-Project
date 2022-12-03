package com.example.server.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @OneToMany(mappedBy = "quiz")
    @JsonBackReference
    private Set<Question> questions = new HashSet<>();

    public boolean associateQuestion(Question question) {
        if (question != null && question.getQuiz() == null) {
            return this.getQuestions().add(question) && question.associateQuiz(this);
        }
        return false;
    }

    public Quiz(int id, String name, String description) {
        this(id);
        this.name = name;
        this.description = description;
    }

    public Quiz(int id) {
        this.id = id;
    }

    public Quiz() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }
}