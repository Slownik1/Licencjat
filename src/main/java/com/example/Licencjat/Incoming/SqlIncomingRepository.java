package com.example.Licencjat.Incoming;

import com.example.Licencjat.Incoming.Incoming;
import com.example.Licencjat.Incoming.IncomingRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SqlIncomingRepository extends IncomingRepository, JpaRepository<Incoming, Integer> {
}
