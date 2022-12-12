package com.example.Licencjat.Exchange;

import org.springframework.stereotype.Service;

@Service
public class ExchangeService {

    private OutsidesApi outsidesApi;

    String getRatio(String currency){
        return outsidesApi.getRatio(currency);
    }

}
