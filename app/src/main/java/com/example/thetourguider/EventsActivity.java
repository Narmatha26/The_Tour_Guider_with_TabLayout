package com.example.thetourguider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.place_list);

        ArrayList<Place> events = new ArrayList<>();
        events.add(new Place("Chithirai Thiruvizha","Goripalayam"));
        events.add(new Place("Puttu Thiruvizha","Arapalayam Cross road"));
        events.add(new Place("Jallikattu","Alanganallur"));
        events.add(new Place("Theppa Thiruvizha","Theppakulam"));
        events.add(new Place("Karthigai Dheepam","Thiruparankundram"));
        events.add(new Place("Chithirai Exhibition","Tamukkam"));

        PlaceAdapter eventsAdapter = new PlaceAdapter(this, events);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(eventsAdapter);



    }
}
