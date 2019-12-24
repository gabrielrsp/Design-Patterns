package estruturalPatterns.composite;

public class SongListGenerator {

    public static void main(String[] args){

        SongComponent industrialMusic = new SongGroup("Industrial", "is a style of experimental music");

        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "is a genre of rock");

        SongComponent dubstepMusic = new SongGroup("Dubstep", "is a genre of electronic dance music");


        SongComponent everySong = new SongGroup("Song List", "Every Song Available" );

        everySong.add(industrialMusic);
        industrialMusic.add(new Song ("Nutshell", "Alice in Chains", 1992));
        industrialMusic.add(new Song ("Little Wing", "Jimi Hendrix ", 1967));

        industrialMusic.add(dubstepMusic);
        dubstepMusic.add(new Song ("Bonfire", "Knife Party", 2012));
        dubstepMusic.add(new Song ("Summit", "Skrillex", 2011));

        everySong.add(heavyMetalMusic);
        dubstepMusic.add(new Song ("Ace of Spades", "Motorhead", 1970));
        dubstepMusic.add(new Song ("Run to the Hills ", "Iron Maiden", 1982));

        DiscJockey totalSongs = new DiscJockey(everySong);

        totalSongs.getSongList();

    }

}
