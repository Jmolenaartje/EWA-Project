package com.example.server.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class User {

//    id
//name
//password
//email
//phonenumber

    //total score
    private UUID id;
    private String name;
    private String email;
    private String password;

    public User(@JsonProperty("id") UUID id, @JsonProperty("name") String name, @JsonProperty("email") String email, @JsonProperty("password") String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
