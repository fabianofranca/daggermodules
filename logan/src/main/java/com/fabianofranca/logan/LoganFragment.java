package com.fabianofranca.logan;

import com.fabianofranca.core.Describable;
import com.fabianofranca.core.DescribableFragment;
import com.fabianofranca.core.scopes.PerActivity;

import javax.inject.Inject;

@PerActivity
public class LoganFragment extends DescribableFragment {

    private Logan logan;

    public LoganFragment() {
    }

    @Inject
    public LoganFragment(Logan logan) {
        this.logan = logan;
    }

    @Override
    public Describable getDescribable() {
        return logan;
    }
}