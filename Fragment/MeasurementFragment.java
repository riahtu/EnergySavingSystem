package com.example.ln.energy_saving_system.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ln.energy_saving_system.R;

/**
 * A simple {@link Fragment} subclass.
 * 计量终端
 */
public class MeasurementFragment extends Fragment {


    public MeasurementFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_measurement, container, false);
    }

}
