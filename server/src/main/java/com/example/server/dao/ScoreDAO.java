package com.example.server.dao;

import com.example.server.model.Score;
import com.example.server.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ScoreDAO {

    int insertScore(Score user);
    List<Score> selectAllScore();

    public Optional<Score> selectedScoreById(int id);

    int deleteScoreById(int id);

    int updateScoreById(int id,Score score);

    int updateScore(int id,Score score);



}
