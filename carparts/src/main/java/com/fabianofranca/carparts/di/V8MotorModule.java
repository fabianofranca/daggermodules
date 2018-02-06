package com.fabianofranca.carparts.di;

import com.fabianofranca.carparts.V8Motor;
import com.fabianofranca.core.Motor;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class V8MotorModule {

    @Binds
    public abstract Motor bindV8Motor(V8Motor motor);
}