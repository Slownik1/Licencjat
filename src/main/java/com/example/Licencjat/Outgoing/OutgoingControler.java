package com.example.Licencjat.Outgoing;


import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.logging.Logger;

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

    @RequestMapping(value = "/outgoings", method = RequestMethod.POST)
    public String addNewOutgoings(@ModelAttribute Outgoing outgoing, Model model){
        outgoingRepository.save(outgoing);
        return "index";
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
