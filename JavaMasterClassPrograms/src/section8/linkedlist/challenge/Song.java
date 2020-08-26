package section8.linkedlist.challenge;

public class Song {
	
	private String titleString;
	private double  duration;
	
	public Song(String titleString, double duration) {
		
		this.titleString = titleString;
		this.duration = duration;
	}

	public String getTitleString() {
		return titleString;
	}

	@Override
	public String toString() {
		return this.titleString + " : "+this.duration;
	}
	
	
	
}
