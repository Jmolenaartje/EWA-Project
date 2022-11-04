package com.example.server.dao;

import com.example.server.model.Quiz;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class QuizMysqlDAO implements QuizDAO{

    private final JdbcTemplate jdbcTemplate;

    public QuizMysqlDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public int insertQuiz(Quiz quiz) {
        return 0;
    }

    @Override
    public List<Quiz> selectAllQuizzes() {
        return null;
    }

    @Override
    public Optional<Quiz> selectQuizById(int id) {
        return Optional.empty();
    }

    @Override
    public int deleteQuizById(int id) {
        return 0;
    }

    @Override
    public int updateQuizById(int id, Quiz quiz) {
        return 0;
    }

    @Override
    public int updateQuizName(int id, Quiz quiz) {
        return 0;
    }
}
