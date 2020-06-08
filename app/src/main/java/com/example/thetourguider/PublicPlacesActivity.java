package com.example.thetourguider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.ParcelUuid;
import android.widget.ListView;

import java.util.ArrayList;

public class PublicPlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        ArrayList<Place> publicPlaces = new ArrayList<>();
        publicPlaces.add(new Place("Airport","Avaniyapuram"));
        publicPlaces.add(new Place("Railway Station","Southern Railway Colony"));
        publicPlaces.add(new Place("SIPCOT","Kappalur"));
        publicPlaces.add(new Place("Aavin Milk Industry","Sathamangalam"));
        publicPlaces.add(new Place("Indian Technical Institute","K.Pudur"));
        publicPlaces.add(new Place("Collector office","Alwarpuram"));
        publicPlaces.add(new Place("Govt. Medical College","Alwarpuram"));
        publicPlaces.add(new Place("Rajaji Hospital","Alwarpuram"));
        publicPlaces.add(new Place("Flower Market","Mattuthavani"));
        publicPlaces.add(new Place("Yanaimalai","Narasingam"));

        PlaceAdapter publicPlaesAdapter = new PlaceAdapter(this, publicPlaces);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(publicPlaesAdapter);


    }
}
