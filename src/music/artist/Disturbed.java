package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Disturbed {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Disturbed() {
    	
    }
    
    public ArrayList<Song> getDisturbedSongs() {
    	
    	albumTracks = new ArrayList<Song>();
    	
   	 	Song track1 = new Song("Indestructible", "Disturbed"); 
        Song track2 = new Song("The Sound of Silence", "Disturbed");
        
        this.albumTracks.add(track1);                                          
        this.albumTracks.add(track2);
        
        return albumTracks;  
    }

}
