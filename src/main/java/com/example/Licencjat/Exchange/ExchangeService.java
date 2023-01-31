package com.example.Licencjat.Exchange;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExchangeService {

    public final OutsideApi outsidesApi;

    public Rate getRatio(){
        return outsidesApi.getRatio();
    }

}
