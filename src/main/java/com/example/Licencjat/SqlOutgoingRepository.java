package com.example.Licencjat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
interface SqlOutgoingRepository extends OutgoingRepository, JpaRepository<Outgoing, Integer> {


}
