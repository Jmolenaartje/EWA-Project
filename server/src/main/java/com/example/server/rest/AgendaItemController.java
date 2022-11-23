package com.example.server.rest;


import com.example.server.exceptions.NotFoundException;
import com.example.server.models.AgendaItem;
import com.example.server.repositories.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("agenda-items")
@CrossOrigin(origins = "http://localhost:8080")
public class AgendaItemController {

    @Autowired
    EntityRepository<AgendaItem> agendaItemEntityRepository;

    @GetMapping
    public List<AgendaItem> getAllAgendaItems() {
        return this.agendaItemEntityRepository.findAll();
    }

    @Transactional
    @PostMapping(path = "add")
    public ResponseEntity<AgendaItem> addAgendaItem(@RequestBody AgendaItem newAgendaItem){
        AgendaItem addedAgendaItem = this.agendaItemEntityRepository.save(newAgendaItem);
        return ResponseEntity.ok().body(addedAgendaItem);
    }

    @GetMapping(path = "{id}")
    public  ResponseEntity<AgendaItem> getOneUser(@PathVariable() int id) {
        AgendaItem agendaItem = this.agendaItemEntityRepository.findById(id);
        //TODO fix exeption
        if (agendaItem == null) {
            throw new NotFoundException(String.format("Agenda item not found in database with id %d" , id));
        }
        return ResponseEntity.ok().body(agendaItem);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<AgendaItem> updateAgendaItem(@RequestBody AgendaItem agendaItem, @PathVariable() int id) {
        AgendaItem addedAgendaItem = this.agendaItemEntityRepository.updateById(id, agendaItem);
        if (addedAgendaItem == null) {
            throw new NotFoundException(String.format("Agenda item not found in database with id %d" , id));
        }
        return ResponseEntity.ok().body(addedAgendaItem);
    }

}
