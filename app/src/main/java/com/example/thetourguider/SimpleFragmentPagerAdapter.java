package com.example.thetourguider;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new AttractionsFragment();
        }else if(position == 1){
            return new RestaurantsFragment();
        }else if(position == 2){
            return new PublicPlacesFragment();
        }else{
            return new EventsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
