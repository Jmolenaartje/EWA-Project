package com.example.server.rest;

import com.example.server.exceptions.NotFoundException;
import com.example.server.models.User;
import com.example.server.repositories.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("users")
@CrossOrigin(origins = "http://localhost:8080")
public class UserController {
    @Autowired
    EntityRepository<User> usersRepo;

    @GetMapping(path = "all")
    public List<User> getAllUsers() {
        return this.usersRepo.findAll();
    }

    @Transactional
    @PostMapping(path = "add")
    public ResponseEntity<User> addUser(@RequestBody User newUser) {
        User addedUser = this.usersRepo.save(newUser);
        return ResponseEntity.ok().body(addedUser);
    }


    @GetMapping(path = "{id}")
    public ResponseEntity<User> getOneUser(@PathVariable() int id) {
        User user = this.usersRepo.findById(id);
        //TODO fix exception
        if (user == null) {
            throw new NotFoundException(String.format("user not found in database with id %d" , id));
        }
        return ResponseEntity.ok().body(user);
    }

    @PutMapping(path = "{id}")
    public ResponseEntity<User> updateUser(@RequestBody User newUser, @PathVariable() int id) {
        User addedUser = this.usersRepo.updateById(id, newUser);
        if (addedUser == null) {

            throw new NotFoundException(String.format("user not found in database with id %id",id));
        }
        return ResponseEntity.ok().body(addedUser);
    }

    @DeleteMapping(path = "{id}")
    public ResponseEntity<User> deleteUser(@PathVariable() int id) {
        User deletedUser = this.usersRepo.deleteById(id);
        return ResponseEntity.ok().body(deletedUser);
    }


}
