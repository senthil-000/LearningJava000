package com.datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class JukeBox {
    
    ArrayList<Song> songList = new ArrayList<Song>();

    JukeBox(){}

    public void go(){
        getSong();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);
        System.out.println(songList);
/*Hash Set */
        HashSet<Song>  songSet = new HashSet<Song>();
        songSet.addAll(songList);
        System.out.println("HashSet" + songSet);

/*Tree Set */
        TreeSet<Song> tsongSet = new TreeSet<Song>();
        tsongSet.addAll(songList);
        System.out.println("TreeSet:" + tsongSet);
    }

    void getSong(){
        try{
            File file = new File("c:/Users/senth/javasrc/LearningJava000/datastructures/Songs.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line= reader.readLine()) != null ) {
                addSong(line);                
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    void addSong(String lineToParse){
        String[] tokens = lineToParse.split("/");
        Song s = new Song(tokens[0],tokens[1],tokens[2],tokens[3]);
        songList.add(s);
    }

    class ArtistCompare implements Comparator<Song> {

        public int compare(Song one, Song two){
            return one.getArtistName().compareTo(two.getArtistName());
        }
        
    }

}
