package com.example.alex.homework5android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class Fragment extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction ft = fm.beginTransaction();
        FirstFragment fragment = FirstFragment.newInstance();
        SecondFragment fragment1 = SecondFragment.newInstance();
        ft.add(R.id.left_container, fragment, FirstFragment.class.getSimpleName());
        ft.add(R.id.right_container, fragment1, SecondFragment.class.getSimpleName());
        ft.commit();


    }
}
