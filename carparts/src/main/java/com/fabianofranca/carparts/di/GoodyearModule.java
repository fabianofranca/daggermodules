package com.fabianofranca.carparts.di;

import com.fabianofranca.core.Tire;
import com.fabianofranca.carparts.Goodyear;

import dagger.Module;
import dagger.Binds;

@Module
public abstract class GoodyearModule {

    @Binds
    public abstract Tire bindGoodyear(Goodyear tire);
}