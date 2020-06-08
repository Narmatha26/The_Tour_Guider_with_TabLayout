package com.example.thetourguider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        ArrayList<Place> restaurants = new ArrayList<>();
        restaurants.add(new Place("Ahaaram Multicuisine","Palanganatham"));
        restaurants.add(new Place("Fortune Pandian","Race course colony"));
        restaurants.add(new Place("Royal Court","West Veli street"));
        restaurants.add(new Place("Courtyard by Marriott","Race course colony"));
        restaurants.add(new Place("Heritage","Kochadai"));
        restaurants.add(new Place("Temple city","Vadipatti"));
        restaurants.add(new Place("Barbeque Bistrro","Milan'em mall 3rd floor"));
        restaurants.add(new Place("Murugan Idli Shop","West Masi street"));
        restaurants.add(new Place("Konar mess","Town hall road"));
        restaurants.add(new Place("Thalapakatti","Kalavasal, Bypass road"));

        PlaceAdapter restaurantsAdapter = new PlaceAdapter(this, restaurants);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(restaurantsAdapter);
    }
}
