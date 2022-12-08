package com.example.Licencjat;

import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IncomingRepository {

    List<Incoming> findAll();

    Optional<Incoming> findById(int i);

    Incoming save(Incoming entity);

    boolean existsById(int id);

    Object findAll(Pageable page);

}
