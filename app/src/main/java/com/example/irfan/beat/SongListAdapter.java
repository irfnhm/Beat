package com.example.irfan.beat;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class SongListAdapter extends ArrayAdapter<Song> {

    public SongListAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentWord = getItem(position);
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.song_text_view);
        miwokTextView.setText(currentWord.getSong());
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        defaultTextView.setText(currentWord.getArtist());
        return listItemView;
    }

}
