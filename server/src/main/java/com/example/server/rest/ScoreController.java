package com.example.server.rest;
import com.example.server.exceptions.NotFoundException;
import com.example.server.models.Score;
import com.example.server.repositories.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("score")
public class ScoreController {
    @Autowired
    EntityRepository<Score> scoreRepo;

    @GetMapping(path = "")
    public List<Score> getAllScore() {
        return this.scoreRepo.findAll();
    }

    @Transactional
    @PostMapping(path = "add")
    public ResponseEntity<Score> addScore(@RequestBody Score newScore) {
        Score addedScore = this.scoreRepo.save(newScore);
        return ResponseEntity.ok().body( addedScore);
    }


    @GetMapping(path = "{id}")
    public ResponseEntity<Score> getOneScore (@PathVariable() int id) {
        Score score = this.scoreRepo.findById(id);
        //TODO fix exception
        if (score == null) {
            throw new NotFoundException(String.format("not found in database with id %d", id));
        }
        return ResponseEntity.ok().body(score);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Score> updateScore (@RequestBody Score newScore, @PathVariable() int id) {
       Score updateScore = this.scoreRepo.updateById(id, newScore);
        if (updateScore == null) {

            throw new NotFoundException(String.format(" not found in database with id %id", id));
        }
        return ResponseEntity.ok().body(updateScore);
    }


}
