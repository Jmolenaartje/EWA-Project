package com.example.server.repositories;

import com.example.server.models.Question;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository("Question.JPA")
@Transactional
public class QuestionRepository implements EntityRepository<Question>{

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<Question> findAll() {
        TypedQuery<Question> query =
                this.entityManager.createQuery(
                        "select que from Question que", Question.class);
                return query.getResultList();
    }

    @Override
    public Question findById(int id) {
        return this.entityManager.find(Question.class, id);
    }

    @Override
    public Question save(Question question) {
        return this.entityManager.merge(question);
    }

    @Override
    public Question deleteById(int id) {
        Question question = this.findById(id);
        this.entityManager.remove(question);
        return question;
    }

    @Override
    public Question updateById(int id, Question question) {
        Question questionUpdate = findById(id);
        if (questionUpdate == null) {
            return null;
        }

        questionUpdate.setQuizId(question.getQuizId());
        questionUpdate.setQuestion(question.getQuestion());
        questionUpdate.setAnswer(question.getAnswer());

        return questionUpdate;
    }

    @Override
    public List<Question> findByQuery(String jpqlName, Object... params) {
        TypedQuery<Question> query =
                this.entityManager.createNamedQuery(jpqlName, Question.class);

        for (int i = 0; i < params.length; i++) {
            query.setParameter(i + 1, params[i]);
        }
        return query.getResultList();
    }
}
