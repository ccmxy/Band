package com.example.guest.band;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BandMembersActivity extends AppCompatActivity {
    private TextView mBandMemberName;
    private Button mNextButton;
    private BandMember mCurrentBandMember;
    private BandMembersLib mBandMembersLib;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_band_members);

        mBandMemberName = (TextView) findViewById(R.id.bandMemberName);
        mNextButton = (Button) findViewById(R.id.nextButton);
        mBandMembersLib = new BandMembersLib();
        mCurrentBandMember = mBandMembersLib.getBandMembers().get(0);
        mBandMemberName.setText(mCurrentBandMember.getName());

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentBandMember = mBandMembersLib.nextMember(mCurrentBandMember);
                mBandMemberName.setText(mCurrentBandMember.getName());
            }
        });


        // mBandMemberName.setText(mCurrentBandMember.getName());
    }
}
//private void setLayoutContent() {
//    }
//
//
//
//}
