package co452.cw1.archiefarrell;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Archie Farrell
 */
class Song {
    private String artist;
    private String title;
    private int playCount;
    
    public Song(String artist, String title) {
        this.artist = artist;
        this.title = title;
        this.playCount = 0;
        
    }
    
    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public int getPlayCount() {
        return playCount;
    }
    
    public void incrementPlayCount() {
        playCount++;
    }
}
