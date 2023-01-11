package com.example.Licencjat.Exchange;


//This is file for all outside api connection


import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class OutsideApi {

    private final String NbpUrl = "http://api.nbp.pl/api/exchangerates/rates/A/";

    private final RestTemplate restTemplate = new RestTemplate();

    public String getRatio(String currency){

        return restTemplate.getForObject(NbpUrl+"{currency}", String.class);

    }

}