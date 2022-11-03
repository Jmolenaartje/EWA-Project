package com.example.server.dao;

import com.example.server.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserDao {



    int insertUser(User user);
    List<User> selectAllUser();

    public Optional<User>selectedUserById(int id);

    int deleteUserById(int id);

    int updateUserById(int id,User user);
    int updateUserName(int id,User user);
    int updateUserEmail(int id,User user);
    int updateUserPassword(int id,User user);


};

