package com.example.server.rest;

import com.example.server.models.Notes;
import com.example.server.repositories.EntityRepository;
import com.example.server.repositories.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;

@RestController
@RequestMapping("notes")
public class NotesController {

    @Autowired
    NotesRepository notesRepo;

    @GetMapping(path = "")
    public Iterable<Notes> getAllNotes() {
        return this.notesRepo.findAll();
    }

    @Transactional
    @PostMapping(path = "add")
    public ResponseEntity<Notes> addNotes(@RequestBody Notes newNotes) {
        Notes addedNotes = this.notesRepo.save(newNotes);
        return ResponseEntity.ok().body(addedNotes);
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
