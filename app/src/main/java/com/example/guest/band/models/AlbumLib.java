package com.example.guest.band.models;

import java.util.ArrayList;

/**
 * Created by Guest on 10/21/15.
 */
public class AlbumLib {
    private ArrayList<Album> mAlbumsList;

    //Returns the array list
    public ArrayList<Album> getAlbums(){
        return mAlbumsList;
    }

    //Constructor
    public AlbumLib () {
        setAlbums();
    }

    private void setAlbums() {
        mAlbumsList = new ArrayList<>();

        //Creating albums with the default album constructor and adding to list
        mAlbumsList.add(new Album(
                "Spice"
        ));
        mAlbumsList.add(new Album(
                "Spiceworld"
        ));
        mAlbumsList.add(new Album(
                "Forever"
        ));

    }

    public Album nextAlbum(Album currentAlbum) {
        int idx = mAlbumsList.indexOf(currentAlbum);
        if(idx == mAlbumsList.size() - 1){
            return mAlbumsList.get(0);
        }
        else {
            return mAlbumsList.get(idx + 1);
        }
    }

}
