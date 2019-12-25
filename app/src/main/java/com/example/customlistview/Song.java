package com.example.customlistview;

public class Song {

    private long id;
    private String title;
    private String artist;

    public Song(long SongID, String Songtitle, String Songartist){
        id = SongID;
        title = Songtitle;
        artist = Songartist;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}
