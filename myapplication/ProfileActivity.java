package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ProfileActivity extends AppCompatActivity {

    TextView text;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        BottomNavigationView btn = findViewById(R.id.bottom_nav_bar);

        //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new Fragment_first()).commit();

        btn.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment current_fragment = null;
                switch (item.getItemId()){
                    case R.id.first:
                        current_fragment = new Fragment_first();
                        break;

                    case R.id.second:

                        current_fragment = new Fragment_second();

                        break;


                    case R.id.third:

                        current_fragment = new Fragment_third();

                        break;

                    case R.id.four:

                        current_fragment = new Fragment_four();


                        break;
                }

                //getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,current_fragment).commit();

                return true;
            }
        });
    }
}
