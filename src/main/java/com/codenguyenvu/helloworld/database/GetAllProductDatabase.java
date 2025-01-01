package com.codenguyenvu.helloworld.database;

import com.codenguyenvu.helloworld.usecase.entity.HangHoa;
import com.codenguyenvu.helloworld.usecase.interfaces.DatabaseBoundary;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GetAllProductDatabase implements DatabaseBoundary {
    EntityManager em;

    public GetAllProductDatabase(EntityManager em) {
        this.em = em;
    }

    public List<HangHoa> getAll() {
        return em.createQuery("from HangHoa", HangHoa.class).getResultList();
    }
}
