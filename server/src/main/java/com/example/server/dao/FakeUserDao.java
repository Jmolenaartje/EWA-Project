package com.example.server.dao;

import com.example.server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("FakeUserDao")
public class FakeUserDao implements UserDao {

    public FakeUserDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    private final JdbcTemplate jdbcTemplate;

    private static List<User> database = new ArrayList<>();

    @Override
    public int insertUser(int id, User user) {

        database.add(new User(id, user.getName(), user.getEmail(), user.getPassword()));
        return 0;
    }

    @Override
    public List<User> selectAllUser() {
        return database;
    }

    /**
     * this methode return the given id by search through the  user list with the stream function
     *
     * @param id
     * @return id
     */
    @Override
    public Optional<User> selectedUserById(int id) {
        return database.stream().filter(user -> user.getId() == id).findFirst();
    }

    @Override
    public int deleteUserById(int id) {
        Optional<User> optionalUser = selectedUserById(id);
        if (optionalUser.isEmpty()) {
            return 0;
        }
        database.remove(optionalUser.get());
        return 1;
    }

    @Override
    public int updateUserById(int id, User user) {

        return selectedUserById(id).map(u -> {

            int indexOfUserToDelete = database.indexOf(u);
            if (indexOfUserToDelete >= 0) {
                database.set(indexOfUserToDelete, new User(id,user.getName(), user.getEmail(), user.getPassword()));
                return 1;
            }
            return 0;
        }).orElse(0);

    }

}
