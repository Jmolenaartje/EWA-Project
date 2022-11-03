package com.example.server.service;

import com.example.server.dao.UserDao;
import com.example.server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserDao userDao;

    @Autowired
    public UserService(@Qualifier("FakeUserDao") UserDao userDao) {
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
    public int updateUser(int id, User newUser){
        return userDao.updateUserById(id,newUser);
    }
    public int updateUserName(int id, User newUser){
        return userDao.updateUserName(id,newUser);
    }
   public int updateUserEmail(int id, User newUser){
        return userDao.updateUserEmail(id,newUser);
    }
   public int updateUserPassword(int id, User newUser){
        return userDao.updateUserPassword(id,newUser);
    }

}
