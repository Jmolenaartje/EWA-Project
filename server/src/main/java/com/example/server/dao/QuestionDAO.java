package com.example.server.dao;

import com.example.server.model.Question;

import java.util.List;
import java.util.Optional;

public interface QuestionDAO {

    int insertQuestion(Question question);
    List<Question> selectAllQuestions();

    public Optional<Question> selectedQuestionById(int id);
    int deleteQuestionById(int id);

    //public Optional<Question> selectedQuizIdById(int id);

    int updateQuestionById(int id, Question question);
    int updateQuizIdById(int id, Question question);
    int updateQuestionName(int id, Question question);
    int updateQuestionQuestion(int id, Question question);
    int updateQuestionAnswer(int id, Question question);

}
