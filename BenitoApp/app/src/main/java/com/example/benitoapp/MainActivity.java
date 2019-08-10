package com.example.benitoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.support.annotation.IdRes;
import android.support.annotation.NonNull;
import android.support.widget.BottomNavigationView;;
import android.view.MenuItem;
import android.view.View;

import androidx.navigation.NavHost;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);



        navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {
                    case R.id.one:
                        Navigation.createNavigateOnClickListener(R.id.fragment1);
                        break;
                    case R.id.two:


//                        NavHostFragment.findNavController(this);
                        break;
                    case R.id.three:
                        Navigation.createNavigateOnClickListener(R.id.fragment3);
                        break;
                }

                return false;
            }
        });
    }
    }
}
