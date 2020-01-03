package behavioralPatterns.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator{


    SongInfo[] bestSongs;

    int arrayValue = 0;

    public  SongsOfThe80s(){

        bestSongs = new SongInfo[3];

        addSong("Take on Me", "A-ha", 1985);
        addSong("Time After Time", "Cindy Lauper", 1983);
        addSong("Billie Jean", "Michael Jackson", 1982);

    }


    public void addSong(String songName, String bandName, int yearReleased){

        SongInfo songInfo = new SongInfo(songName, bandName, yearReleased);

        bestSongs[arrayValue] = songInfo;

        arrayValue++;

    }

    /*
    public SongInfo[] getBestSongs() {

        return bestSongs;

    }
    */

    @Override
    public Iterator createIterator() {
        return Arrays.asList(bestSongs).iterator();
    }
}
