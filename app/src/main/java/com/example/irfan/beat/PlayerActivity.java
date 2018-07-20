package com.example.irfan.beat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class PlayerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);
    }

    public void changeState(View view){
        Button activity =  (Button) findViewById(R.id.playState);
        activity.setBackgroundResource(R.drawable.pause);
    }
}
