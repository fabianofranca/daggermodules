package com.fabianofranca.carparts.di;

import com.fabianofranca.core.Rim;
import com.fabianofranca.carparts.R15;

import dagger.Module;
import dagger.Binds;

@Module
public abstract class R15Module {
    @Binds
    public abstract Rim bindR15(R15 rim);
}