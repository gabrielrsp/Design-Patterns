package behavioralPatterns.iterator;

import estruturalPatterns.composite.Song;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;

public class DiscJockey {

        SongIterator iter70sSongs;
        SongIterator iter80sSongs;
        SongIterator iter90sSongs;

        public DiscJockey(SongIterator newSongsOfThe70s, SongIterator newSongsOfThe80s, SongIterator newSongsOfThe90s ){

            iter70sSongs = newSongsOfThe70s;
            iter80sSongs = newSongsOfThe80s;
            iter90sSongs = newSongsOfThe90s;

        }

        public void showTheSongs() {

            Iterator songs70s = iter70sSongs.createIterator();
            Iterator songs80s = iter80sSongs.createIterator();
            Iterator songs90s = iter90sSongs.createIterator();

            System.out.println("\nSongs of the 70s\n");
            printTheSongs(songs70s);

            System.out.println("\nSongs of the 80s\n");
            printTheSongs(songs80s);

            System.out.println("\nSongs of the 90s\n");
            printTheSongs(songs90s);

        }

            public void printTheSongs(Iterator iterator){

                while (iterator.hasNext()) {

                    SongInfo songInfo = (SongInfo) iterator.next();

                    System.out.println(songInfo.getSongName());
                    System.out.println(songInfo.getBandName());
                    System.out.println(songInfo.getYearReleased());

                }
            }
        }


