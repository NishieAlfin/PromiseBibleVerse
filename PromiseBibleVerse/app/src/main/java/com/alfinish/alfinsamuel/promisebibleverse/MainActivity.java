package com.alfinish.alfinsamuel.promisebibleverse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void verses(View v)
    {
        Intent intent= new Intent(this, Verses.class);
        startActivity(intent);
    }
}
