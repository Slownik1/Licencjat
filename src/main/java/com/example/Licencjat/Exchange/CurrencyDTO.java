package com.example.Licencjat.Exchange;

import lombok.Getter;

import java.util.ArrayList;

@Getter
public class CurrencyDTO {

    private String table;
    private ArrayList<Rate> rates;

}
