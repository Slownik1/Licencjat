package com.example.Licencjat;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OutgoingRepository {

        List<Outgoing> findAll();

        Optional<Outgoing> findById(int i);

        Outgoing save(Outgoing entity);

        boolean existsById(int id);

        Object findAll(Pageable page);
}
