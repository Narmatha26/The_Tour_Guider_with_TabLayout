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
public class PublicPlacesFragment extends Fragment {

    public PublicPlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> publicPlaces = new ArrayList<>();
        publicPlaces.add(new Place("Airport", "Avaniyapuram", R.drawable.airport));
        publicPlaces.add(new Place("Railway Station", "Southern Railway Colony", R.drawable.railway));
        publicPlaces.add(new Place("SIPCOT", "Kappalur", R.drawable.sipcot));
        publicPlaces.add(new Place("Aavin Milk Industry", "Sathamangalam", R.drawable.aavin));
        publicPlaces.add(new Place("Indian Technical Institute", "K.Pudur", R.drawable.iti));
        publicPlaces.add(new Place("Collector office", "Alwarpuram", R.drawable.office));
        publicPlaces.add(new Place("Govt. Medical College", "Alwarpuram", R.drawable.mmc));
        publicPlaces.add(new Place("Rajaji Hospital", "Alwarpuram", R.drawable.hospital));
        publicPlaces.add(new Place("Flower Market", "Mattuthavani", R.drawable.market));
        publicPlaces.add(new Place("Yanaimalai", "Narasingam", R.drawable.yanai));

        PlaceAdapter publicPlacesAdapter = new PlaceAdapter(getActivity(), publicPlaces, R.color.category_public_places);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(publicPlacesAdapter);

        return rootView;
    }
}
