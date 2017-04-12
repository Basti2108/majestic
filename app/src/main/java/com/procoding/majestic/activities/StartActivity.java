package com.procoding.majestic.activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.Toast;

import com.procoding.majestic.fragments.ApproachFragment;
import com.procoding.majestic.fragments.ContactFragment;
import com.procoding.majestic.fragments.HookerGeneratorFragment;
import com.procoding.majestic.fragments.MainFragment;
import com.procoding.majestic.fragments.ReservationFragment;
import com.procoding.root.majestic.R;

public class StartActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    NavigationView navigationView = null;
    Toolbar toolbar = null;

    MenuItem mainItem;
    MenuItem reservationItem;
    MenuItem approachItem;
    MenuItem contactItem;
    MenuItem hookerGeneratorItem;

    Typeface CopperplateGothicBoldRegular;
    Typeface CopperplateGothicLightRegular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_start);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Set the fragment initially
        MainFragment mainFragment = new MainFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, mainFragment);
        fragmentTransaction.commit();

        //get the f***ing Fonts, which match to the majestic logo
        CopperplateGothicBoldRegular = Typeface.createFromAsset(getAssets(),"fonts/CopperplateGothicBoldRegular.ttf");
        CopperplateGothicLightRegular = Typeface.createFromAsset(getAssets(),"fonts/CopperplateGothicLightRegular.ttf");

        //connect Variables to their layout items?Will give them a task later!
        mainItem = (MenuItem) findViewById(R.id.navStart);
        reservationItem = (MenuItem) findViewById(R.id.navReservation);
        approachItem = (MenuItem) findViewById(R.id.navApproach);
        contactItem = (MenuItem) findViewById(R.id.navContact);
        hookerGeneratorItem = (MenuItem) findViewById(R.id.navHookerGen);




        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);


            // drawer.closeDrawer(GravityCompat.START);
            MainFragment mainFragment = new MainFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, mainFragment);
            fragmentTransaction.commit();


    }




    //the task for the Layout Items, like EditText, Buttons and shit!
    //If you want to know which Item belongs to what kind of Task, look at the name
    //it is obvious!
    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.navStart) {

            MainFragment mainFragment = new MainFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, mainFragment);     // -> set the fragment_container to mainFragment, so you see the mainFragment on Screen
            fragmentTransaction.commit();                                           // it is analogous for the following if-Statements

        } else if (id == R.id.navReservation) {

            ReservationFragment resFragment = new ReservationFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, resFragment);
            fragmentTransaction.commit();

        } else if (id == R.id.navApproach) {

            ApproachFragment approachFragment = new ApproachFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, approachFragment);
            fragmentTransaction.commit();

        } else if (id == R.id.navContact) {
            ContactFragment contactFragment = new ContactFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, contactFragment);
            fragmentTransaction.commit();

        } else if (id == R.id.nav_whatsAppNewsletter) {
            

        } else if (id == R.id.navHookerGen){
            HookerGeneratorFragment hookerGeneratorFragment = new HookerGeneratorFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.fragment_container, hookerGeneratorFragment);
            fragmentTransaction.commit();
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
