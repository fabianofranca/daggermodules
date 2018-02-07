package com.fabianofranca.sandero;

import com.fabianofranca.carparts.CarPartsModule;
import com.fabianofranca.core.Car;
import com.fabianofranca.core.DescribableFragment;
import com.fabianofranca.core.scopes.PerFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module(includes = { CarPartsModule.class, SanderoModule.SanderoFragmentModule.class })
public abstract class SanderoModule {
    @Binds
    abstract Car bindSandero(Sandero car);

    @ContributesAndroidInjector(modules = SanderoFragmentModule.class)
    @PerFragment
    abstract SanderoFragment sanderoFragmentInjector();

    @Module
    public abstract class SanderoFragmentModule {

        @Binds
        @IntoMap
        @StringKey("Sandero")
        abstract DescribableFragment sanderoFragment(SanderoFragment fragment);
    }
}