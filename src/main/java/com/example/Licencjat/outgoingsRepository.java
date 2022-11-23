package com.example.Licencjat;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Id;
import java.util.Optional;

@RepositoryRestResource
interface outgoingsRepository extends JpaRepository<outgoing, Integer> {


}
