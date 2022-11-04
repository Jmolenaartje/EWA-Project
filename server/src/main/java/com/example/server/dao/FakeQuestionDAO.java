package com.example.server.dao;

import com.example.server.model.Question;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("FakeQuestionDAO")
public class FakeQuestionDAO implements QuestionDAO{

    private static List<Question> questionDatabase = new ArrayList<>();

    @Override
    public int insertQuestion(Question question) {
        int id = question.getId()+(int) (Math.random()*100);
        questionDatabase.add(new Question(id, question.getQuizId(),
                question.getName(),
                question.getQuestion(),
                question.getAnswer()));
        return 0;
    }

    @Override
    public List<Question> selectAllQuestions() {
        return questionDatabase;
    }

    @Override
    public Optional<Question> selectedQuestionById(int id) {
        return questionDatabase.stream().filter(question -> question.getId() == id).findFirst();
    }

    @Override
    public int deleteQuestionById(int id) {
        Optional<Question> optionalQuestion = selectedQuestionById(id);

        if (optionalQuestion.isEmpty()) {
            return 0;
        }
        questionDatabase.remove(optionalQuestion.get());
        return 1;
    }

    @Override
    public int updateQuestionById(int id, Question question) {
        return 0;
    }

    @Override
    public int updateQuizIdById(int id, Question question) {
        return 0;
    }

    @Override
    public int updateQuestionName(int id, Question question) {
        return 0;
    }

    @Override
    public int updateQuestionQuestion(int id, Question question) {
        return 0;
    }

    @Override
    public int updateQuestionAnswer(int id, Question question) {
        return 0;
    }
}
