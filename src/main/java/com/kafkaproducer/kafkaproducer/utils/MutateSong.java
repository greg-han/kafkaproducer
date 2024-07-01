package com.kafkaproducer.kafkaproducer.utils;

import com.kafkaproducer.kafkaproducer.model.Song;
public class MutateSong {

    public MutateSong(){

    }
    public Song mutate(Song song){
        String mutator = Double.toString(Math.random());
        song.setName(song.getName() + mutator);
        song.setAlbum(song.getAlbum() + mutator);
        song.setLyrics(song.getLyrics() + mutator);

        return song;
    }
}
