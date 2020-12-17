package com.example.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.internal.NavigationMenu;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    NavigationMenu navigationMenu;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);







       linkViews();
       addEvents();
    }



    private void linkViews() {
        bottomNavigationView=findViewById(R.id.bottomNavigationView);

    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener=new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment=null;

            switch (item.getItemId()){
                case R.id.home2:
                    selectedFragment=new Home();
                    break;
                case R.id.booking2:
                    selectedFragment=new Booking();
                    break;
                case R.id.explore2:
                    selectedFragment=new Explore();
                    break;
                case R.id.map2:
                    selectedFragment=new Map();
                    break;
                case R.id.noti2:
                    selectedFragment=new Noti();

            }
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment,selectedFragment).commit();

            return  true;
        }
    };
    private void addEvents() {
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new Home()).commit();



    }


}