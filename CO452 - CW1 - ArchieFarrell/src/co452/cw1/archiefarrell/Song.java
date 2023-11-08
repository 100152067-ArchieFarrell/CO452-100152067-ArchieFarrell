package co452.cw1.archiefarrell;


/**
 *
 * @author Archie Farrell
 */


class Song {
    private String artist;
    private String title;
    private int playCount;
    
    //Construter for Song Method
    public Song(String artist, String title, int playCount) {
        this.artist = artist;
        this.title = title;
        this.playCount = playCount;
        
    }
    //Method to get Artist Name
    public String getArtist() {
        return artist;
    }
    //Method to get Title Name
    public String getTitle() {
        return title;
    }
    //Method to get Play Count
    public int getPlayCount() {
        return playCount;
    }
    
    
}
