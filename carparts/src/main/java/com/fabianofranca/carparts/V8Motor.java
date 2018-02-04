package com.fabianofranca.carparts;

import com.fabianofranca.core.Motor;

import javax.inject.Inject;

public class V8Motor implements Motor {

    @Inject
    public V8Motor() {
    }

    @Override
    public String getDescription() {
        return "Motor V8";
    }
}
