package com.procoding.majestic.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.procoding.root.majestic.R;


public class HookerGeneratorFragment extends Fragment {




    public HookerGeneratorFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Shisha Generator");
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hooker_generator, container, false);
    }


    //TODO implement a Random Number Generator ---- easy!
    //@param lengthOfList : an Int to calculate the random number and avoid a Nullpointer
    public void randomSearch(int lengthOfList){

    }

}
