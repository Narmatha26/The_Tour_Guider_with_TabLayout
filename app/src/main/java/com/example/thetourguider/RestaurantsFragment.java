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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> restaurants = new ArrayList<>();
        restaurants.add(new Place("Ahaaram Multicuisine", "Palanganatham", R.drawable.ahaaram));
        restaurants.add(new Place("Fortune Pandian", "Race course colony", R.drawable.pandian));
        restaurants.add(new Place("Royal Court", "West Veli street", R.drawable.royal));
        restaurants.add(new Place("Courtyard by Marriott", "Race course colony", R.drawable.marriott));
        restaurants.add(new Place("Heritage", "Kochadai", R.drawable.heritage));
        restaurants.add(new Place("Temple city", "Vadipatti", R.drawable.templecity));
        restaurants.add(new Place("Barbeque Bistrro", "Milan'em mall 3rd floor", R.drawable.bistrro));
        restaurants.add(new Place("Murugan Idli Shop", "West Masi street", R.drawable.muruganidli));
        restaurants.add(new Place("Konar mess", "Town hall road", R.drawable.konar));
        restaurants.add(new Place("Thalapakatti", "Kalavasal, Bypass road", R.drawable.thalapakatti));

        PlaceAdapter restaurantsAdapter = new PlaceAdapter(getActivity(), restaurants, R.color.category_restaurants);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(restaurantsAdapter);

        return rootView;
    }
}
