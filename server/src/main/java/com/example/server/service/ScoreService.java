package com.example.server.service;

import com.example.server.dao.ScoreDAO;
import com.example.server.model.Score;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ScoreService {
    private final ScoreDAO scoreDAO;

    @Autowired
    public ScoreService(@Qualifier("fakeDAO") ScoreDAO scoreDAO) {
        this.scoreDAO = scoreDAO;
    }

    public  int addScore(Score score){
        return  scoreDAO.insertScore(score);
    }
    public List<Score> getAllScore(){
        return scoreDAO.selectAllScore();
    }

    public Optional<Score> getScoreById(int id){
        return scoreDAO.selectedScoreById(id);
    }
    public int deletePerson(int id){
        return scoreDAO.deleteScoreById(id);
    }
    public int updateScore(int id, Score newScore){
        return scoreDAO.updateScoreById(id, newScore);
    }
}
