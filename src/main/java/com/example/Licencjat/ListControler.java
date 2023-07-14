package com.example.Licencjat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ListControler {

    @GetMapping("/lista")
    public List<String> getListItem(){
        return List.of("1","2","3");
    }

}
