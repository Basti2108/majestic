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

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
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
    private MapView mapView;


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

        mapView = (MapView) myFragmentView.findViewById(R.id.mapView);
        textName = (TextView) myFragmentView.findViewById(R.id.textViewName);
        textAdress = (TextView) myFragmentView.findViewById(R.id.textViewAdress);
        textCity = (TextView) myFragmentView.findViewById(R.id.textViewAdress);

        buttonNavigator = (Button) myFragmentView.findViewById(R.id.buttonNavigation);

        //TODO Get GoogleMaps to work inside of the app
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {


                if (ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getActivity(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
                    // TODO: Consider calling
                    //    ActivityCompat#requestPermissions
                    // here to request the missing permissions, and then overriding
                    //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                    //                                          int[] grantResults)
                    // to handle the case where the user grants the permission. See the documentation
                    // for ActivityCompat#requestPermissions for more details.
                    return;
                }
                googleMap.setMyLocationEnabled(true);
                googleMap.getUiSettings().setZoomControlsEnabled(true);
                LatLngBounds.Builder builder = new LatLngBounds.Builder();
                builder.include(new LatLng(55.854049, 13.661331));
                LatLngBounds bounds =  builder.build();
                int padding = 0;
                CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngBounds(bounds, padding);
                googleMap.moveCamera(cameraUpdate);


            }
        });





        textName.setTypeface(CopperplateGothicBoldRegular);
        textAdress.setTypeface(CopperplateGothicLightRegular);
        textCity.setTypeface(CopperplateGothicLightRegular);
        buttonNavigator.setTypeface(CopperplateGothicLightRegular);

        // Inflate the layout for this fragment
        return myFragmentView;

    }




}
