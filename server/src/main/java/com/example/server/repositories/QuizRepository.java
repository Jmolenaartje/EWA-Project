package com.example.server.repositories;

import com.example.server.models.Quiz;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository("Quizzes.JPA")
@Transactional
public class QuizRepository implements EntityRepository<Quiz> {

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<Quiz> findAll() {
        TypedQuery<Quiz> query =
                this.entityManager.createQuery(
                        "select qui from Quiz qui", Quiz.class);
        return query.getResultList();
    }

    @Override
    public Quiz findById(int id) {
        return this.entityManager.find(Quiz.class, id);
    }

    @Override
    public Quiz save(Quiz quiz) {
        return this.entityManager.merge(quiz);
    }

    @Override
    public Quiz deleteById(int id) {
        Quiz quiz = this.findById(id);
        this.entityManager.remove(quiz);
        return quiz;
    }

    @Override
    public Quiz updateById(int id, Quiz quiz) {
        Quiz quizUpdate = findById(id);

        if (quizUpdate == null) {
            return null;
        }

        quizUpdate.setName(quiz.getName());
        quizUpdate.setDescription(quiz.getDescription());
        return quizUpdate;
    }

    @Override
    public List<Quiz> findByQuery(String jpqlName, Object... params) {
        TypedQuery<Quiz> query =
                this.entityManager.createNamedQuery(jpqlName, Quiz.class);

        for (int i = 0; i < params.length; i++) {
            query.setParameter(i + 1, params[i]);
        }
        return query.getResultList();
    }
}
