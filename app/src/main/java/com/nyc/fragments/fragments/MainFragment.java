package com.nyc.fragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.nyc.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {

    private View rootView;

    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_main, container, false);
        Button fragmentOne = (Button) rootView.findViewById(R.id.fragment_one);
        Button fragmentTwo = (Button) rootView.findViewById(R.id.fragment_two);
        Button fragmentThree = (Button) rootView.findViewById(R.id.fragment_three);
        Button fragmentFour = (Button) rootView.findViewById(R.id.fragment_four);
        Button fragmentFive = (Button) rootView.findViewById(R.id.fragment_five);
        return rootView;
    }

}
