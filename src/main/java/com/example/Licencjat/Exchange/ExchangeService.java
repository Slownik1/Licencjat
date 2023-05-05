package com.example.Licencjat.Exchange;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.propertyeditors.CurrencyEditor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ExchangeService {

    private final OutsideApi outsidesApi;

    public CurrencyDTO getRatio(){
        return outsidesApi.getRatio();
    }

}
