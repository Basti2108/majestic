package com.procoding.majestic.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Random;

import com.procoding.root.majestic.R;

//TODO implement SQLlite for the Hooker lists!
public class HookerGeneratorFragment extends Fragment {

    Random randomizer = new Random();
    int randomNumber;
    private Spinner hookerSpinner;
    private View myFragmentView;



    public HookerGeneratorFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Shisha Generator");
        myFragmentView = inflater.inflate(R.layout.fragment_hooker_generator, container, false);


        hookerSpinner = (Spinner) myFragmentView.findViewById(R.id.spinner_hooker);

        //Create an ArrayAdapter unsing the StringArray and a default Spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity() , R.array.hooker_tastes, android.R.layout.simple_spinner_item);
        //Specify the Layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //apply the Adapter to the spinner
        hookerSpinner.setAdapter(adapter);

        return myFragmentView;
    }



    //TODO implement a Random Number Generator ---- easy!
    //@param lengthOfList : an Int to calculate the random number and avoid a Nullpointer
    public void randomSearch(int lengthOfList){
        randomNumber = 1 + randomizer.nextInt(lengthOfList);
    }


}
