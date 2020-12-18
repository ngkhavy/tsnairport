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
public class booking33 extends Fragment {
    ImageView BacktoBooking22;
    Button btnTiep;
    public booking33() {

        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_booking33, container, false);
        BacktoBooking22=view.findViewById(R.id.BacktoBooking22);
        BacktoBooking22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Booking2 booking=new Booking2();
                FragmentTransaction transaction=getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment,booking);
                transaction.commit();
            }
        });
        btnTiep=view.findViewById(R.id.btnTiep);
        btnTiep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Booking44 booking44=new Booking44();
                FragmentTransaction transaction=getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment,booking44);
                transaction.commit();
            }
        });
        return view;
    }
}