package com.alfinish.alfinsamuel.promisebibleverse;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class Godbless extends AppCompatActivity {
    private static final String TAG = "MyActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_godbless);
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        Intent intent = getIntent();
        String activity = intent.getStringExtra("activity");

if (activity.equals("first"))
        {
            Verse1.mp.stop();
            Verse1.mp.release();
            Verse1.mp = null;
        }
        else if (activity.equals("second"))
        {
            Verse2.mp.stop();
            Verse2.mp.release();
            Verse2.mp = null;
        }
else if (activity.equals("third"))
{
    Verse3.mp.stop();
    Verse3.mp.release();
    Verse3.mp = null;
}
else if (activity.equals("four"))
{
    verse4.mp.stop();
    verse4.mp.release();
    verse4.mp = null;
}
else if (activity.equals("five"))
{
    Verse5.mp.stop();
    Verse5.mp.release();
    Verse5.mp = null;
}
else if (activity.equals("six"))
{
    Verse6.mp.stop();
    Verse6.mp.release();
    Verse6.mp = null;
}
else if (activity.equals("seven"))
{
    Verse7.mp.stop();
    Verse7.mp.release();
    Verse7.mp = null;
}
else if (activity.equals("eight"))
{
    Verse8.mp.stop();
    Verse8.mp.release();
    Verse8.mp = null;
}
else if (activity.equals("nine"))
{
    Verse9.mp.stop();
    Verse9.mp.release();
    Verse9.mp = null;
}
else if (activity.equals("ten"))
{
    Verse10.mp.stop();
    Verse10.mp.release();
    Verse10.mp = null;
}
else if (activity.equals("eleven"))
{
    Verse11.mp.stop();
    Verse11.mp.release();
    Verse11.mp = null;
}
else if (activity.equals("twelve"))
{
    Verse12.mp.stop();
    Verse12.mp.release();
    Verse12.mp = null;
}
else if (activity.equals("thirteen"))
{
    Verse13.mp.stop();
    Verse13.mp.release();
    Verse13.mp = null;
}
else if (activity.equals("fourteen"))
{
    Verse14.mp.stop();
    Verse14.mp.release();
    Verse14.mp = null;
}
else if (activity.equals("fifteen"))
{
    Verse15.mp.stop();
    Verse15.mp.release();
    Verse15.mp = null;
}
else if (activity.equals("sixteen"))
{
    Verse16.mp.stop();
    Verse16.mp.release();
    Verse16.mp = null;
}
else if (activity.equals("seventeen"))
{
    Verse17.mp.stop();
    Verse17.mp.release();
    Verse17.mp = null;
}
else if (activity.equals("eighteen"))
{
    Verse18.mp.stop();
    Verse18.mp.release();
    Verse18.mp = null;
}
else if (activity.equals("nineteen"))
{
    Verse19.mp.stop();
    Verse19.mp.release();
    Verse19.mp = null;
}
else if (activity.equals("twenty"))
{
    Verse20.mp.stop();
    Verse20.mp.release();
    Verse20.mp = null;
}
    }
}
