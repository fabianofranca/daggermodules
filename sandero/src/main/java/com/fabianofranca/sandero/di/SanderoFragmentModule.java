package com.fabianofranca.sandero.di;

import com.fabianofranca.core.DescribableFragment;
import com.fabianofranca.core.di.PerFragmentScope;
import com.fabianofranca.sandero.SanderoFragment;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class SanderoFragmentModule {

    @Binds
    @PerFragmentScope
    abstract DescribableFragment sanderoFragment(SanderoFragment fragment);
}