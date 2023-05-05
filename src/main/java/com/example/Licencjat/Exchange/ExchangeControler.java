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
    public CurrencyDTO getRatio(){

        return exchangeService.getRatio();
    }

}
