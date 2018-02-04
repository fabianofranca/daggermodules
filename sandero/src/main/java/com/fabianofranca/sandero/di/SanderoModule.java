package com.fabianofranca.sandero.di;

import com.fabianofranca.carparts.di.DefaultWheelModule;
import com.fabianofranca.carparts.di.V8MotorModule;
import com.fabianofranca.core.Car;
import com.fabianofranca.core.di.PerFragmentScope;
import com.fabianofranca.sandero.Sandero;
import com.fabianofranca.sandero.SanderoFragment;

import dagger.Module;
import dagger.Binds;
import dagger.android.ContributesAndroidInjector;

@Module(includes = { V8MotorModule.class, DefaultWheelModule.class})
public abstract class SanderoModule {

    @Binds
    abstract Car bindSandero(Sandero car);

    @ContributesAndroidInjector(modules = SanderoFragmentModule.class)
    @PerFragmentScope
    abstract SanderoFragment sanderoFragmentInjector();
}