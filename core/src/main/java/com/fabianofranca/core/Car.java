package com.fabianofranca.core;

public interface Car extends Describable {
    Motor getMotor();

    Wheel getWheel();

    Plate getPlate();
}