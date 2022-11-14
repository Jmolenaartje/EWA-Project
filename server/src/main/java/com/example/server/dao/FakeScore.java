package com.example.server.dao;

import com.example.server.model.Score;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("fakeDAO")
public class FakeScore implements ScoreDAO {

    private static List<Score> db = new ArrayList<>();

    @Override
    public int insertScore(Score score) {
        int id = score.getId() + (int) (Math.random() * 100);
        db.add(new Score(id, score.getGameId(), score.getUserIdGame(), score.getScore()));
        return 1;
    }

    @Override
    public List<Score> selectAllScore() {
        return db;
    }

    @Override
    public Optional<Score> selectedScoreById(int id) {
        return db.stream().filter(score -> score.getId() == id).findFirst();
    }

    @Override
    public int deleteScoreById(int id) {
        Optional<Score> optionalScore = selectedScoreById(id);
        if (optionalScore.isEmpty()) {
            return 0;
        }
        db.remove(optionalScore.get());
        return 1;
    }


    @Override
    public int updateScore(int id, Score score) {
        return 0;
    }

    @Override
    public int updateScoreById(int id, Score update) {

        return selectedScoreById(id)
                .map(s -> {
                    int indexofScoreToDelete = db.indexOf(update);
                    if (indexofScoreToDelete >= 0) {
                        db.set(indexofScoreToDelete, update);
                        return 1;
                    }
                    return 0;
                })
                .orElse(0);
    }
}