package com.example.smartphysicscalculator.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.example.smartphysicscalculator.R;
import com.example.smartphysicscalculator.ui.base.BaseFragment;

public class GravitationalForceFragment extends BaseFragment {

    private GravitationalForceViewModel mViewModel;

    public static GravitationalForceFragment newInstance() {
        return new GravitationalForceFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.gravitational_force_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(GravitationalForceViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public String getName() {
        return "СИЛА ТЯЖЕСТИ (F)";
    }
}