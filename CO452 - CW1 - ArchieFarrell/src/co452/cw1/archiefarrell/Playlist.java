package co452.cw1.archiefarrell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Archie Farrell
 */

//Method for Creating ArrayList where the songs are stored.
public class Playlist {
    private List<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }
    
    //Method for Adding song to ArrayList
    public void addSong(Song song) {
        songs.add(song);
    }
    
    //Method for Removing Song from ArrayList
    public void removeSong(String artist, String title, int playCount) {
        Iterator<Song> iterator = songs.iterator();
        while (iterator.hasNext()) {
            Song song = iterator.next();
            if (song.getArtist().equals(artist) && song.getTitle().equals(title)) {
            
            
                iterator.remove();
            }
        }
    }
    
        
    //Methof for Printing ArrayList of Songs
    public void printAllSongs() {
        for (Song song : songs) {
        System.out.println("Artist: " + song.getArtist() + ", Title: " + song.getTitle() + ", Play Count: " + song.getPlayCount());
        }
    }
    //Method for Printing songs From ArrayList over certain number of Plays.
    public void printSongsOverPlayCount(int playCountThreshold) {
        for (Song song : songs) {
            if (song.getPlayCount() > playCountThreshold) {
                System.out.println("Artist: " + song.getArtist() + ", Title: " + song.getTitle() + ", Play Count: " + song.getPlayCount());
            }
        }
    }
}


     
            
        
    
    




        
       


  

    