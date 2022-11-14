

package com.example.server.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Score {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int gameId;
    private int userIdGame;
    private int score;

    public Score(int id,
                 int gameId,
                 int userIdGame,
                 int score) {
        this.id = id;
        this.gameId = gameId;
        this.userIdGame = userIdGame;
        this.score = score;
    }
    public Score(int id) {
        this.id = id;
    }

    public Score() {

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

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public void setUserIdGame(int userIdGame) {
        this.userIdGame = userIdGame;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
