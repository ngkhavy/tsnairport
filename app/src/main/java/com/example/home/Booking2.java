package com.example.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.

 */
public class Booking2 extends Fragment {

    Layout vietjet;
    ImageView backtoBooking;
    public Booking2() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_booking2, container, false);
        // back to booking
        backtoBooking=view.findViewById(R.id.backtoBooking);
        backtoBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Booking booking=new Booking();
                FragmentTransaction transaction=getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.fragment,booking);
                transaction.commit();
            }
        });
        return view;

    }

}