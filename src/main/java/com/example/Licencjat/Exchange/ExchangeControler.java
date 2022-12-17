package com.example.Licencjat.Exchange;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExchangeControler {

    private final ExchangeService exchangeService;

    public ExchangeControler(ExchangeService exchangeService) {
        this.exchangeService = exchangeService;
    }


    @GetMapping(path="/ratio")
    public String getRatio(@RequestParam (name = "currency") String currency){

        return exchangeService.getRatio(currency);
    }

}
