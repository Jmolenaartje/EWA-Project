package com.example.server.models;

import javax.persistence.*;

@Entity
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    //todo have it so there are many questions connected to one quiz

    private String name;
    private String description;

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
}