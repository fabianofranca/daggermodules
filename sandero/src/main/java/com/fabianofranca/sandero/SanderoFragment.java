package com.fabianofranca.sandero;

import com.fabianofranca.core.Describable;
import com.fabianofranca.core.DescribableFragment;
import com.fabianofranca.core.di.PerActivity;

import javax.inject.Inject;

@PerActivity
public class SanderoFragment extends DescribableFragment {

    private Sandero sandero;

    public SanderoFragment() {
    }

    @Inject
    public SanderoFragment(Sandero sandero) {
        this.sandero = sandero;
    }

    @Override
    public Describable getDescribable() {
        return sandero;
    }
}