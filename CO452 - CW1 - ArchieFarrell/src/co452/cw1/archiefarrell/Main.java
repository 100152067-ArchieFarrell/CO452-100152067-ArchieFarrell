package co452.cw1.archiefarrell;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Archie Farrell
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Playlist album = new Playlist();
        
        Song song1 = new Song("Artist1", "Song1",11);
        Song song2 = new Song("Artist2", "Song2",67);
        Song song3 = new Song("Artist3", "Song3",87);
        Song song4 = new Song("Artist1", "Song1",111);
        Song song5 = new Song("Artist2", "Song2",56);
        Song song6 = new Song("Artist3", "Song3",90);
        Song song7 = new Song("Artist1", "Song1",57);
        Song song8 = new Song("Artist2", "Song2",34);
        Song song9 = new Song("Artist3", "Song3",91);
        Song song10 = new Song("Artist3", "Song3",43);
        
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
        
        while (true) {
            System.out.println("Enter 1 to add a song, 2 to remove a song, 3 to print all songs, 4 to print songs over a play count, or 5 to exit:");
            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                
                case 1:
                    System.out.println("Enter artist name:");
                    String artist = input.nextLine();
                    System.out.println("Enter song title:");
                    String title = input.nextLine();
                    System.out.println("Enter song title:");
                    int playCount = input.nextInt();
                    Song newSong = new Song(artist, title, playCount);
                    album.addSong(newSong);
                    System.out.println("Song added successfully!");
                    break;
                    
                case 2:
                    System.out.println("Enter artist name of the song to remove:");
                    String removeArtist = input.nextLine();
                    System.out.println("Enter song title of the song to remove:");
                    String removeTitle = input.nextLine();
                    System.out.println("Enter Play Count of the song to remove");
                    int removePlayCount = input.nextInt();
                    album.removeSong(removeArtist, removeTitle, removePlayCount);
                    System.out.println("Song removed successfully!");
                    break;    
                
                case 3:
                    System.out.println("All Songs:");
                    album.printAllSongs();
                    break;
                    
                case 4:
                    System.out.println("Enter play count threshold:");
                    int playCountThreshold = input.nextInt();
                    input.nextLine(); // Consume newline character after reading integer input
                    System.out.println("Songs with more than " + playCountThreshold + " play(s):");
                    album.printSongsOverPlayCount(playCountThreshold);
                    break;    
                
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    input.close();
                    System.exit(0);
                    break;
                
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
                 
            }
        
        
        
    
        }
    
    }