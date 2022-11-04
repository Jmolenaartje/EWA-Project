package com.example.server.service;

import com.example.server.dao.QuestionDAO;
import com.example.server.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class QuestionService {
    private final QuestionDAO questionDAO;

    @Autowired
    public QuestionService(@Qualifier("FakeQuestionDAO") QuestionDAO questionDAO) {
        this.questionDAO = questionDAO;
    }

    public int addQuestion(Question question) {
        return questionDAO.insertQuestion(question);
    }

    public List<Question>getAllQuestions() {
        return questionDAO.selectAllQuestions();
    }

    public Optional<Question> getQuestionById(int id) {
        return questionDAO.selectedQuestionById(id);
    }

    public int deleteQuestion(int id) {
        return questionDAO.deleteQuestionById(id);
    }
    public int updateQuestion(int id, Question newQuestion) {
        return questionDAO.updateQuestionById(id, newQuestion);
    }
}
