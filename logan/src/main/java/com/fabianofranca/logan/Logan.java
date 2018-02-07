package com.fabianofranca.logan;

import com.fabianofranca.carparts.BrazilianPlate;
import com.fabianofranca.carparts.DefaultWheel;
import com.fabianofranca.carparts.V8Motor;
import com.fabianofranca.core.Car;
import com.fabianofranca.core.Motor;
import com.fabianofranca.core.Plate;
import com.fabianofranca.core.Wheel;

import javax.inject.Inject;

public class Logan implements Car {

    private String description = "%1$s(%2$s) -> (%3$s, %4$s)";
    private Wheel wheel;
    private Motor motor;
    private Plate plate;

    @Inject
    public Logan(V8Motor motor, DefaultWheel wheel, BrazilianPlate plate) {
        this.motor = motor;
        this.wheel = wheel;
        this.plate = plate;
    }

    @Override
    public String getDescription() {
        return String.format(description,
                "Logan", plate.getValue(), motor.getDescription(), wheel.getDescription());
    }

    @Override
    public Motor getMotor() {
        return motor;
    }

    @Override
    public Wheel getWheel() {
        return wheel;
    }

    @Override
    public Plate getPlate() {
        return plate;
    }
}