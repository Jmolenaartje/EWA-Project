package com.example.server.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Score {
    private final int id;
    private final int gameId;
    private final int userIdGame;
    private final int score;

    public Score(@JsonProperty("id") int id,
                 @JsonProperty("gameId") int gameId,
                 @JsonProperty("userGameId") int userIdGame,
                 @JsonProperty("Score") int score) {
        this.id = id;
        this.gameId = gameId;
        this.userIdGame = userIdGame;
        this.score = score;
    }


    public int getId() {
        return id;
    }

    public int getGameId() {
        return gameId;
    }

    public int getUserIdGame() {
        return userIdGame;
    }

    public int getScore() {
        return score;
    }



}
