package com.example.Licencjat.Incoming;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
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
    public String addNewIncomings(@RequestBody Incoming incoming) {
        incomingRepository.save(incoming);
        return "main";
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
