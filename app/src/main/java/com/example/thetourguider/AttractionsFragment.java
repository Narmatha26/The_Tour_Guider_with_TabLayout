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
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Meenakshi Amman Temple", "Center of the city", R.drawable.meenakshi));
        places.add(new Place("Thirumalai Nayakar Mahal", "Vilakuthoon", R.drawable.thirumalai));
        places.add(new Place("Vishal de mall", "Chinna Chokkikulam", R.drawable.vishalde));
        places.add(new Place("Milan'em mall", "K.K.Nagar", R.drawable.milan));
        places.add(new Place("Athisayam Theme Park", "Paravai", R.drawable.athisayam));
        places.add(new Place("Rajaji park", "Alwarpuram", R.drawable.park));
        places.add(new Place("Gandhi Memorial Museum", "Opp. to collector office", R.drawable.museum));
        places.add(new Place("Azhagar kovil", "Alagar kovil main road", R.drawable.azhagar));
        places.add(new Place("Vaigai dam", "Melmangalam", R.drawable.vaigai));
        places.add(new Place("St.Mary's Cathedral", "East Veli street", R.drawable.church));
        places.add(new Place("Kazimar big mosque", "Periyar", R.drawable.mosque));
        places.add(new Place("Thiruparankundram Temple", "Thiruparankundram", R.drawable.murugantemple));
        places.add(new Place("Meghamalai hills", "Kadamalaikuntu", R.drawable.megamalai));

        PlaceAdapter placesAdapter = new PlaceAdapter(getActivity(), places, R.color.category_attractions);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placesAdapter);
        return rootView;

    }
}
