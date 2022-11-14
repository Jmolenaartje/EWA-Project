package com.example.server.repositories;

import com.example.server.models.Score;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;
@Repository
@Transactional
public class ScoreRepository implements EntityRepository<Score>{

    @PersistenceContext
    protected EntityManager entityManager;
    @Override
    public List<Score> findAll() {
        TypedQuery<Score> query =
                this.entityManager.createQuery(
                        "select s from Score s", Score.class);
        return query.getResultList();
    }

    @Override
    public Score findById(int id) {

        return this.entityManager.find(Score.class, id);
    }

    @Override
    public Score save(Score score) {
        return this.entityManager.merge(score);
    }

    @Override
    public Score deleteById(int id) {

        Score score  = this.findById(id);
        this.entityManager.remove(score);
        return score;
    }

    @Override
    public Score updateById(int id, Score score) {
       Score scoreUpdate = findById(id);
        if (scoreUpdate==null){
            return null;
        }
        scoreUpdate.setScore(score.getScore());
        scoreUpdate.setGameId(score.getGameId());
        scoreUpdate.setUserIdGame(score.getUserIdGame());
        return scoreUpdate;
    }

    @Override
    public List<Score> findByQuery(String jpqlName, Object... params) {
        return null;
    }
}
