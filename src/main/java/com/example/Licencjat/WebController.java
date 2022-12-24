package com.example.Licencjat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @GetMapping(value = "/index")
    public String Index(){
        return "index";
    }

    @GetMapping(value = "/income")
    public String Income(){
        return "income";
    }

    @GetMapping(value = "/outcome")
    public String Outcome(){
        return "outcome";
    }

}
