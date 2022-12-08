package com.example.Licencjat.Incoming;

import com.example.Licencjat.Incoming.Incoming;
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
