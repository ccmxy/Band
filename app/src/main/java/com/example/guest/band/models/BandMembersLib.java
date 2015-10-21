package com.example.guest.band.models;

import com.example.guest.band.R;
import com.example.guest.band.models.BandMember;

import java.util.ArrayList;

/**
 * Created by Guest on 10/21/15.
 */
public class BandMembersLib {

    private ArrayList<BandMember> mBandMemberArrayList;

    //Returns the array list
    public ArrayList<BandMember> getBandMembers(){
        return mBandMemberArrayList;
    }

    //Constructor
    public BandMembersLib () {
        setBandMembers();
    }

    public BandMember nextMember(BandMember currentBandMember) {
        int idx = mBandMemberArrayList.indexOf(currentBandMember);
        if(idx == mBandMemberArrayList.size() - 1){
            return mBandMemberArrayList.get(0);
        }
        else {
            return mBandMemberArrayList.get(idx + 1);
        }
    }

    //Used by the constructor to fill mBandMembersArrayList
    private void setBandMembers() {
        mBandMemberArrayList = new ArrayList<>();

        mBandMemberArrayList.add(new BandMember(
                "Scary",
                R.drawable.scary
        ));
        mBandMemberArrayList.add(new BandMember(
                "Sporty",
                R.drawable.sporty
        ));
        mBandMemberArrayList.add(new BandMember(
                "Posh",
                R.drawable.posh
        ));
        mBandMemberArrayList.add(new BandMember(
                "Ginger",
                R.drawable.ginger
        ));
        mBandMemberArrayList.add(new BandMember(
                "Baby",
                R.drawable.baby
        ));
    }


}
