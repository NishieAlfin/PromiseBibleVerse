package com.alfinish.alfinsamuel.promisebibleverse;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Verse16 extends AppCompatActivity {
    protected static MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verse16);
    }
    public void song16(View view) {

        if (mp == null)
        {
            mp = MediaPlayer.create(this, R.raw.song1);
        }
        mp.start();
        Intent intent = new Intent(this, Godbless.class);
        intent.putExtra("activity","sixteen");
        startActivity(intent);
    }
}
