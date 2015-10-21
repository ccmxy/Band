package com.example.guest.band.models;

/**
 * Created by Guest on 10/21/15.
 */
public class BandMember {
    private String mName;
    private int mImage;

    //default constructor
    public BandMember(String name, int image){
        mName = name;
        mImage = image;
    }

    //Return the name of band member
    public String getName() {
        return mName;
    }

    public int getImage() {
        return mImage;
    }



}
