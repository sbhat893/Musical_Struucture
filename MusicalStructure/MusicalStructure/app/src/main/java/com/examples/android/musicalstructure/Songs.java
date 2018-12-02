package com.examples.android.musicalstructure;

/**
 * Created by Sumukh Prashant Bhat on 12-08-2018.
 */

public class Songs {
    private String mSongName;
    private String mArtistName;

    public Songs(String songName, String artistName) {
        this.mSongName = songName;
        this.mArtistName = artistName;
    }

    public String getSongName() {
        return mSongName;
    }

    public String getArtistName() {
        return mArtistName;
    }
}
