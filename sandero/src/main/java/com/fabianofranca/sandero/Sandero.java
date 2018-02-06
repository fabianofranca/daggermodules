package com.fabianofranca.sandero;

import com.fabianofranca.carparts.DefaultWheel;
import com.fabianofranca.carparts.V8Motor;
import com.fabianofranca.core.Car;
import com.fabianofranca.core.Motor;
import com.fabianofranca.core.Wheel;

import java.util.Random;

import javax.inject.Inject;

public class Sandero implements Car {

    private String description = "%1$s(%2$s) -> (%3$s, %4$s)";
    private Wheel wheel;
    private Motor motor;
    private String plate;

    @Inject
    public Sandero(V8Motor motor, DefaultWheel wheel) {
        this.motor = motor;
        this.wheel = wheel;

        Random rnd = new Random();

        char first = (char) (rnd.nextInt(26) + 'a');
        char second = (char) (rnd.nextInt(26) + 'a');
        char third = (char) (rnd.nextInt(26) + 'a');

        int numbers = 1000 + rnd.nextInt(9999);

        plate = String.valueOf(new char[]{first, second, third}).toUpperCase();
        plate = plate + "-" + numbers;
    }

    @Override
    public String getDescription() {
        return String.format(description,
                "Sandero", plate, motor.getDescription(), wheel.getDescription());
    }

    @Override
    public Motor getMotor() {
        return motor;
    }

    @Override
    public Wheel getWheel() {
        return wheel;
    }
}