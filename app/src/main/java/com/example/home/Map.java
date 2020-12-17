package com.example.home;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Map extends Fragment {
    Button btnF1,btnF2;
    public Map() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_map, container, false);

        btnF1=view.findViewById(R.id.btnF1);
        btnF1.setBackgroundColor(Color.WHITE);
        btnF1.setTextColor(Color.parseColor("#6d9fd0"));
        btnF1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Map_area map_area= new Map_area();
                FragmentTransaction transaction=getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.layoutContainerMap,map_area);
                transaction.commit();
                }
        });
        btnF2=view.findViewById(R.id.btnF2);
        btnF2.setBackgroundColor(Color.WHITE);
        btnF2.setTextColor(Color.parseColor("#6d9fd0"));

        btnF2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Map_floor map_floor=new Map_floor();
                FragmentTransaction transaction=getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.layoutContainerMap,map_floor);
                transaction.commit();
            }
        });
        
        return view;

    }






}