package com.example.guest.band.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.guest.band.R;
import com.example.guest.band.models.Album;
import com.example.guest.band.models.AlbumLib;

public class discography extends AppCompatActivity {
    private TextView mAlbumName;
    private Button mNextButton;
    private Album mCurrentAlbum;
    private AlbumLib mAlbumLib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discography);

        mAlbumName = (TextView) findViewById(R.id.albumNameText);
        mNextButton = (Button) findViewById(R.id.nextDiscButton);
        mAlbumLib = new AlbumLib();
        mCurrentAlbum = mAlbumLib.getAlbums().get(0);
        mAlbumName.setText(mCurrentAlbum.getName());

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCurrentAlbum = mAlbumLib.nextAlbum(mCurrentAlbum);
                mAlbumName.setText(mCurrentAlbum.getName());
            }
        });
    }

}
