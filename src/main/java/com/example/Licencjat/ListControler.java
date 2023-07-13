package com.example.Licencjat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
public class ListControler {

    @GetMapping("/list")
    public List<String> getListItem(){
        return List.of("1","2","3");
    }

}
