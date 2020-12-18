package com.example.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.

 */
public class Booking55 extends Fragment {

    ImageView BacktoBooking44;

    public Booking55() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_booking55, container, false);
        BacktoBooking44=view.findViewById(R.id.BacktoBooking44);
        BacktoBooking44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Booking44 booking=new Booking44();
                FragmentTransaction transaction=getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment,booking);
                transaction.commit();
            }
        });

        return view;
    }
}