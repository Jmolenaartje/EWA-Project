package com.example.server.controller;

import com.example.server.model.Quiz;
import com.example.server.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("quiz")
@RestController
@CrossOrigin("http://localhost:8080/")
public class QuizRestController {
    private final QuizService quizService;

    @Autowired
    public QuizRestController(QuizService quizService) {
        this.quizService = quizService;
    }

    @PostMapping
    public String addQuiz(@RequestBody Quiz quiz) {
        quizService.addQuiz(quiz);
        return "The Quiz is saved!";
    }

    @GetMapping(path = "/all")
    public List<Quiz> getAllQuizzes() {
        return quizService.getAllQuizzes();
    }

    @GetMapping(path = "{id}")
    public Quiz getQuizById(@PathVariable("id") int id) {
        return quizService.getQuizById(id).orElseThrow(IllegalAccessError::new);
    }

    @DeleteMapping(path = "{id}")
    public void deleteQuiz(@PathVariable("id") int id) {
        quizService.deleteQuiz(id);
    }

    @PutMapping(path = "{id}")
    public void updateQuiz(@PathVariable("id") int id, @RequestBody Quiz quizUpdate) {
        quizService.updateQuiz(id, quizUpdate);
    }

    @PutMapping(path = "{id}/updateDescription")
    public void updateQuizDescription(@PathVariable("id") int id, @RequestBody Quiz quizUpdate) {
        quizService.updateQuizDescription(id, quizUpdate);
    }

    @PutMapping(path = "{id}/updateName")
    public void updateQuizName(@PathVariable("id") int id, @RequestBody Quiz quizUpdate) {
        quizService.updateQuizName(id, quizUpdate);
    }



}
