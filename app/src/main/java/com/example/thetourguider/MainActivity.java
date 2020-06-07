package com.example.thetourguider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView attractionsTextView = findViewById(R.id.attractions);
        attractionsTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent attractionsIntent = new Intent(MainActivity.this, AttractionsActivity.class);
                startActivity(attractionsIntent);
            }
        });

        TextView restaurantsTextView = findViewById(R.id.restaurants);
        restaurantsTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent restaurantsIntent = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurantsIntent);
            }
        });

        TextView publicPlacesTextView = findViewById(R.id.publicPlaces);
        publicPlacesTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent publicPlacesIntent = new Intent(MainActivity.this, PublicPlacesActivity.class);
                startActivity(publicPlacesIntent);
            }
        });

        TextView eventsTextView = findViewById(R.id.events);
        eventsTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent eventsIntent = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(eventsIntent);
            }
        });

    }
}
