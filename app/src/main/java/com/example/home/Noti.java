package com.example.home;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.example.home.adapter.NotiAdapter;

import java.util.ArrayList;


public class Noti extends Fragment {

NotiAdapter notiAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //ArrayAdapter<NotiAdapter> adapter=new ArrayAdapter<NotiAdapter>(getContext(),R.layout.listnoti);


        View view=inflater.inflate(R.layout.fragment_noti, container, false);
        ListView lvNoti=view.findViewById(R.id.lvNoti);
        notiAdapter =new NotiAdapter(Noti.this.getActivity(),R.layout.listnoti);

        notiAdapter.add(new com.example.home.model.Noti("Optional Gift Box","Only today!"));
        notiAdapter.add(new com.example.home.model.Noti("Pyjamas Only 40k At TSN Store","From 8/12 to 31/12"));
        notiAdapter.add(new com.example.home.model.Noti("Hanuri, Zara and more 10 store have big sale today!",""));
        notiAdapter.add(new com.example.home.model.Noti("Book Domestic Flight, Get Cashback 40%","From 8/12/2020 to 31/1/2021"));
        notiAdapter.add(new com.example.home.model.Noti("Sale up to 50% at Zara Store","Big sale 12/12"));

        lvNoti.setAdapter(notiAdapter);

        return view;


    }


    public static void setListViewHeightBasedOnChildren(ListView listView) {
        listView=listView.findViewById(R.id.lvNoti);
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }

}