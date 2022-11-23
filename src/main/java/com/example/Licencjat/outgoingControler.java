package com.example.Licencjat;


import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

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
    ResponseEntity<?> readOutgoingById(@PathVariable int id){
        return ResponseEntity.ok(outgoingsRepository.findById(id));
    }

    @PostMapping("/outgoings")
    ResponseEntity<?> addNewOutgoings(@RequestBody @Valid Outgoing outgoing){
        return ResponseEntity.ok(outgoingsRepository.save(outgoing));
    }

    @PutMapping("/outgoings/{id}")
    ResponseEntity<?>updateOutgoing(@PathVariable int id, @RequestBody @Valid Outgoing updatedOutgoing){
        if(!outgoingsRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        outgoingsRepository.save(updatedOutgoing);
        return ResponseEntity.noContent().build();
    }

}
