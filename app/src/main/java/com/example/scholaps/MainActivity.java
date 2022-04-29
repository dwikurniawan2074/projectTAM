package com.example.scholaps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    Fragment fragment;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addFragment();
    }

    public void addFragment(){
        LoginFragment fragment = new LoginFragment();
        fragment.setCallbackFragment(this::addFragment);
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, fragment);
        fragmentTransaction.commit();
    }
}