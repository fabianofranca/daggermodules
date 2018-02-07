package com.fabianofranca.logan;

import com.fabianofranca.carparts.CarPartsModule;
import com.fabianofranca.core.Car;
import com.fabianofranca.core.DescribableFragment;
import com.fabianofranca.core.scopes.PerFragment;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module(includes = { CarPartsModule.class, LoganModule.LoganFragmentModule.class })
public abstract class LoganModule {
    @Binds
    abstract Car bindLogan(Logan car);

    @ContributesAndroidInjector(modules = LoganFragmentModule.class)
    @PerFragment
    abstract LoganFragment loganFragmentInjector();

    @Module
    public abstract class LoganFragmentModule {

        @Binds
        @IntoMap
        @StringKey("Logan")
        abstract DescribableFragment sanderoFragment(LoganFragment fragment);
    }
}