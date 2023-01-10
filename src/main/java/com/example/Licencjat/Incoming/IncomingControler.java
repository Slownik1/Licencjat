package com.example.Licencjat.Incoming;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
public class IncomingControler {

    private final IncomingRepository incomingRepository;

    public IncomingControler(IncomingRepository incomingRepository) {
        this.incomingRepository = incomingRepository;
    }


    @GetMapping(value="/incomings", params={"!sort", "!page", "!size"})
    ResponseEntity<?> readAllIncomings(){
        return ResponseEntity.ok(incomingRepository.findAll());
    }

    @GetMapping(value="/incomings")
    ResponseEntity<?> readAllIncomingssAndSortByAmount(){return ResponseEntity.ok(incomingRepository.findAll());}

    @GetMapping(value="/incoming/{id}")
    ResponseEntity<?> readIncomingById(@PathVariable int id){
        return ResponseEntity.ok(incomingRepository.findById(id));
    }

    @PostMapping(value="/incomings")
    String addNewIncomings(@ModelAttribute Incoming incoming, Model model) {
        incomingRepository.save(incoming);
        return "index";
    }

    @PutMapping(value="/incomings/{id}")
    ResponseEntity<?> updateIncomings(@PathVariable int id, @RequestBody Incoming updatedIncoming){
        if(!incomingRepository.existsById(id)){
            return ResponseEntity.notFound().build();
        }
        else {
            incomingRepository.save(updatedIncoming);
            return ResponseEntity.notFound().build();
        }

    }

}
