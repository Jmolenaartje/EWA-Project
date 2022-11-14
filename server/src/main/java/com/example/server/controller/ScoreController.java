package com.example.server.controller;

import com.example.server.model.Score;
import com.example.server.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/score")
@RestController
public class ScoreController {

    private final ScoreService scoreService;


    @Autowired
    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @PostMapping
    public void addScore(@RequestBody Score score){
        scoreService.addScore(score);
    }
    @GetMapping
    public List<Score> getAllUsers (){
        return scoreService.getAllScore();
    }
    @GetMapping(path= "{id}")
    public Score getScoreById(@PathVariable("id") int id){
        return scoreService.getScoreById(id).orElseThrow(null);

    }
    @DeleteMapping(path= "{id}")
    public void deleteScoreById(@PathVariable("id")int id){
    }
    @PutMapping
    public void  updateScore(@PathVariable("id")int id,@RequestBody Score scoreToUpdate){
        scoreService.updateScore(id, scoreToUpdate);
    }



}
