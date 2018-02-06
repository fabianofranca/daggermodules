package com.fabianofranca.carparts.di;

import com.fabianofranca.carparts.Goodyear;
import com.fabianofranca.core.Tire;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class GoodyearModule {

    @Binds
    public abstract Tire bindGoodyear(Goodyear tire);
}