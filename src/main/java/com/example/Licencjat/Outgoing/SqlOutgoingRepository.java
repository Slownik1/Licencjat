package com.example.Licencjat.Outgoing;

import com.example.Licencjat.Outgoing.Outgoing;
import com.example.Licencjat.Outgoing.OutgoingRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface SqlOutgoingRepository extends OutgoingRepository, JpaRepository<Outgoing, Integer> {


}
