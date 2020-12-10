package com.example.home.adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.home.R;
import com.example.home.model.Noti;

import java.util.List;

public class NotiAdapter extends ArrayAdapter<Noti> {
     Activity context; //đại diện cho màn hình đang có listview
     int custom_item_layout; //đại diện cho giao diện từng item
     List<Noti> notiList;

    public NotiAdapter(Activity context, int custom_item_layout){
        super(context,custom_item_layout);
        this.context=context;
        this.custom_item_layout=custom_item_layout;
    }

      @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=this.context.getLayoutInflater();
        View customView=inflater.inflate(this.custom_item_layout,null);

        TextView txtTitle=customView.findViewById(R.id.txtNoti);
        TextView txtCaption=customView.findViewById(R.id.txtCaption);

        Noti noti= (Noti) getItem(i);
        txtTitle.setText(noti.getTitle());
        txtCaption.setText(noti.getCaption());

        return customView;

    }
}
