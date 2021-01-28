package com.bssoft.bsmycredit;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {


    private NavigationView navigationView;
    private ActionBarDrawerToggle actionBarDrawerToggle;
    private DrawerLayout drawerLayout;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("MCredit");

        navigationView = findViewById(R.id.navmenu);
        drawerLayout = findViewById(R.id.drawer_layout);

        setSupportActionBar(toolbar);

        actionBarDrawerToggle = new ActionBarDrawerToggle(MainActivity.this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.db1:
                        startActivity(new Intent(MainActivity.this,BidActivity.class));
                        break;
                    case R.id.db2:
                        startActivity(new Intent(MainActivity.this, HistoryPaymentActivity.class));
                        break;
                    case R.id.db3:
                        startActivity(new Intent(MainActivity.this,GraphActivity.class));
                        break;
                    case R.id.db4:
                        startActivity(new Intent(MainActivity.this,HelpActivity.class));
                        break;
                    case R.id.db5:
                       finish();
                        break;
                    case R.id.db6:
                        startActivity(new Intent(MainActivity.this,NotificationActivity.class));
                        break;
                }
                return true;
            }
        });
    }


    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {

            super.onBackPressed();
        }

    }

}