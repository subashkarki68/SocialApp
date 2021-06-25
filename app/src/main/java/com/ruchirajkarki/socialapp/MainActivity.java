package com.ruchirajkarki.socialapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.ruchirajkarki.socialapp.fragments.Add;
import com.ruchirajkarki.socialapp.fragments.Home;
import com.ruchirajkarki.socialapp.fragments.Notification;
import com.ruchirajkarki.socialapp.fragments.Profile;
import com.ruchirajkarki.socialapp.fragments.Search;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

//import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
public class MainActivity extends AppCompatActivity {
    //Initialize varialble
//    MeowBottomNavigation mMeowBottomNavigation;
    MeowBottomNavigation mMeowBottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign variable
        mMeowBottomNavigation = findViewById(R.id.bottom_navigation);

        //Add menu item
        mMeowBottomNavigation.add(new MeowBottomNavigation.Model(1, R.drawable.ic_home));
        mMeowBottomNavigation.add(new MeowBottomNavigation.Model(2, R.drawable.ic_notification));
        mMeowBottomNavigation.add(new MeowBottomNavigation.Model(3, R.drawable.ic_plus));
        mMeowBottomNavigation.add(new MeowBottomNavigation.Model(4, R.drawable.ic_search));
        mMeowBottomNavigation.add(new MeowBottomNavigation.Model(5, R.drawable.ic_profile));

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, new Home())
                .commit();
        mMeowBottomNavigation.show(1,true);
        //NEW CODE CHECK
        mMeowBottomNavigation.setOnClickMenuListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                //                Initialize fragment
                Fragment fragment = null;

                //Check condition
                switch (model.getId()) {
                    case 1:
                        //When id is 1
                        //Initialize Home fragment
                        fragment = new Home();
                        break;
                    case 2:
                        //When id is 2
                        //Initialize Notification fragment
                        fragment = new Notification();
                        break;
                    case 3:
                        //When id is 3
                        //Initialize Add fragment
                        fragment = new Add();
                        break;
                    case 4:
                        //When id is 4
                        //Initialize Search fragment
                        fragment = new Search();
                        break;
                    case 5:
                        //When id is 5
                        //Initialize Profile fragment
                        fragment = new Profile();
                        break;
                }
                //Load fragment
                if (fragment != null) {
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.frame_layout, fragment)
                            .commit();
                }else{
                    getSupportFragmentManager()
                            .beginTransaction()
                            .replace(R.id.frame_layout, new Home())
                            .commit();
                }
                return null;
            }
        });
//
////Set home fragment initially selected
//        mMeowBottomNavigation.show(1, true);
        mMeowBottomNavigation.setCount(2, "10");



        mMeowBottomNavigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                mMeowBottomNavigation.clearCount(model.getId());
                return null;
            }
        });

    }
}