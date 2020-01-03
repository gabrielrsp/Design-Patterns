package behavioralPatterns.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator {

    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s(){

        bestSongs = new ArrayList<SongInfo>();

        addSong("Imagine", "John Lennon", 1971);
        addSong("Bohemian Rhapsody", "Queen", 1975);
        addSong("September", "Earth Wind and Fire", 1978);

    }

    public void addSong(String songName, String bandName, int yearReleased){

        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

        bestSongs.add(songInfo);

    }

    /*
    public ArrayList<SongInfo> getBestSongs(){

        return bestSongs;

    }
    */

    @Override
    public Iterator createIterator() {
        return bestSongs.iterator();
    }
}
