package section8.linkedlist.challenge;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

	private String nameString;
	private String artist;
	ArrayList<Song> songs;
	
	public Album(String nameString, String artist) {
		
		this.nameString = nameString;
		this.artist = artist;
		this.songs = new ArrayList<Song>();
	}
	
	public boolean addSong(String titleString,double duration) {
		if (findSong(titleString) == null) {
			this.songs.add(new Song(titleString, duration));
			return true;
		}
		return false;
	}

	private Song findSong(String titleString) {
		for (Song checkedSong : this.songs) {
			if (checkedSong.getTitleString().equals(titleString)) {
				return checkedSong;
			}
		}
		return null;
		
	}
	
	public boolean addToPlayList(int trackNumber,LinkedList<Song> playlist) {
	
		int index = trackNumber - 1;
		if ((index >= 0) && (index <= this.songs.size())) {
			playlist.add(this.songs.get(index));
			return true;
			
		}
		System.out.println("This album does not have track "+trackNumber);
		return false;	
	}
	
	public boolean addToPlayList(String titleString,LinkedList<Song> playlist) {
		Song checkedSong = findSong(titleString);
		if (checkedSong != null) {
			
			playlist.add(checkedSong);
			return true;
			
		}
		System.out.println("The song "+titleString+" is not in this album");
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
