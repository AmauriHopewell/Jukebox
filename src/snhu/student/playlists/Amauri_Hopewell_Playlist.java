	package snhu.student.playlists;

	import snhu.jukebox.playlist.PlayableSong;
	import snhu.jukebox.playlist.Song;
	import music.artist.*;
	import java.util.ArrayList;
	import java.util.LinkedList;

public class Amauri_Hopewell_Playlist {


	
		public LinkedList<PlayableSong> StudentPlaylist() {
			
			LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
			ArrayList<Song> beatlesTracks = new ArrayList<Song>();
		    TheBeatles theBeatlesBand = new TheBeatles();
			
		    beatlesTracks = theBeatlesBand.getBeatlesSongs();
			
			playlist.add(beatlesTracks.get(0));
			playlist.add(beatlesTracks.get(1));
			
			
		    Metallica metallicaBand = new Metallica();
			ArrayList<Song> metallicaTracks = new ArrayList<Song>();
		    metallicaTracks = metallicaBand.getMetallicaSongs();
			
			playlist.add(metallicaTracks.get(0));
			playlist.add(metallicaTracks.get(1));
			playlist.add(metallicaTracks.get(2));
			

		    Sleeptoken sleeptokenBand = new Sleeptoken();
			ArrayList<Song> sleeptokenTracks = new ArrayList<Song>();
		    sleeptokenTracks = sleeptokenBand.getSleeptokenSongs();
			
			playlist.add(sleeptokenTracks.get(0));
			playlist.add(sleeptokenTracks.get(1));
			
			
		    return playlist;
		}
	}

