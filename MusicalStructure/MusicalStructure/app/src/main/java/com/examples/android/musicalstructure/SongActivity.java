package com.examples.android.musicalstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Sumukh Prashant Bhat on 11-08-2018.
 */

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);
        final ArrayList<Songs> songList = new ArrayList<>();
        songList.add(new Songs("Ae Dil Hai Mushkil", "Pritam,Arjit Singh"));
        songList.add(new Songs("Back To You", "Selena Gomez"));
        songList.add(new Songs("Ban Ja Rani", "Guru Randhawa"));
        songList.add(new Songs("Dil Chori", "Yo Yo Honey Singh"));
        songList.add(new Songs("Get Low", "Zedd,Liam Payne"));
        songList.add(new Songs("Ignite", "Alan Walker"));
        songList.add(new Songs("Pal", "Arjit Singh"));
        songList.add(new Songs("Suno- Na Sangemarmar", "Arjit Singh"));
        songList.add(new Songs("Tareefan", "Badshah"));
        songList.add(new Songs("Ya ali", "Zubeen Garg"));

        SongAdapter adapter = new SongAdapter(this, songList);
        ListView listView = findViewById(R.id.rootView);
        listView.setAdapter((ListAdapter) adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(SongActivity.this, PlayingActivity.class);
                i.putExtra("songName", songList.get(position).getSongName());
                i.putExtra("artist", songList.get(position).getArtistName());
                startActivity(i);
            }
        });
    }
}
