package com.example.irfan.beat;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class TrackList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);


        ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song("Done for Me", "Charlie Puth ft. Kehlani"));
        songs.add(new Song("Dark Spring", "Beach House"));
        songs.add(new Song("Sleep", "Hatchie"));
        songs.add(new Song("Beyond", "Leon Bridges"));
        songs.add(new Song("Close", "Rae Sremmurd ft. Travis Scott"));
        songs.add(new Song("4Ever", "Clairo"));
        songs.add(new Song("Out of Focus", "The Ramona Flowers"));
        songs.add(new Song("Hands on Me", "BURNS, Maluma, Rae Sremmurd"));
        songs.add(new Song("Noisy Heaven", "Quiet Slang"));
        songs.add(new Song("Miracle", "Chvrches"));


        SongListAdapter adapter = new SongListAdapter(this, songs);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
