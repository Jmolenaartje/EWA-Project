package com.example.server.repositories;

import com.example.server.models.Notes;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Repository("Notes.JPA")
@Transactional
public class NotesRepository implements EntityRepository<Notes>{

    @PersistenceContext
    protected EntityManager entityManager;


    @Override
    public List<Notes> findAll() {
        TypedQuery<Notes> query =
                this.entityManager.createQuery(
                        "select n from Notes n", Notes.class);
        return query.getResultList();
    }

    public List<Notes> findAllByUserId(int id) {
        // parse the id to a string moet voor de query?
        String idString = Integer.toString(id);
        TypedQuery<Notes> query =
                this.entityManager.createQuery(
                        "select n from Notes n where n.userId = :id", Notes.class);
        query.setParameter("id", idString);
        return query.getResultList();
    }

    @Override
    public Notes findById(int id) {
            return this.entityManager.find(Notes.class, id);
    }

    @Override
    public Notes save(Notes entity) {
        return this.entityManager.merge(entity);
    }

    @Override
    public Notes deleteById(int id) {
        Notes notes  = this.findById(id);
        this.entityManager.remove(notes);
        return notes;
    }

    @Override
    public Notes updateById(int id, Notes entity) {
        Notes notesUpdate = findById(id);
        if (notesUpdate==null){
            return null;
        }
        notesUpdate.setUserId(entity.getUserId());
        notesUpdate.setNote(entity.getNote());
        return notesUpdate;
    }

    @Override
    public List<Notes> findByQuery(String jpqlName, Object... params) {
        TypedQuery<Notes> query =
                this.entityManager.createQuery(jpqlName, Notes.class);

        for (int i = 0; i < params.length; i++) {
            query.setParameter(i + 1, params[i]);
        }
        return query.getResultList();
    }
}
