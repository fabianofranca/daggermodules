package com.fabianofranca.carparts.di;

import com.fabianofranca.carparts.DefaultWheel;
import com.fabianofranca.core.Wheel;

import dagger.Binds;
import dagger.Module;

@Module(includes = {GoodyearModule.class, R15Module.class})
public abstract class DefaultWheelModule {

    @Binds
    public abstract Wheel bindDefaultWheel(DefaultWheel wheel);
}