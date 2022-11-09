package com.example.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;


    private String password;

    public User() {
    }
    public User(int id) {
        this.id = id;
    }

    public User(int id,String email,String name){
        this(id);
        this.setEmail(email);
        this.setName(name);

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
