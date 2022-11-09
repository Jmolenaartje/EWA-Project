package com.example.server.rest;

import com.example.server.models.User;
import com.example.server.repositories.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("users")
public class UserController {
    @Autowired
    EntityRepository<User> usersRepo;

    @GetMapping(path = "")
    public List<User> getAllUsers() {
        return this.usersRepo.findAll();
    }
    @Transactional
    @PostMapping(path = "add")
    public ResponseEntity<User> addUser(@RequestBody User newUser){
       User addedUser = this.usersRepo.save(newUser);
        return ResponseEntity.ok().body(addedUser);
    }
    

    @GetMapping(path = "{id}")
    public ResponseEntity<User> getOneAuthor(@PathVariable() int id) {
        User user = this.usersRepo.findById(id);
      //TODO fix exception
        if (user == null) {
            throw new RuntimeException("hij werkt niet");
        }
        return ResponseEntity.ok().body(user);
    }


}
