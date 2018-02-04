package com.fabianofranca.sandero;

import com.fabianofranca.core.Describable;
import com.fabianofranca.core.DescribableFragment;

import javax.inject.Inject;

public class SanderoFragment extends DescribableFragment {

    @Inject
    Sandero sandero;

    @Inject
    public SanderoFragment() {
    }

    @Override
    public Describable getDescribable() {
        return sandero;
    }
}