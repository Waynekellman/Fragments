package com.nyc.fragments.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.nyc.fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ButtonThreeFragment extends Fragment {

    private View rootView;
    private TextView textView;

    public ButtonThreeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_button_three, container, false);
        textView = rootView.findViewById(R.id.text);

        Bundle bundle = getArguments();
        String textFromEditText = bundle.getString("fragmentThree", "");
        textView.setText(textFromEditText);


        return rootView;
    }

}
