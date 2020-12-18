package com.example.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class Explore extends Fragment {
    RecyclerView recyclerView, recycler_shopping_view;
    ArrayList<MainModel> mainModels;
    ArrayList<MainModel> shopModels;
    MainAdapter mainAdapter,shopAdapter;
//    Button btnDining, btnShopping;
//    ListView lvDiningExplore;
//    String[] othersDining={"American","Appetizers","Asian","Bagel","Bakery",
//            "Bar","Beer","Breakfast","Burger","Chinese","Fast Food","Fries",
//    "Hot Dog","Ice Cream","Italian","Salads","Sushi"};
//    ArrayAdapter<String> diningAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_explore, container, false);
//        btnDining=rootView.findViewById(R.id.btnDining);
//        btnDining.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                Dining dining= new Dining();
//                FragmentTransaction transaction=getChildFragmentManager().beginTransaction();
//                transaction.replace(R.id.fragment,dining);
//                transaction.commit();
//            }
//        });
//
//        lvDiningExplore=rootView.findViewById(R.id.lvOthersDining);
//        diningAdapter=new ArrayAdapter<String>
//                (getActivity(), android.R.layout.simple_list_item_1, othersDining);
//        lvDiningExplore.setAdapter(diningAdapter);

        recyclerView= rootView.findViewById(R.id.recycler_view);

        Integer[] popularImg={R.drawable.pop_coffee,R.drawable.pop_breakfast,
                R.drawable.pop_bar, R.drawable.pop_pastry, R.drawable.pop_restaurant, R.drawable.pop_burger,R.drawable.pop_pizza,R.drawable.pop_salad};

        String[] popularName={"Coffee","Breakfast","Bar","Pastry","Restaurant","Burger","Pizza","Salads"};



        mainModels=new ArrayList<>();
        for(int i=0;i<popularImg.length;i++){
            MainModel mainmodel=new MainModel(popularImg[i],popularName[i]);
            mainModels.add(mainmodel);
        }
        LinearLayoutManager layoutManager;
        layoutManager = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        mainAdapter=new MainAdapter(getActivity(),mainModels);
        recyclerView.setAdapter(mainAdapter);

        recycler_shopping_view=rootView.findViewById(R.id.recycler_shopping_view);
        Integer[] shopImg={R.drawable.shop_accessories,R.drawable.shop_apparel,
                R.drawable.shop_fragrances, R.drawable.shop_jewelry, R.drawable.shop_pharmacy, R.drawable.shop_phoneaaccessories,R.drawable.shop_travelessentials};
        String[] shopName={"Accessories","Apparel","Fragrances","Jewelry","Pharmacy","Phone Accessories","Travel Essentials"};

        shopModels=new ArrayList<>();
        for(int i=0;i<shopImg.length;i++){
            MainModel shopmodel=new MainModel(shopImg[i],shopName[i]);
            shopModels.add(shopmodel);
        }
        LinearLayoutManager layoutManager2;
        layoutManager2 = new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false);

        recycler_shopping_view.setLayoutManager(layoutManager2);
        recycler_shopping_view.setItemAnimator(new DefaultItemAnimator());

        shopAdapter=new MainAdapter(getActivity(),shopModels);
        recycler_shopping_view.setAdapter(shopAdapter);



        return rootView;



    }
}