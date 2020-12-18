package com.example.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Booking44 extends Fragment {
    ImageView BacktoBooking33;
    Button btnThanhtoan;
    public Booking44() {


        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_booking44, container, false);
        BacktoBooking33=view.findViewById(R.id.BacktoBooking33);
        BacktoBooking33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                booking33 booking=new booking33();
                FragmentTransaction transaction=getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment,booking);
                transaction.commit();
            }
        });
        btnThanhtoan=view.findViewById(R.id.btnThanhtoan);
        btnThanhtoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Booking55 booking55=new Booking55();
                FragmentTransaction transaction=getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment,booking55);
                transaction.commit();
            }
        });
        return view;
    }
}