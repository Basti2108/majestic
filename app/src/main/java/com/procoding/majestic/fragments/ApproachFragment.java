package com.procoding.majestic.fragments;


import android.Manifest;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


import com.procoding.root.majestic.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class ApproachFragment extends Fragment {

    private TextView textName;
    private TextView textAdress;
    private TextView textCity;
    private View myFragmentView;
    private Typeface CopperplateGothicLightRegular;
    private Typeface CopperplateGothicBoldRegular;

    private Button buttonNavigator;
    //private MapView mapView;


    public ApproachFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Anfahrt");
        // Inflate the layout for this fragment
        myFragmentView = inflater.inflate(R.layout.fragment_approach, container, false);


        CopperplateGothicBoldRegular = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CopperplateGothicBoldRegular.ttf");
        CopperplateGothicLightRegular = Typeface.createFromAsset(getActivity().getAssets(), "fonts/CopperplateGothicLightRegular.ttf");

        //mapView = (MapView) myFragmentView.findViewById(R.id.mapView);
        textName = (TextView) myFragmentView.findViewById(R.id.textViewName);
        textAdress = (TextView) myFragmentView.findViewById(R.id.textViewAdress);
        textCity = (TextView) myFragmentView.findViewById(R.id.textViewAdress);

        buttonNavigator = (Button) myFragmentView.findViewById(R.id.buttonNavigation);










        textName.setTypeface(CopperplateGothicBoldRegular);
        textAdress.setTypeface(CopperplateGothicLightRegular);
        textCity.setTypeface(CopperplateGothicLightRegular);
        buttonNavigator.setTypeface(CopperplateGothicLightRegular);

        // Inflate the layout for this fragment
        return myFragmentView;

    }




}
