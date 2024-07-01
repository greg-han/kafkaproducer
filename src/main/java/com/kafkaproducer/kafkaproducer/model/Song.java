package com.kafkaproducer.kafkaproducer.model;

import com.opencsv.bean.CsvBindByName;

public class Song {
    @CsvBindByName(column = "name")
    private String name;
    @CsvBindByName(column = "album")

    private String album;
    @CsvBindByName(column = "lyrics")

    private String lyrics;

    public Song(){
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAlbum(){
        return this.album;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public String getLyrics(){
        return this.lyrics;
    }

    public void setLyrics(String lyrics){
        this.lyrics = lyrics;
    }

    @Override
    public String toString(){
        return "Name:\n" + getName() + "\n" + "Lyrics:\n" +  getLyrics();
    }

}
