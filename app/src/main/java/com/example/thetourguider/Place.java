package com.example.thetourguider;

public class Place {
    private String mPlace;
    private String mLocation;

    public Place(String place, String location){
        mPlace = place;
        mLocation = location;
    }

    public String getPlace(){
        return mPlace;
    }

    public String getLocation(){
        return mLocation;
    }
}
