package com.example.thetourguider;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {

    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> events = new ArrayList<>();
        events.add(new Place("Chithirai Thiruvizha", "Goripalayam", R.drawable.thiruvizha));
        events.add(new Place("Puttu Thiruvizha", "Arapalayam Cross road", R.drawable.puttu));
        events.add(new Place("Jallikattu", "Alanganallur", R.drawable.jallikattu));
        events.add(new Place("Theppa Thiruvizha", "Theppakulam", R.drawable.theppam));
        events.add(new Place("Karthigai Dheepam", "Thiruparankundram", R.drawable.dheepam));
        events.add(new Place("Chithirai Exhibition", "Tamukkam", R.drawable.exhibition));

        PlaceAdapter eventsAdapter = new PlaceAdapter(getActivity(), events, R.color.category_events);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(eventsAdapter);

        return rootView;
    }
}
