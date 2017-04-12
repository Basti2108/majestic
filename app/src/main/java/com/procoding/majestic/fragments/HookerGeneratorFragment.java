package com.procoding.majestic.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

import com.procoding.root.majestic.R;

//TODO implement SQLlite for the Hooker lists!
public class HookerGeneratorFragment extends Fragment {

    Random randomizer = new Random();
    int randomNumber;
    private Spinner hookerSpinner;
    private View myFragmentView;
    private Button suggestionBtn;
    private TextView hookerSuggestion;




    public HookerGeneratorFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Shisha Generator");
        myFragmentView = inflater.inflate(R.layout.fragment_hooker_generator, container, false);


        hookerSpinner = (Spinner) myFragmentView.findViewById(R.id.spinner_hooker);
        suggestionBtn = (Button) myFragmentView.findViewById(R.id.button_random_hooker);
        hookerSuggestion = (TextView) myFragmentView.findViewById(R.id.textView_Hooker);

        //Create an ArrayAdapter unsing the StringArray and a default Spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getActivity() , R.array.hooker_tastes, android.R.layout.simple_spinner_item);
        //Specify the Layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //apply the Adapter to the spinner
        hookerSpinner.setAdapter(adapter);



        //the Button which suggest a hooker taste after you choose one of the elements in the Spinner!
        //The TextView will later show the Suggested Taste!
        suggestionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //First Item in the Spinner = Fruchtig
                if(hookerSpinner.getSelectedItemId() == 0 ){
                    //TODO show one of the Tastes in FruitySection
                    hookerSuggestion.setText("Fruchtig");
                }else
                    //Second Item in the Spinner = Frisch!
                    if(hookerSpinner.getSelectedItemId() == 1){
                        //TODO show one of the Tastes in the FreshSection
                        hookerSuggestion.setText("Frisch");
                    }else
                        //Third Item in the Spinner = Fruchtig/Frisch
                        if(hookerSpinner.getSelectedItemId() == 2){
                            //TODO show one of the Tastes in the Fruity/FreshSection
                        hookerSuggestion.setText("Fruchtig/Frisch");
                    }else
                        //Fourth Item in the Spinner = Cremig
                        if(hookerSpinner.getSelectedItemId() == 3){
                            //TODO show one of the Tastes in the CreamySection
                        hookerSuggestion.setText("Cremig");

                    }else
                        //Fifth Item in the Spinner = Alles
                        if(hookerSpinner.getSelectedItemId() == 4){
                            //TODO show one of the Tastes in the EverythinSection
                            hookerSuggestion.setText("Alles");
                        }
            }

        });


        return myFragmentView;

        //Returns the adapter currently associated with this widget.

    }



    //TODO implement a Random Number Generator ---- easy!
    //@param lengthOfList : an Int to calculate the random number and avoid a Nullpointer
    public void randomSearch(int lengthOfList){
        randomNumber = 1 + randomizer.nextInt(lengthOfList);
    }


}
