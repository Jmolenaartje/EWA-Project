package com.example.server.repositories;

import com.example.server.models.AgendaItem;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;


@Repository("AgendaItem.JPA")
@Transactional
public class AgendaItemRepository implements EntityRepository<AgendaItem>{

    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public List<AgendaItem> findAll() {
        TypedQuery<AgendaItem> query =
                this.entityManager.createQuery(
                        "select a from AgendaItem a", AgendaItem.class);
                return query.getResultList();
    }

    @Override
    public AgendaItem findById(int id) {
        return this.entityManager.find(AgendaItem.class, id);
    }

    @Override
    public AgendaItem save(AgendaItem agendaItem) {
        return this.entityManager.merge(agendaItem);
    }

    @Override
    public AgendaItem deleteById(int id) {
        AgendaItem agendaItem = this.findById(id);
        this.entityManager.remove(agendaItem);
        return agendaItem;
    }

    @Override
    public AgendaItem updateById(int id, AgendaItem agendaItem) {
        AgendaItem agendaItemUpdate = findById(id);
        if (agendaItemUpdate==null){
            return null;
        }
        agendaItemUpdate.setCapacity(agendaItem.getCapacity());
        agendaItemUpdate.setDescription(agendaItem.getDescription());
        agendaItemUpdate.setEndDate(agendaItem.getEndDate());
        agendaItemUpdate.setGameLevel(agendaItem.getGameLevel());
        agendaItemUpdate.setLeader(agendaItem.getLeader());
        agendaItemUpdate.setLocation(agendaItem.getLocation());
        agendaItemUpdate.setStartDate(agendaItemUpdate.getStartDate());
        agendaItemUpdate.setUserId(agendaItem.getUserId());
        agendaItemUpdate.setTitle(agendaItem.getTitle());
        return agendaItemUpdate;
    }

    @Override
    public List<AgendaItem> findByQuery(String jpqlName, Object... params) {
        TypedQuery<AgendaItem> query =
                this.entityManager.createNamedQuery(jpqlName, AgendaItem.class);

        for (int i = 0; i < params.length; i++) {
            query.setParameter(i+1, params[i]);
        }

        return query.getResultList();
    }
}
