package co452.cw1.archiefarrell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Archie Farrell
 */
public class Main {

    
    public static void main(String[] args) {
        Playlist album = new Playlist();
        
        Song song1 = new Song("Artist1", "Song1");
        Song song2 = new Song("Artist2", "Song2");
        Song song3 = new Song("Artist3", "Song3");
        Song song4 = new Song("Artist1", "Song1");
        Song song5 = new Song("Artist2", "Song2");
        Song song6 = new Song("Artist3", "Song3");
        Song song7 = new Song("Artist1", "Song1");
        Song song8 = new Song("Artist2", "Song2");
        Song song9 = new Song("Artist3", "Song3");
        Song song10 = new Song("Artist3", "Song3");
        
        album.addSong(song1);
        album.addSong(song2);
        album.addSong(song3);
        album.addSong(song4);
        album.addSong(song5);
        album.addSong(song6);
        album.addSong(song7);
        album.addSong(song8);
        album.addSong(song9);
        album.addSong(song10);
        
        // Add 
        song1.incrementPlayCount();
        song1.incrementPlayCount();
        song2.incrementPlayCount();
        
        System.out.println("Song List:");
        album.printAllSongs();
        
        int playCountThreshold = 1;
        System.out.println("\nSongs with more than " + playCountThreshold + " play(s):");
        album.printSongsOverPlayCount(playCountThreshold);
        
        album.removeSong("Artist1", "Song1");
        
        System.out.println("\nSongs after removing a song:");
        album.printAllSongs();

    }
    
}
