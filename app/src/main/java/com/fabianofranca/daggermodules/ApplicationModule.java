package com.fabianofranca.daggermodules;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;

@Module(includes = MainModule.class)
public abstract class ApplicationModule {

    @Singleton
    @Binds
    abstract Application bindApplication(Application application);
}