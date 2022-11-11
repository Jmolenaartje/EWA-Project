package com.example.server.repositories;

import com.example.server.models.User;

import java.util.List;

public interface EntityRepository<E> {
    List<E> findAll();

    E findById(int id);

    E save(E entity);

    E deleteById(int id);

    E updateById(int id, E entity);


    List<E> findByQuery(String jpqlName, Object... params);

}
