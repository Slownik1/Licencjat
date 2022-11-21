package com.example.Licencjat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@RepositoryRestResource
interface outgoingsRepository extends JpaRepository<outgoingModel, Id> {



}
