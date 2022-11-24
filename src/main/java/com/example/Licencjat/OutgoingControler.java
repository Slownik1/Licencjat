package com.example.Licencjat;


import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class OutgoingControler {

    private final OutgoingRepository outgoingRepository;

    public OutgoingControler(OutgoingRepository outgoingRepository) {
        this.outgoingRepository = outgoingRepository;
    }

    @GetMapping(value="/outgoings", params={"!sort", "!page", "!size"})
    ResponseEntity<?> readAllOutgoings(){
        return ResponseEntity.ok(outgoingRepository.findAll());
    }

    @GetMapping(value="/outgoings")
    ResponseEntity<?>readAllOutgoingAndSortByAmount(Pageable page){
        return ResponseEntity.ok(outgoingRepository.findAll(page));
    }

    @GetMapping("/outgoings/{id}")
    ResponseEntity<?> readOutgoingById(@PathVariable int id){
        return ResponseEntity.ok(outgoingRepository.findById(id));
    }

    @PostMapping("/outgoings")
    public ResponseEntity<?> addNewOutgoings(@RequestBody @Valid Outgoing outgoing){
        return ResponseEntity.ok(outgoingRepository.save(outgoing));
    }

    @PutMapping("/outgoings/{id}")
    ResponseEntity<?>updateOutgoing(@PathVariable int id, @RequestBody @Valid Outgoing updatedOutgoing){
        if(!outgoingRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        outgoingRepository.save(updatedOutgoing);
        return ResponseEntity.noContent().build();
    }

}
