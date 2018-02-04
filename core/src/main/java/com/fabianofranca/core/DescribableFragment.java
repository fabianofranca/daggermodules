package com.fabianofranca.core;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import dagger.android.support.DaggerFragment;

public abstract class DescribableFragment extends DaggerFragment {

    public static final String DESCRIBABLE_KEY = "describable";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_descriable, container,  false);


        TextView textView = view.findViewById(R.id.textview_description);

        textView.setText(getDescribable().getDescription());

        return view;
    }

    public abstract Describable getDescribable();
}