package com.fabianofranca.carparts;

import com.fabianofranca.core.Rim;
import com.fabianofranca.core.Tire;
import com.fabianofranca.core.Wheel;

import javax.inject.Inject;

public class DefaultWheel implements Wheel {

    private String description = "%1$s -> (%2$s, %3$s)";
    private Tire tire;
    private Rim rim;

    @Inject
    public DefaultWheel(Rim rim, Tire tire) {
        this.rim = rim;
        this.tire = tire;
    }

    @Override
    public String getDescription() {
        return String.format(description,
                "Default Wheel", rim.getDescription(), tire.getDescription()) ;
    }

    @Override
    public Rim getRim() {
        return rim;
    }

    @Override
    public Tire getTire() {
        return tire;
    }
}