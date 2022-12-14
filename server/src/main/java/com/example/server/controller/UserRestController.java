package com.example.server.controller;

import com.example.server.model.User;
import com.example.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("user")
@RestController
@CrossOrigin("http://localhost:8080/")
public class UserRestController {
    private final UserService userService;



    @Autowired
    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String addUser(@RequestBody User user) {
        userService.addUser(user);
        return "saved...";
    }
    @GetMapping(path = "/all")
    public List<User> getAllUsers (){
        return userService.getAllUser();
    }

    @GetMapping(path = "{id}")
    public User getUserById(@PathVariable("id") int id){

        return userService.getUserById(id).orElseThrow(IllegalAccessError::new);
    }
@DeleteMapping(path = "{id}")
    public void deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
    }
@PutMapping(path = "{id}")
    public void updateUser(@PathVariable("id") int id, @RequestBody User userUpdate){
        userService.updateUser(id,userUpdate);

    }
@PutMapping(path = "{id}/updateName")
    public void updateUserName(@PathVariable("id") int id, @RequestBody User userUpdate){
        userService.updateUserName(id,userUpdate);
    }
@PutMapping(path = "{id}/updateEmail")
    public void updateUserEmail(@PathVariable("id") int id, @RequestBody User userUpdate){
        userService.updateUserEmail(id,userUpdate);
    }
@PutMapping(path = "{id}/updatePassword")
    public void updateUserPassword(@PathVariable("id") int id, @RequestBody User userUpdate){
        userService.updateUserPassword(id,userUpdate);
    }


}
