package com.example.server.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String userName;

    private String email;


    private String password;



    private boolean isAdmin;

    public User() {
    }
    public User(int id) {
        this.id = id;
    }

    public User(int id,String email,String name,String password,String userName,boolean isAdmin){
        this(id);
        this.setEmail(email);
        this.setName(name);
        this.setUserName(userName);
        this.setPassword(password);
        this.setAdmin(isAdmin);



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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }
}
