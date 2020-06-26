package com.example.thetourguider;

public class Place {
    private String mPlace;
    private String mLocation;
    private int mImageResourceId;

    public Place(String place, String location, int imageResourceId){
        mPlace = place;
        mLocation = location;
        mImageResourceId = imageResourceId;
    }

    public String getPlace(){
        return mPlace;
    }

    public String getLocation(){
        return mLocation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }
}
