package com.example.Licencjat;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import javax.validation.Valid;
import java.util.List;
import java.util.logging.Logger;

@RepositoryRestController
public class outgoingControler {

    private final outgoingsRepository outgoingsRepository;

    public outgoingControler(outgoingsRepository outgoingsRepository) {
        this.outgoingsRepository = outgoingsRepository;
    }

    @GetMapping(value="/outgoings", params={"!sort", "!page", "!size"})
    ResponseEntity<?> readAllOutgoings(){
        return ResponseEntity.ok(outgoingsRepository.findAll());
    }

    @GetMapping(value="/outgoings")
    ResponseEntity<?>readAllOutgoingAndSortByAmount(Pageable page){
        return ResponseEntity.ok(outgoingsRepository.findAll(page));
    }

    @GetMapping("/outgoings/{id}")
    ResponseEntity<?> readOutgoingById(@PathVariable Id id){
        return ResponseEntity.ok(outgoingsRepository.findById(id));
    }

    @PutMapping("/outgoings/{id}")
    ResponseEntity<?>updateOutgoing(@PathVariable Id id, @RequestBody @Valid outgoing updatedOutgoing){
        if(!outgoingsRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        outgoingsRepository.save(updatedOutgoing);
        return ResponseEntity.noContent().build();
    }

}
