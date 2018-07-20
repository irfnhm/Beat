package com.example.irfan.beat;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView musicLibray = (TextView) findViewById(R.id.goto_library);

        musicLibray.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent library = new Intent(MainActivity.this, TrackList.class);

                // Start the new activity
                startActivity(library);
            }
        });


        TextView nowPlaying = (TextView) findViewById(R.id.goto_player);

        nowPlaying.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent player = new Intent(MainActivity.this, PlayerActivity.class);

                // Start the new activity
                startActivity(player);
            }
        });

    }
}
