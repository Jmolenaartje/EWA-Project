package com.example.server.dao;

import com.example.server.model.Quiz;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("FakeQuizDAO")
public class FakeQuizDAO implements QuizDAO{

    private final JdbcTemplate jdbcTemplate;

    private static List<Quiz> quizData = new ArrayList<>();

    public FakeQuizDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertQuiz(Quiz quiz) {
        int id = quiz.getId()+(int) (Math.random()*100);
        quizData.add(new Quiz(id, quiz.getDescription(), quiz.getName()));
        return 0;
    }

    @Override
    public List<Quiz> selectAllQuizzes() {
        return quizData;
    }

    @Override
    public Optional<Quiz> selectQuizById(int id) {
        return quizData.stream().filter(quiz -> quiz.getId() == id).findFirst();
    }

    @Override
    public int deleteQuizById(int id) {
        Optional<Quiz> optionalQuiz = selectQuizById(id);
        if (optionalQuiz.isEmpty()) {
            return 0;
        }
        quizData.remove(optionalQuiz.get());
        return 1;
    }

    @Override
    public int updateQuizById(int id, Quiz quiz) {

        return selectQuizById(id).map(u -> {
            int indexOfQuizToDelete = quizData.indexOf(u);
            if (indexOfQuizToDelete >= 0) {
                quizData.set(indexOfQuizToDelete, new Quiz(id, quiz.getDescription(), quiz.getName()));
                return 1;
            }
            return 0;
        }).orElse(0);
    }

    @Override
    public int updateQuizByDescription(int id, Quiz quiz) {
        return 0;
    }

    @Override
    public int updateQuizName(int id, Quiz quiz) {
        return 0;
    }
}
