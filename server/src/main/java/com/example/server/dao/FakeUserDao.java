package com.example.server.dao;

import com.example.server.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("fakeDao")
public class FakeUserDao implements UserDao {

    private static List<User> database = new ArrayList<>();

    @Override
    public int insertUser(UUID id, User user) {
        database.add(new User(id, user.getName(), user.getEmail(), user.getPassword()));
        return 0;
    }

    @Override
    public List<User> selectAllUser() {
        return database;
    }

    @Override
    public Optional<User> selectedUserById() {
        return Optional.empty();
    }

    @Override
    public int deletePersonById(UUID id) {
        return 0;
    }

    @Override
    public int updatePersonById(UUID id, User user) {
        return 0;
    }

}
