package com.fabianofranca.daggermodules.di;

import com.fabianofranca.daggermodules.DaggerModulesApplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = ApplicationModule.class)
interface ApplicationComponent extends AndroidInjector<DaggerModulesApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<DaggerModulesApplication> {}
}