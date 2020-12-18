package com.example.home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.internal.NavigationMenu;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final int REQUEST_CODE =1 ;
    BottomNavigationView bottomNavigationView;
    NavigationMenu navigationMenu;
    Button buttonbooking;
    private DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.hamburger);

        mDrawerLayout = findViewById(R.id.drawer_layout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        Fragment selectedFragment=null;

                        switch (menuItem.getItemId()){
                            case R.id.booking:
                                selectedFragment=new Booking();
                                actionbar.setTitle("Booking");
                                break;
                            case R.id.flight:
                                selectedFragment=new Booking();
                                actionbar.setTitle("My Flight");
                                break;
                            case R.id.departures:
                                selectedFragment=new Departures();
                                actionbar.setTitle("Departures");
                                break;
                            case R.id.dining:
                                selectedFragment=new Explore();
                                actionbar.setTitle("Explore");
                                break;
                            case R.id.qr:
                                openCamera();
                                selectedFragment=new Explore();
                                break;
                            case R.id.map:
                                selectedFragment=new Map();
                                actionbar.setTitle("Map");
                                break;
                            case R.id.tsn:
                                selectedFragment=new Aboutus();
                                actionbar.setTitle("About TSN");
                                break;

                        }
                        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,selectedFragment).commit();

                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });

        mDrawerLayout.addDrawerListener(
                new DrawerLayout.DrawerListener() {
                    @Override
                    public void onDrawerSlide(@NonNull View drawerView, float slideOffset) {

                    }

                    @Override
                    public void onDrawerOpened(@NonNull View drawerView) {

                    }

                    @Override
                    public void onDrawerClosed(@NonNull View drawerView) {

                    }

                    @Override
                    public void onDrawerStateChanged(int newState) {

                    }
                }

        );
        bottomNavigationView=findViewById(R.id.bottomNavigationView);
        BottomNavigationView.OnNavigationItemSelectedListener navListener=new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment=null;

                switch (item.getItemId()){
                    case R.id.home2:
                        selectedFragment=new Home();
                        break;
                    case R.id.booking2:
                        selectedFragment=new Booking();
                        actionbar.setTitle("Booking");
                        break;
                    case R.id.explore2:
                        selectedFragment=new Explore();
                        actionbar.setTitle("Explore");
                        break;
                    case R.id.map2:
                        selectedFragment=new Map();
                        actionbar.setTitle("Map");
                        break;
                    case R.id.noti2:
                        selectedFragment=new Noti();
                        actionbar.setTitle("Notification");

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment,selectedFragment).commit();

                return  true;
            }
        };
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment,new Home()).commit();

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
            case R.id.menuscanqr:
                openCamera();


        }
        return super.onOptionsItemSelected(item);
    }
    private void openCamera() {
        Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,REQUEST_CODE);//mở lên lấy data trả về

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menuheader, menu);
        return true;
    }





}