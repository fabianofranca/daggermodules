package com.fabianofranca.carparts.di;

import com.fabianofranca.carparts.R15;
import com.fabianofranca.core.Rim;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class R15Module {

    @Binds
    public abstract Rim bindR15(R15 rim);
}