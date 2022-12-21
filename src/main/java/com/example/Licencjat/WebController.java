package com.example.Licencjat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping(value = "/index")
    public String Index(){
        return "index";
    }

    @RequestMapping(value = "/income")
    public String Income(){
        return "income";
    }

    @RequestMapping(value = "/outcome")
    public String Outcome(){
        return "outcome";
    }

}
