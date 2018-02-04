package com.fabianofranca.carparts.di;

import com.fabianofranca.core.Wheel;
import com.fabianofranca.carparts.DefaultWheel;

import dagger.Module;
import dagger.Binds;

@Module(includes = { GoodyearModule.class, R15Module.class })
public abstract class DefaultWheelModule {
    @Binds
    public abstract Wheel bindDefaultWheel(DefaultWheel wheel);
}