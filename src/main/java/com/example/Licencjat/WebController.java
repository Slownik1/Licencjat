package com.example.Licencjat;

import com.example.Licencjat.Incoming.Incoming;
import com.example.Licencjat.Outgoing.Outgoing;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping(value = "/index")
    public String Index(){
        return "index";
    }

    @RequestMapping(value = "/income")
    public String Income(Model model){
        model.addAttribute("incoming", new Incoming());
        return "income";
    }

    @GetMapping(value = "/outcome")
    public String Outcome(Model model){
        model.addAttribute("outgoing", new Outgoing());
        return "outcome";
    }

}
