package com.example.server.dao;

import com.example.server.model.Score;

import java.util.List;
import java.util.Optional;

public interface ScoreDAO {

    int insertScore(Score user);
    List<Score> selectAllScore();

    public Optional<Score> selectedScoreById(int id);

    int deleteScoreById(int id);

    int updateScoreById(int id,Score score);

    int updateScore(int id,Score score);



}
