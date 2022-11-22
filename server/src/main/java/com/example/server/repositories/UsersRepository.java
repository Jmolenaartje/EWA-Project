package com.example.server.repositories;

import com.example.server.models.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Repository("Users.JPA")
@Transactional
public class UsersRepository implements EntityRepository<User>{

    @PersistenceContext
    protected EntityManager entityManager;


    @Override
    public List<User> findAll() {
        TypedQuery<User> query =
                this.entityManager.createQuery(
                        "select u from User u", User.class);
        return query.getResultList();
    }

    @Override
    public User findById(int id) {

        return this.entityManager.find(User.class, id);
    }

    @Override
    public User save(User user) {
        return this.entityManager.merge(user);
    }



    public User updateById(int id,User user) {
       User userUpdate = findById(id);
       if (userUpdate==null){
           return null;
       }
       userUpdate.setName(user.getName());
       userUpdate.setEmail(user.getEmail());
        return userUpdate;
    }

    public User deleteById(int id) {
        User user = findById(id);
        this.entityManager.remove(user);
        return user;
    }



    @Override
    public List<User> findByQuery(String jpqlName, Object ...params) {
        TypedQuery<User> query =
                this.entityManager.createNamedQuery(jpqlName, User.class);

        for (int i = 0; i < params.length; i++) {
            query.setParameter(i+1, params[i]);
        }

        return query.getResultList();
    }

    /*
    Find user by username and password
     */
    public User findByUsernameAndPassword(String username, String password) {
        TypedQuery<User> query =
                this.entityManager.createQuery(
                        "select u from User u where u.userName = :username and u.password = :password", User.class);
        query.setParameter("username", username);
        query.setParameter("password", password);
        return query.getSingleResult();
    }
}
