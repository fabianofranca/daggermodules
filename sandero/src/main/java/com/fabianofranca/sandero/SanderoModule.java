package com.fabianofranca.sandero;

import com.fabianofranca.carparts.di.DefaultWheelModule;
import com.fabianofranca.carparts.di.V8MotorModule;
import com.fabianofranca.core.Car;
import com.fabianofranca.core.di.PerFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(includes = {V8MotorModule.class, DefaultWheelModule.class})
public abstract class SanderoModule {
    @Binds
    abstract Car bindSandero(Sandero car);

    @ContributesAndroidInjector(modules = SanderoFragmentModule.class)
    @PerFragment
    abstract SanderoFragment sanderoFragmentInjector();

    @Module
    public abstract class SanderoFragmentModule {
    }
}