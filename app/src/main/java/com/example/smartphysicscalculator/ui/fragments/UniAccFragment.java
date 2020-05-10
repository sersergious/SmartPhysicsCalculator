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

public class UniAccFragment extends BaseFragment {

    private UniAccViewModel mViewModel;
    private Button btnCalculateUniAcc;
    TextView tV;
    private EditText et1, et2, et3;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        et1 = view.findViewById(R.id.velocity_for_acceleration);
        et2 = view.findViewById(R.id.firstVelocity_for_acceleration);
        et3 = view.findViewById(R.id.time_for_acceleration);
        tV = view.findViewById(R.id.uni_acc);
        btnCalculateUniAcc = view.findViewById(R.id.btnCalculateUniAcc);
        btnCalculateUniAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num1 = Double.parseDouble(et1.getText().toString());
                double num2 = Double.parseDouble(et2.getText().toString());
                double num3 = Double.parseDouble(et3.getText().toString());
                double res = num1 - num2 / num3;
                tV.setText(String.valueOf(res));
                CalculationActivity.hideKeyboard(getActivity());
            }
        });
    }

    public static UniAccFragment newInstance() {
        return new UniAccFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.uni_acc_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(UniAccViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public String getName() {
        return "УСКОРЕНИЕ (a)";
    }
}
