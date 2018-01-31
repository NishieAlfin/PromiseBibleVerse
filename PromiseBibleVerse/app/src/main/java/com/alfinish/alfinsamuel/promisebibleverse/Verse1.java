package com.alfinish.alfinsamuel.promisebibleverse;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class Verse1 extends AppCompatActivity {
    protected static MediaPlayer mp;
   // private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verse1);
    }

    public void song1(View view) {

        if (mp == null)
        {
           // Log.v(TAG, "Initializing sounds...");

        mp = MediaPlayer.create(this, R.raw.song1);
    }
       // Log.v(TAG, "Playing sound...");
        mp.start();
        //Log.v(TAG, "Sounds initialized.");
        Intent intent = new Intent(this, Godbless.class);
        intent.putExtra("activity","first");
        startActivity(intent);
    }

}

