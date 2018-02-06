package com.fabianofranca.daggermodules.di;

import com.fabianofranca.daggermodules.DaggerModulesApplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidSupportInjectionModule.class,
        ApplicationModule.class,
})
@Singleton
interface ApplicationComponent extends AndroidInjector<DaggerModulesApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<DaggerModulesApplication> {
    }
}