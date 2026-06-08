package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

//Add band Sleeptoken with 3 songs
public class Sleeptoken {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Sleeptoken() {
    }
    
    public ArrayList<Song> getSleeptokenSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Rain", "Sleeptoken");           				//Create a song
         Song track2 = new Song("Damocles", "Sleeptoken");         				//Create another song
         Song track3 = new Song("Alkaline", "Sleeptoken");						//Create a third song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Sleeptoken
         this.albumTracks.add(track2);                                          //Add the second song to song list for Sleeptoken 
         this.albumTracks.add(track3);											//Add the third song to song list for Sleeptoken
         return albumTracks;                                                    //Return the songs for Sleeptoken in the form of an ArrayList
    }
}
