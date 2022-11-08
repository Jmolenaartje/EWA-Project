package com.example.server.dao;

import com.example.server.model.Quiz;

import java.util.List;
import java.util.Optional;

public interface QuizDAO {
    int insertQuiz(Quiz quiz);
    List<Quiz> selectAllQuizzes();

    Optional<Quiz> selectQuizById(int id);
    int deleteQuizById(int id);

    int updateQuizById(int id, Quiz quiz);
    int updateQuizByDescription(int id, Quiz quiz);
    int updateQuizName(int id, Quiz quiz);
}
