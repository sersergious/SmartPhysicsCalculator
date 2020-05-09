package com.example.smartphysicscalculator.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProviders;

import com.example.smartphysicscalculator.R;
import com.example.smartphysicscalculator.ui.activities.CalculationActivity;
import com.example.smartphysicscalculator.ui.base.BaseFragment;

public class SpringExtentionFragment extends BaseFragment {

    private SpringExtentionViewModel mViewModel;
    private EditText et1, et2;
    private TextView tV;
    private Button btnCalculateSpringExtention;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        et1 = view.findViewById(R.id.restoringForce_for_springExtention);
        et2 = view.findViewById(R.id.springConstant_for_springExtention);
        tV = view.findViewById(R.id.springExtention);
        btnCalculateSpringExtention = view.findViewById(R.id.btnCalculateSpringExtention);
        btnCalculateSpringExtention.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(et1.getText().toString());
                double num2 = Double.parseDouble(et2.getText().toString());
                double res = num1 / num2;
                tV.setText(String.valueOf(res));
                CalculationActivity.hideKeyboard(getActivity());
            }
        });
    }

    public static SpringExtentionFragment newInstance() {
        return new SpringExtentionFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.spring_extention_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(SpringExtentionViewModel.class);
    }

    @Override
    public String getName() {
        return "Удлинение тела (x)";
    }
}