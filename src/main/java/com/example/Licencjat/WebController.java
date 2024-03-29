package com.example.Licencjat;

import com.example.Licencjat.Exchange.Rate;
import com.example.Licencjat.Incoming.Incoming;
import com.example.Licencjat.Outgoing.Outgoing;
import com.example.Licencjat.Outgoing.OutgoingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin(origins = "http://localhost:4200")
public class WebController{

    private final OutgoingService outgoingService;

    public WebController(OutgoingService outgoingService) {
        this.outgoingService = outgoingService;
    }

    @RequestMapping(value = "/main")
    public String Index(){
        return "";
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

    @RequestMapping(value="/list")
    public String List(){
        return "list";
    }

    @GetMapping(value="/list", params={"!sort", "!page", "!size"})
    public String readAllOutgoings(Model model){

        model.addAttribute("outgoing", outgoingService.getOutgoing());

        return "list";
    }

}
