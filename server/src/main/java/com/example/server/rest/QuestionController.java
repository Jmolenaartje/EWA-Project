package com.example.server.rest;

import com.example.server.exceptions.NotFoundException;
import com.example.server.models.Question;
import com.example.server.repositories.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("Questions")
public class QuestionController {

    @Autowired
    EntityRepository<Question> questionEntityRepository;

    @GetMapping
    public List<Question> getAllQuestions(){
        return this.questionEntityRepository.findAll();
    }

    //todo make it so you get every question for a Quiz

    @Transactional
    @PostMapping(path = "add")
    public ResponseEntity<Question> addQuestion(@RequestBody Question newQuestion) {
        Question addedQuestion = this.questionEntityRepository.save(newQuestion);
        return ResponseEntity.ok().body(addedQuestion);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Question> getOneQuestion(@PathVariable() int id) {
        Question question = this.questionEntityRepository.findById(id);

        if (question == null) {
            throw new NotFoundException(String.format("Question not found in database with id %d", id));
        }
        return ResponseEntity.ok().body(question);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Question> updateQuestion(@RequestBody Question newQuestion, @PathVariable() int id) {
        Question addedQuestion = this.questionEntityRepository.updateById(id, newQuestion);

        if (addedQuestion == null) {
            throw new NotFoundException(String.format("Question not found in database with id %d", id));
        }
        return ResponseEntity.ok().body(addedQuestion);
    }
}
