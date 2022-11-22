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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RepositoryRestController
public class outgoingControler {

    private final outgoingsRepository outgoingsRepository;

    public outgoingControler(outgoingsRepository outgoingsRepository) {
        this.outgoingsRepository = outgoingsRepository;
    }

    @GetMapping(value="/outgoingModels", params={"!sort", "!page", "!size"})
    ResponseEntity<?> readAllOutgoings(){
        return ResponseEntity.ok(outgoingsRepository.findAll());
    }

    @GetMapping(value="/outgoingModels")
    ResponseEntity<?>readAllTaskAndSortByAmount(Pageable page){
        return ResponseEntity.ok(outgoingsRepository.findAll(page));
    }

}
