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

    /**
     * this methode return the given id by search through the  user list with the stream function
     *
     * @param id
     * @return id
     */
    @Override
    public Optional<User> selectedUserById(UUID id) {
        return database.stream()
                .filter(user -> user.getId().equals(id)).findFirst();
    }

    @Override
    public int deleteUserById(UUID id) {
        Optional<User> optionalUser = selectedUserById(id);
        if (optionalUser.isEmpty()) {
            return 0;
        }
        database.remove(optionalUser.get());
        return 1;
    }

    @Override
    public int updateUserById(UUID id, User user) {

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
