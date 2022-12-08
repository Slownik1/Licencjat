package com.example.Licencjat;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SqlIncomingRepository extends IncomingRepository, JpaRepository<Incoming, Integer> {
}
