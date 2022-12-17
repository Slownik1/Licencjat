package com.example.Licencjat.Exchange;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExchangeService {

    public final OutsidesApi outsidesApi;

    String getRatio(String currency){
        return outsidesApi.getRatio(currency);
    }

}
