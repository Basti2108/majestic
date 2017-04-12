package com.procoding.majestic.fragments;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.procoding.root.majestic.R;


public class ReservationFragment extends Fragment {

    private TextView vTitle;
    private TextView vDate;
    private TextView vTime;
    private TextView vGuests;
    private Button buRes;
    private EditText eDate;
    private EditText eTime;
    private EditText eGuests;
    private EditText ePhoneNumber;
    private Typeface CopperplateGothicLightRegular;
    private Typeface CopperplateGothicBoldRegular;
    private View myFragmentView;

    public ReservationFragment() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Reservierung");





        myFragmentView = inflater.inflate(R.layout.fragment_reservation, container, false);

        CopperplateGothicBoldRegular = Typeface.createFromAsset(getActivity().getAssets(),"fonts/CopperplateGothicBoldRegular.ttf");
        CopperplateGothicLightRegular = Typeface.createFromAsset(getActivity().getAssets(),"fonts/CopperplateGothicLightRegular.ttf");


        // assign variables to layout elements!
        //vTitle = (TextView) myFragmentView.findViewById(R.id.textTitle);
        vDate = (TextView) myFragmentView.findViewById(R.id.textViewDate);
        vTime = (TextView) myFragmentView.findViewById(R.id.textViewTime);
        vGuests = (TextView) myFragmentView.findViewById(R.id.textViewGuests);
        buRes = (Button) myFragmentView.findViewById(R.id.buttonRes);
        eDate = (EditText) myFragmentView.findViewById(R.id.editTextDate);
        eTime = (EditText) myFragmentView.findViewById(R.id.editTime);
        eGuests = (EditText) myFragmentView.findViewById(R.id.editTextGuests);
        ePhoneNumber = (EditText) myFragmentView.findViewById(R.id.editPhoneNumber);

        //##############################################################//

        //assign fonts
        //vTitle.setTypeface(CopperplateGothicLightRegular);
        vDate.setTypeface(CopperplateGothicLightRegular);
        vTime.setTypeface(CopperplateGothicLightRegular);
        vGuests.setTypeface(CopperplateGothicLightRegular);
        buRes.setTypeface(CopperplateGothicLightRegular);
        ePhoneNumber.setTypeface(CopperplateGothicLightRegular);
        eDate.setTypeface(CopperplateGothicLightRegular);
        eTime.setTypeface(CopperplateGothicLightRegular);
        eGuests.setTypeface(CopperplateGothicLightRegular);
        // Inflate the layout for this fragment


        buRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Toast.makeText(getActivity(), "Du erhälst in kürze eine Bestätigung per SMS.", Toast.LENGTH_SHORT).show();
                }catch (Exception e){
                    Toast.makeText(getActivity(), "Keine Verbindung zum Internet.", Toast.LENGTH_SHORT).show();
                }
            }


        });

        return myFragmentView;


    }


    //TODO import a fucking client and a server on your pc
    public void clientSocket(){

    }

}
