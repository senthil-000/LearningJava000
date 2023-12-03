package com.datastructures;

public class Song implements Comparable<Song>{
    
    private String artistName;
    private String album;
    private String rating;
    private String Bpm;

    public int hashCode(){
        return album.hashCode();
    }

    public boolean equals(Object aSong){
        Song s = (Song)  aSong;
        return getAlbum().equals(s.getAlbum());
    }

    public int compareTo(Song s){
        return album.compareTo(s.getAlbum());
    }
    
    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getBpm() {
        return Bpm;
    }

    public void setBpm(String bpm) {
        Bpm = bpm;
    }

    public String toString(){
        return album;
    }

    Song(String a, String n, String r, String bm) {
        this.artistName = n;
        this.album = a;
        this.rating = r;
        this.Bpm = bm;
    }



}
