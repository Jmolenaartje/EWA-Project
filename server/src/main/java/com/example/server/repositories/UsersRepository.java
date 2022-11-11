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

    @Override
    public User deleteById(int id) {

        User user  = this.findById(id);
        this.entityManager.remove(user);
        return user;
    }

    @Override
    public User updateById(User entity) {
        this.entityManager.merge(entity);
        return entity;
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
}
