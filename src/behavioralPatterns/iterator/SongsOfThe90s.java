package behavioralPatterns.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator {

    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();

    int hashKey = 0;

    public  SongsOfThe90s(){

        addSong("Wonderwall", "Oasis", 1995);
        addSong("Zombie", "The Cranberries", 1993);
        addSong("Enter Sandman", "Metallica", 1991);

    }


    public void addSong(String songName, String bandName, int yearReleased){

        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

        bestSongs.put(hashKey, songInfo);

        hashKey++;

    }

/*
    Hashtable<Integer, SongInfo> getBestSongs() {

        return bestSongs;

    }
*/

    @Override
    public Iterator createIterator() {
        return bestSongs.values().iterator();
    }
}
