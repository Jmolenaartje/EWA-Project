package com.example.server.dao;

import com.example.server.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {

    int insertUser(UUID id,User user);
    default int insertUser(User user){
        UUID id = UUID.randomUUID();
        return insertUser(id,user);
    }

    List<User> selectAllUser();

    public Optional<User>selectedUserById();

    int deletePersonById(UUID id);

    int updatePersonById(UUID id,User user);

};

