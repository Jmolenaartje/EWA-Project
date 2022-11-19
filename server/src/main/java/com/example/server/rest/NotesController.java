package com.example.server.rest;

import com.example.server.models.Notes;
import com.example.server.repositories.EntityRepository;
import com.example.server.repositories.NotesRepository;
import org.apache.tomcat.util.json.JSONParser;
import org.aspectj.weaver.ast.Not;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("notes")
@CrossOrigin(origins = "http://localhost:8080")
public class NotesController {

    Logger logger = LoggerFactory.getLogger(NotesController.class);

    @Autowired
    NotesRepository notesRepo;

    @GetMapping(path = "")
    public Iterable<Notes> getAllNotes() {
        return this.notesRepo.findAll();
    }

    @Transactional
    @PostMapping(path = "add")
    public ResponseEntity<Notes> addNotes(@RequestBody Notes notes) {
        // add the notes to the database
        this.notesRepo.save(notes);

        // return the notes
        return ResponseEntity.ok(notes);
    }

    @GetMapping(path = "{id}")
    public ResponseEntity<Notes> getOneNotes(@PathVariable() int id) {
        Notes notes = this.notesRepo.findById(id);
        return ResponseEntity.ok().body(notes);
    }

    @GetMapping(path = "user/{id}")
    public ResponseEntity<Iterable<Notes>> getNotesByUserId(@PathVariable() int id) {
        Iterable<Notes> notes = this.notesRepo.findAllByUserId(id);
        return ResponseEntity.ok().body(notes);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<Notes> updateNotes(@RequestBody Notes newNotes, @PathVariable() int id) {
        Notes addedNotes = this.notesRepo.updateById(id, newNotes);
        return ResponseEntity.ok().body(addedNotes);
    }
}
