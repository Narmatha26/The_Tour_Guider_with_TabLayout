package com.example.thetourguider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class AttractionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attractions);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Meenakshi Amman Temple","Center of the city"));
        places.add(new Place("Thirumalai Nayakar Mahal","Vilakuthoon"));
        places.add(new Place("Vishal de mall","Chinna Chokkikulam"));
        places.add(new Place("Milan'em mall","K.K.Nagar"));
        places.add(new Place("Athisayam Theme Park","Paravai"));
        places.add(new Place("Rajaji park","Alwarpuram"));
        places.add(new Place("Gandhi Memorial Museum","Opp. to collector office"));
        places.add(new Place("Algar kovil","Alagar kovil main road"));
        places.add(new Place("Vaigai dam","Melmangalam"));
        places.add(new Place("St.Mary's Cathedral","East Veli street"));
        places.add(new Place("Kazimar big mosque","Periyar"));
        places.add(new Place("Thiruparankundram Temple","Thiruparankundram"));
        places.add(new Place("Meghamalai hills","Kadamalaikuntu"));

        PlaceAdapter placesAdapter = new PlaceAdapter(this, places);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(placesAdapter);




    }
}
