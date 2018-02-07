package com.fabianofranca.carparts;

import com.fabianofranca.core.Plate;

import java.util.Random;

import javax.inject.Inject;

public class BrazilianPlate implements Plate{

    private String value;

    @Inject
    public BrazilianPlate() {
        Random rnd = new Random();

        char first = (char) (rnd.nextInt(26) + 'a');
        char second = (char) (rnd.nextInt(26) + 'a');
        char third = (char) (rnd.nextInt(26) + 'a');

        int numbers = rnd.nextInt(9999);

        value = String.valueOf(new char[]{first, second, third}).toUpperCase();

        value = value + "-" + String.format("%04d", numbers);
    }

    @Override
    public String getValue() {
        return value;
    }
}
