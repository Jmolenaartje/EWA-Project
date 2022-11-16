package com.example.server.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String userId;

    private String note;


    public Notes(int id, String userId, String note) {
        this.id = id;
        this.userId = userId;
        this.note = note;
    }

    // Empty constructor
    public Notes() {
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    // tostring
    @Override
    public String toString() {
        return "Notes{" +
                "id=" + id +
                ", userId=" + userId +
                ", note='" + note + '\'' +
                '}';
    }


}
