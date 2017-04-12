package com.procoding.majestic.fragments;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.procoding.root.majestic.R;


public class MainFragment extends Fragment {

    private ImageButton buttonFacebook;
    private ImageButton buttonInstagram;
    private ImageButton buttonYoutube;
    private Typeface CopperplateGothicBoldRegular;
    private Typeface CopperplateGothicLightRegular;
    private View myFragmentView;


    public MainFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        getActivity().setTitle("Majestic");

        // Inflate the layout for this fragment
        myFragmentView = inflater.inflate(R.layout.fragment_main, container, false);

        buttonFacebook = (ImageButton) myFragmentView.findViewById(R.id.imageButtonFB);
        buttonInstagram = (ImageButton) myFragmentView.findViewById(R.id.imageButtonInsta);
        buttonYoutube = (ImageButton) myFragmentView.findViewById(R.id.imageButtonYouTube);


        //Show Facebook!
        buttonFacebook.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intentBrowseFb = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.de"));
                startActivity(intentBrowseFb);
            }


        });

        //Show Instagram

        buttonInstagram.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intentBrowseInstagram = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.instagram.com"));
                startActivity(intentBrowseInstagram);
            }

        });

        //Show youtube
        buttonYoutube.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intentBrowseYoutube = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.youtube.de"));
                startActivity(intentBrowseYoutube);
            }
        });

        //return inflater.inflate(R.layout.fragment_main, container, false);
        return myFragmentView;
    }


}
