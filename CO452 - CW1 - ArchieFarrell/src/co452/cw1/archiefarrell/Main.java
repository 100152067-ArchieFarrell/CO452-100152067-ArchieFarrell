package co452.cw1.archiefarrell;

import java.util.Scanner;

/**
 *
 * @author Archie Farrell
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Playlist album = new Playlist();
        
        //Main Method for Adding Data for Song ArrayList
        Song song1 = new Song("Royal Blood", "Out Of The Black",76);
        Song song2 = new Song("The Strokes", "Heart In A Cage",23);
        Song song3 = new Song("The Fratellis", "My Friend John",45);
        Song song4 = new Song("The White Stripes", "Blue Orchid",87);
        Song song5 = new Song("Kasabian", "Shoot The Runner",67);
        Song song6 = new Song("Nirvana", "Breed",35);
        Song song7 = new Song("Foo Fighters", "Best Of You",123);
        Song song8 = new Song("Arctic Monkeys", "Mardy Bum",59);
        Song song9 = new Song("Muse", "Psycho",18);
        Song song10 = new Song("Blur", "Song2",41);
        
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
        
        // Displays Menu for user input options.
        while (true) {
            System.out.println("Enter 1 to add a song, 2 to remove a song, 3 to print all songs, 4 to print songs over a play count, or 5 to exit:");
            int choice = input.nextInt();
            input.nextLine(); 

            switch (choice) {
                
                // Main Method for Adding a song to the existing List
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
                    
                // Main Method for removing Song from existing ArrayList    
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
                
                //Main Method for Printing songs from exsting ArrayList
                case 3:
                    System.out.println("All Songs:");
                    album.printAllSongs();
                    break;
                 
                // Main Method for Priting songs over inputted Threshold from exsting ArrayList    
                case 4:
                    System.out.println("Enter play count threshold:");
                    int playCountThreshold = input.nextInt();
                    input.nextLine(); // Consume newline character after reading integer input
                    System.out.println("Songs with more than " + playCountThreshold + " play(s):");
                    album.printSongsOverPlayCount(playCountThreshold);
                    break;    
                
                //Main Method for exiting Program
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