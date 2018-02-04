package com.fabianofranca.carparts;

import com.fabianofranca.core.Rim;

import javax.inject.Inject;

public class R15 implements Rim {

    @Inject
    public R15() {
    }

    @Override
    public String getDescription() {
        return "15 inch Rim";
    }
}