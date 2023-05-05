package com.example.Licencjat.Exchange;


//This is file for all outside api connection


import lombok.extern.log4j.Log4j;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class OutsideApi {

    private final String NbpUrl = "http://api.nbp.pl/api/exchangerates/rates/A/USD";
    public Rate rate = new Rate();
    public CurrencyDTO currency = new CurrencyDTO();
    private final RestTemplate restTemplate = new RestTemplate();

    public CurrencyDTO getRatio(){

        CurrencyDTO response = restTemplate.getForObject(NbpUrl, CurrencyDTO.class, currency);
        rate = response.getRates().get(0);
        System.out.println(rate.getMid());
        return null;

    }

}
