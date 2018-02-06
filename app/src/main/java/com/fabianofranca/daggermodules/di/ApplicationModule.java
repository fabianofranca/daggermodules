package com.fabianofranca.daggermodules.di;

import android.app.Application;

import com.fabianofranca.core.di.PerActivity;
import com.fabianofranca.daggermodules.MainActivity;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ApplicationModule {

    @Singleton
    @Binds
    abstract Application bindApplication(Application application);

    @ContributesAndroidInjector(modules = MainActivityModule.class)
    @PerActivity
    abstract MainActivity mainActivity();
}