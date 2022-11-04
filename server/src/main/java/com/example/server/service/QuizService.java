package com.example.server.service;

import com.example.server.dao.QuizDAO;
import com.example.server.model.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuizService {
    private final QuizDAO quizDAO;

    @Autowired
    public QuizService(@Qualifier("FakeQuizDAO") QuizDAO quizDAO) {
        this.quizDAO = quizDAO;
    }

    public int addQuiz(Quiz quiz) {
        return quizDAO.insertQuiz(quiz);
    }
    public List<Quiz> getAllQuizzes() {
        return quizDAO.selectAllQuizzes();
    }

    public Optional<Quiz> getQuizById(int id) {
        return  quizDAO.selectQuizById(id);
    }

    public int deleteQuiz(int id) {
        return quizDAO.deleteQuizById(id);
    }

    public int updateQuiz(int id, Quiz newQuiz) {
        return quizDAO.updateQuizById(id, newQuiz);
    }

    public int updateQuizName(int id, Quiz newQuiz) {
        return quizDAO.updateQuizName(id, newQuiz);
    }
}
