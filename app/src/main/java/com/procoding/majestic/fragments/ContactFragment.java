package com.procoding.majestic.fragments;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.procoding.root.majestic.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {

    private TextView textName;
    private TextView textAdress;
    private View myFragmentView;
    private Typeface CopperplateGothicLightRegular;
    private Typeface CopperplateGothicBoldRegular;

    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Kontakt");
        myFragmentView =inflater.inflate(R.layout.fragment_contact, container, false);


        // Inflate the layout for this fragment
        return myFragmentView;
    }

}
