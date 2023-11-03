package co452.cw1.archiefarrell;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author Archie Farrell
 */
class Song {
    private String artistName;
    private String titleName;
    private int playCount;
    
    public Song(String artist, String title) {
        this.artistName = artistName;
        this.titleName = titleName;
        this.playCount = 0;
    }
    
    public String getArtist() {
        return artistName;
    }

    public String getTitle() {
        return titleName;
    }

    public int getPlayCount() {
        return playCount;
    }
    
    public void incrementPlayCount() {
        playCount++;
    }
}
