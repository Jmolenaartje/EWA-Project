package com.example.server.repositories;

import java.util.List;

public interface EntityRepository <E>{
    List<E> findAll();

    E findById(int id);
    E save(E entity);
    E deleteById(int id);

    E updateById (E entity);

    List<E> findByQuery(String jpqlName, Object... params);

}
