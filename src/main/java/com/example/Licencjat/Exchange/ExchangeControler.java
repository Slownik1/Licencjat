package com.example.Licencjat.Exchange;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExchangeControler {

    private final ExchangeService exchangeService;

    public ExchangeControler(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }


    @GetMapping (path="/ratio")
    public Rate getRatio(){

        return exchangeService.getRatio();
    }

}
