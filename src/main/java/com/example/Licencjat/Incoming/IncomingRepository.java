package com.example.Licencjat.Incoming;

import com.example.Licencjat.Incoming.Incoming;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface IncomingRepository {

    List<Incoming> findAll();

    Optional<Incoming> findById(int i);

    Incoming save(Incoming entity);

    boolean existsById(int id);

    Object findAll(Pageable page);

}
