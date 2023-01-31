package com.example.Licencjat.Exchange;


//This is file for all outside api connection


import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class OutsideApi {

    private final String NbpUrl = "http://api.nbp.pl/api/exchangerates/rates/A/";
    public Rate rate = new Rate();
    private final RestTemplate restTemplate = new RestTemplate();

    public Rate getRatio(){

        return restTemplate.getForObject(NbpUrl+"USD", Rate.class, rate);

    }

}
