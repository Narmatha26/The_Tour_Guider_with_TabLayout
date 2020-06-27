package com.example.thetourguider;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new RestaurantsFragment()).commit();
    }
}
