package com.fabianofranca.daggermodules;

import com.fabianofranca.core.scopes.PerActivity;
import com.fabianofranca.sandero.SanderoModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module(includes = SanderoModule.class)
public abstract class MainModule {

    @ContributesAndroidInjector(modules = MainAcitvityModule.class)
    @PerActivity
    abstract MainActivity mainActivity();

    @Module
    abstract class MainAcitvityModule {
    }
}