package com.example.server.service;

import com.example.server.dao.UserDao;
import com.example.server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("UserMysqlDao") UserDao userDao) {
        this.userDao = userDao;
    }

    public int addUser(User user) {
        return userDao.insertUser(user);
    }
    public List<User>getAllUser(){
        return userDao.selectAllUser();
    }

    public Optional<User> getUserById(int id){
        return userDao.selectedUserById(id);
    }
    public int deleteUser(int id){
        return userDao.deleteUserById(id);
    }
    public int updatePerson(int id,User newUser){
        return userDao.updateUserById(id,newUser);
    }

}
