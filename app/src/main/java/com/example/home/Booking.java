package com.example.home;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Switch;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Booking extends Fragment {
    EditText date_input1;
    EditText date_input2;
    Button btntimkiem;
    public Booking (){
    }
    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_booking, container, false);
       date_input1=view.findViewById(R.id.date_input1);
       date_input2=view.findViewById(R.id.date_input2);
       date_input1.setInputType(InputType.TYPE_NULL);
        // nút search ra màn hình fragment booking 2
        btntimkiem=view.findViewById(R.id.btntimkiem);
        btntimkiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Booking2 booking2=new Booking2();
                FragmentTransaction transaction=getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment,booking2);
                transaction.commit();
            }
        });
        return view;
    }
}

