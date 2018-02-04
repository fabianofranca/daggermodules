package com.fabianofranca.carparts;

import com.fabianofranca.core.Tire;

import javax.inject.Inject;

public class Goodyear implements Tire {

    @Inject
    public Goodyear() {
    }

    @Override
    public String getDescription() {
        return "Goodyear tire";
    }
}
