package com.example.server.dao;

import com.example.server.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {

    int insertUser(int id,User user);
    default int insertUser(User user){
        int id = (int) (Math.random()*100);
        System.out.println(id);
        return insertUser(id,user);
    }

    List<User> selectAllUser();

    public Optional<User>selectedUserById(int id);

    int deleteUserById(int id);

    int updateUserById(int id,User user);


};

