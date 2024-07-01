package com.kafkaproducer.kafkaproducer.model;
import com.opencsv.bean.CsvBindByName;

public class MetalSong {
    @CsvBindByName(column = "Artist", required = false)
    private String artist;
    @CsvBindByName(column = "Album", required = false)

    private String album;
    @CsvBindByName(column = "Song", required = false)

    private String song;
    @CsvBindByName(column = "Lyric", required = false)

    private String lyric;
    @CsvBindByName(column = "SongNum", required = false)

    private String songnum;
    @CsvBindByName(column = "Year", required = false)

    private String year;

    @CsvBindByName(column = "DetectedLanguage")
    private String language;

    @CsvBindByName(column = "Certainty")
    private String certainty;



    public MetalSong(){
    }
    public MetalSong(String artist, String album, String song, String lyric, String songnum, String year){
        this.artist = artist;
        this.album = album;
        this.song = song;
        this.lyric = lyric;
        this.songnum = songnum;
        this.year = year;
    }

    public String getArtist(){
        return this.artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getAlbum(){
        return this.album;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public String getSong(){
        return this.song;
    }

    public void setSong(String song){
        this.song = song;
    }

    public String getLyric(){
        return this.lyric;
    }

    public void setLyric(String lyric){
        this.lyric = lyric;
    }

    public String getSongnum(){ return this.songnum; }

    public void setSongnum(String songnum){
        this.songnum = songnum;
    }

    public String getYear(){
        return this.year;
    }

    public void setYear(String year){
        this.year = year;
    }

    public String getLanguage(){
        return this.language;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    @Override
    public String toString(){
        return "Song:\n" + this.getSong() + "\n" + "Lyrics:\n" + this.getLyric();
    }

}
