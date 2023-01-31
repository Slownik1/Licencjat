package com.example.Licencjat;

import com.example.Licencjat.Exchange.Rate;
import com.example.Licencjat.Incoming.Incoming;
import com.example.Licencjat.Outgoing.Outgoing;
import com.example.Licencjat.Outgoing.OutgoingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController{

    private final OutgoingService outgoingService;

    public WebController(OutgoingService outgoingService) {
        this.outgoingService = outgoingService;
    }

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

    @RequestMapping(value="/list")
    public String List(){
        return "list";
    }

    @GetMapping(value="/list", params={"!sort", "!page", "!size"})
    public String readAllOutgoings(Model model){

        model.addAttribute("outgoing", outgoingService.getOutgoing());

        return "list";
    }
//    @RequestMapping(value="/ratio")
//    public String Exchange(Model model){
//        model.addAttribute("ratio", rate);
//        return "ratio";
//    }

}
