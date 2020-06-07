package com.example.thetourguider;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    private static final String LOG_TAG = PlaceAdapter.class.getSimpleName();

    public PlaceAdapter(Activity context, ArrayList<Place> places){
        super(context, 0, places);
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Place currentPlace = getItem(position);

        TextView placeTextView = listItemView.findViewById(R.id.place);
        placeTextView.setText(currentPlace.getPlace());

        TextView locationTextView = listItemView.findViewById(R.id.location);
        locationTextView.setText(currentPlace.getLocation());

        return listItemView;
    }
}
