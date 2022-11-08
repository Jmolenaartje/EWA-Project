package com.example.server.dao;

import com.example.server.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("QuizMysqlDAO")
public class QuizMysqlDAO implements QuizDAO{

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public QuizMysqlDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    private RowMapper<Quiz> mapQuiz() {
        return (resultSet, i) -> {
            String idStr = resultSet.getString("id");
            String name = resultSet.getString("name");

            return new Quiz(
                    Integer.parseInt(idStr),
                    name
            );
        };
    }

    @Override
    public int insertQuiz(Quiz quiz) {
        String sql = " INSERT INTO quiz (id, name) VALUES(?, ?)";
        return jdbcTemplate.update(sql, 0, quiz.getName());
    }

    @Override
    public List<Quiz> selectAllQuizzes() {
        String sql = "SELECT * FROM quiz";

        return jdbcTemplate.query(sql, mapQuiz());
    }

    @Override
    public Optional<Quiz> selectQuizById(int id) {
        return Optional.empty();
    }

    @Override
    public int deleteQuizById(int id) {
        String sql = "" +
                "DELETE FROM quiz " +
                "WHERE id = ?";

        return jdbcTemplate.update(sql, id);
    }

    @Override
    public int updateQuizById(int id, Quiz quiz) {
        return 0;
    }

    @Override
    public int updateQuizName(int id, Quiz quiz) {
        String sql = "" + "UPDATE quiz " +
                "SET name = ? " +
                "WHERE id = ?";

        return jdbcTemplate.update(sql, quiz.getName(), id);
    }
}
