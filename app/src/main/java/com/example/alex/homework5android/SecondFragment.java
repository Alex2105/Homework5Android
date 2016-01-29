package com.example.alex.homework5android;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class SecondFragment extends android.support.v4.app.Fragment {


    public static SecondFragment newInstance() {
        SecondFragment fragment = new SecondFragment();

        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_second, container, false);
        TextView textView1, textView2, textView3;
        textView1 = (TextView) root.findViewById(R.id.textView);
        textView2 = (TextView) root.findViewById(R.id.textView2);
        textView3 = (TextView) root.findViewById(R.id.textView3);


        return root;
    }


}
