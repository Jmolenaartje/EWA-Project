package com.example.server.dao;

import com.example.server.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository("UserMysqlDao")
public class UserMysqlDao implements UserDao{

    private final JdbcTemplate jdbcTemplate;
@Autowired
    public UserMysqlDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertUser(int id, User user) {
        String sql= " INSERT INTO user (id, name, email, password)VALUES(? , ?, ?,?)";

        return jdbcTemplate.update(sql,id,user.getName(),user.getEmail(), user.getPassword());
    }

    @Override
    public List<User> selectAllUser() {

        String sql = "SELECT * FROM user";

        return jdbcTemplate.query(sql,mapUser());
    }
    private RowMapper<User> mapUser() {
        return (resultSet, i) -> {
            String idStr = resultSet.getString("id");
            String name = resultSet.getString("name");
            String email = resultSet.getString("email");
            String password = resultSet.getString("password");

            return new User(
                    Integer.parseInt(idStr),
                    name,
                    email,
                    password
            );
        };
    }

    @Override
    public Optional<User> selectedUserById(int id) {
        return Optional.empty();
    }

    @Override
    public int deleteUserById(int id) {
        String sql = "" +
                "DELETE FROM user " +
                "WHERE id = ?";

        return jdbcTemplate.update(sql, id);

    }

    @Override
    public int updateUserById(int id, User user) {
        return 0;
    }

    @Override
    public int updateUserName(int id, User user) {
        String sql = "" +
                "UPDATE user " +
                "SET name = ? " +
                "WHERE id = ?";
        return jdbcTemplate.update(sql, user.getName(), id);

    }

    @Override
    public int updateUserEmail(int id, User user) {
        String sql = "" +
                "UPDATE user " +
                "SET email = ? " +
                "WHERE id = ?";
        return jdbcTemplate.update(sql, user.getEmail(), id);

    }

    @Override
    public int updateUserPassword(int id, User user) {
        String sql = "" +
                "UPDATE user " +
                "SET password = ? " +
                "WHERE id = ?";
        return jdbcTemplate.update(sql, user.getPassword(), id);

    }
}
