package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

//Add band Metallica with 3 songs
public class Metallica {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Metallica() {
    }
    
    public ArrayList<Song> getMetallicaSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Whereever I May Roam", "Metallica");           //Create a song
         Song track2 = new Song("Orion", "Metallica");         					//Create another song
         Song track3 = new Song("Whiskey in the Jar", "Metallica");				//Create a third song
         this.albumTracks.add(track1);                                          //Add the first song to song list for Metallica
         this.albumTracks.add(track2);                                          //Add the second song to song list for Metallica 
         this.albumTracks.add(track3);											//Add the third song to song list for Metallica
         return albumTracks;                                                    //Return the songs for Metallica in the form of an ArrayList
    }
}
