package com.fabianofranca.daggermodules.di;

import android.app.Application;

import com.fabianofranca.daggermodules.MainActivity;
import com.fabianofranca.sandero.di.SanderoModule;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Module(includes = { AndroidSupportInjectionModule.class, SanderoModule.class } )
public abstract class ApplicationModule {

    @Singleton
    @Binds
    abstract Application bindApplication(Application application);

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivity();
}