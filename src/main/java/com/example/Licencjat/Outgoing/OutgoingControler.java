package com.example.Licencjat.Outgoing;


import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
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

    @PostMapping(value = "/outgoings")
    public String addNewOutgoings(@RequestBody Outgoing outgoing){
        outgoingRepository.save(outgoing);
        return "main";
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
