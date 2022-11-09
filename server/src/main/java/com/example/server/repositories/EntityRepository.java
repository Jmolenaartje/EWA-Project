package com.example.server.repositories;

import java.util.List;

public interface EntityRepository <E>{
    List<E> findAll();

    E findById(int id);        // finds one specific instance
    E save(E entity);           // saves the entity into the repo
    // creates a new instance if entity.id == 0
    // updates exisiting instance if entity.id != 0
    E deleteById(int id);      // deletes the instance identified by entity.getId()
    // returns the instance that has been deleted or null

    List<E> findByQuery(String jpqlName, Object... params);
    // finds all instances from a named jpql-query
}
