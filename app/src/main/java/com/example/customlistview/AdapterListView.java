package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterListView extends BaseAdapter {

    private ArrayList<Song> songs;
    private LayoutInflater songInf;

    public AdapterListView(Context c, ArrayList<Song> theSongs){
        songs = theSongs;
        songInf = LayoutInflater.from(c);
    }
    @Override
    public int getCount() {
        return songs.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LinearLayout songLay = (LinearLayout) songInf.inflate(R.layout.list_item, parent, false);
        TextView songView = songLay.findViewById(R.id.songName);
        TextView artistView = songLay.findViewById(R.id.artistName);
        Song currSong = songs.get(position);
        songView.setText(currSong.getTitle());
        songView.setText(currSong.getArtist());
        songLay.setTag(position);
        return songLay;
    }
}
