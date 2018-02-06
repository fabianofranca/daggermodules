package com.fabianofranca.sandero.di;

import com.fabianofranca.carparts.di.DefaultWheelModule;
import com.fabianofranca.carparts.di.V8MotorModule;
import com.fabianofranca.core.Car;
import com.fabianofranca.core.di.PerActivity;
import com.fabianofranca.core.di.PerFragment;
import com.fabianofranca.sandero.Sandero;
import com.fabianofranca.sandero.SanderoFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(includes = {V8MotorModule.class, DefaultWheelModule.class})
public abstract class SanderoModule {
    @Binds
    @PerActivity
    abstract Car bindSandero(Sandero car);

    @ContributesAndroidInjector(modules = SanderoFragmentModule.class)
    @PerFragment
    abstract SanderoFragment sanderoFragmentInjector();
}