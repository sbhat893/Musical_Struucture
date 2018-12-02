package com.examples.android.musicalstructure;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sumukh Prashant Bhat on 12-08-2018.
 */

public class ArtistAdapter extends ArrayAdapter<Songs> {

    public ArtistAdapter(@NonNull Context context, @NonNull ArrayList<Songs> song) {
        super(context, 0, song);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_artist, parent, false);
        }
        Songs currentWord = getItem(position);

        TextView artistText = listItemView.findViewById(R.id.first_text_view);
        assert currentWord != null;
        artistText.setText(currentWord.getArtistName());
        TextView songText = listItemView.findViewById(R.id.second_text_view);
        songText.setText(currentWord.getSongName());
        return listItemView;
    }
}
