package com.example.server.rest;

import com.example.server.exceptions.NotFoundException;
import com.example.server.models.Quiz;
import com.example.server.repositories.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("Quizzes")
public class QuizController {

    @Autowired
    EntityRepository<Quiz> quizEntityRepository;

    @GetMapping
    public List<Quiz> getAllQuizzes() {
        return this.quizEntityRepository.findAll();
    }

    @Transactional
    @PostMapping(path = "add")
    public ResponseEntity<Quiz> addQuiz(@RequestBody Quiz newQuiz) {
        Quiz addedQuiz =  this.quizEntityRepository.save(newQuiz);
        return ResponseEntity.ok().body(addedQuiz);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Quiz> getOneQuiz(@PathVariable() int id) {
        Quiz quiz = this.quizEntityRepository.findById(id);

        if (quiz == null) {
            throw new NotFoundException(String.format("Quiz not found in database with id %d", id));
        }
        return ResponseEntity.ok().body(quiz);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Quiz> updateQuiz(@RequestBody Quiz newQuiz, @PathVariable() int id) {
        Quiz addedQuiz = this.quizEntityRepository.updateById(id, newQuiz);
        if (addedQuiz == null) {
            throw new NotFoundException(String.format("Quiz not found in database with id %d", id));
        }
        return ResponseEntity.ok().body(addedQuiz);
    }

}
