package com.example.home;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

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
    public Booking (){
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_booking, container, false);
        date_input1=view.findViewById(R.id.date_input1);
        date_input2=view.findViewById(R.id.date_input2);
        date_input1.setInputType(InputType.TYPE_NULL);
        date_input1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDateDialog(date_input1);
            }
        });

        return view;
    }
    private void showDateDialog(EditText date_input1) {
        Calendar calendar = Calendar.getInstance();
        DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                calendar.set(Calendar.YEAR, year);
                calendar.set(Calendar.MONTH, month);
                calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd");
                date_input1.setText(simpleDateFormat.format(calendar));
            }
        };

    }
}

