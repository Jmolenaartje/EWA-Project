package com.example.server.dao;

import com.example.server.model.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("UserMysqlDao")
public class UserMysqlDao implements UserDao{

    private final JdbcTemplate jdbcTemplate;

    public UserMysqlDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertUser(UUID id, User user) {
        String sql= " INSERT INTO user (id, name, email, password)VALUES(? , ?, ?,?)";

        return jdbcTemplate.update(sql,id,user.getName(),user.getEmail(), user.getPassword());
    }

    @Override
    public List<User> selectAllUser() {
        return null;
    }

    @Override
    public Optional<User> selectedUserById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteUserById(UUID id) {
        return 0;
    }

    @Override
    public int updateUserById(UUID id, User user) {
        return 0;
    }
}
