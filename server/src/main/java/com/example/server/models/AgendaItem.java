package com.example.server.models;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity

public class AgendaItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String title;
    private String description;
    private String leader;
    private int userId;
    private String location;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String gameLevel;
    private int capacity;

    public AgendaItem(int id) {
        this.id = id;
    }

    public AgendaItem() {
    }

    public AgendaItem(int id, String title, String description, String leader, int userId, String location,
                      LocalDateTime startDate, LocalDateTime endDate, String gameLevel, int capacity) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.leader = leader;
        this.userId = userId;
        this.location = location;
        this.startDate = startDate;
        this.endDate = endDate;
        this.gameLevel = gameLevel;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLeader() {
        return leader;
    }

    public void setLeader(String leader) {
        this.leader = leader;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public String getGameLevel() {
        return gameLevel;
    }

    public void setGameLevel(String gameLevel) {
        this.gameLevel = gameLevel;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
