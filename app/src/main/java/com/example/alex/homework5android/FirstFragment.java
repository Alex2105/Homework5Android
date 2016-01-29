package com.example.alex.homework5android;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FirstFragment extends android.support.v4.app.Fragment {

    Button button_number2, button_number8, button_number16;
    EditText text, text1, text2;
    int editText, editText1, editText2;
    String bin, oct, hex;

    public static FirstFragment newInstance() {
        FirstFragment fragment = new FirstFragment();

        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_first, container, false);
        button_number2 = (Button) root.findViewById(R.id.button);
        button_number8 = (Button) root.findViewById(R.id.button2);
        button_number16 = (Button) root.findViewById(R.id.button3);
        text = (EditText) root.findViewById(R.id.textView);
        text1 = (EditText) root.findViewById(R.id.textView2);
        text2 = (EditText) root.findViewById(R.id.textView3);

        button_number2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText = Integer.parseInt(String.valueOf(text.getText()));
                bin = Integer.toBinaryString(editText);
            }
        });

        button_number8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1 = Integer.parseInt(String.valueOf(text1));
                oct = Integer.toOctalString(editText1);
            }
        });

        button_number16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText2 = Integer.parseInt(String.valueOf(text2));
                hex = Integer.toHexString(editText2);
            }
        });
        return root;
    }


}
