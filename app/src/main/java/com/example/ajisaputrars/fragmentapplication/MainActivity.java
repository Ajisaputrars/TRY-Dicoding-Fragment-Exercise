package com.example.ajisaputrars.fragmentapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HomeFragment mHomeFragment = new HomeFragment();

        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction = mFragmentManager.beginTransaction();
        Fragment fragment = mFragmentManager.findFragmentByTag(HomeFragment.class.getSimpleName());
        if (!(fragment instanceof HomeFragment)) {
            mFragmentTransaction.add(
                    R.id.activity_main_frame_container,
                    mHomeFragment,
                    HomeFragment.class.getSimpleName()
            );
            Log.d("MyFlexibleFragment", "Fragment Name :" + HomeFragment.class.getSimpleName());
            mFragmentTransaction.commit();
        }
    }
}
