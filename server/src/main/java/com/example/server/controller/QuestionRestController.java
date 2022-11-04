package com.example.server.controller;

import com.example.server.model.Question;
import com.example.server.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("question")
@RestController
@CrossOrigin("http://localhost:8080/")
public class QuestionRestController {
    private final QuestionService questionService;

    @Autowired
    public QuestionRestController(QuestionService questionService) {
        this.questionService = questionService;
    }

    public String addQuestion(Question question) {
        questionService.addQuestion(question);
        return "Question is added!";
    }

    public List<Question> getAllQuestions() {
        return questionService.getAllQuestions();
    }

    public Question getQuestionById(@PathVariable("id") int id) {
        return questionService.getQuestionById(id).orElseThrow(IllegalAccessError::new);
    }

    public void deleteQuestion(@PathVariable("id") int id) {
        questionService.deleteQuestion(id);
    }
    public void updateQuestion(@PathVariable("id") int id, @RequestBody Question questionUpdate) {
        questionService.updateQuestion(id, questionUpdate);
    }
}
