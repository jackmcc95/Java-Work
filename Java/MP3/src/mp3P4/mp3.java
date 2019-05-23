package mp3P4;

public class mp3 {

	public final static int LOWER_RATING = 1;
	
	/**
	 * 
	 */
	private int ref;
	
	/**
	 * 
	 */
	private String artist;
	
	/**
	 * 
	 */
	private String songName;
	
	/**
	 * 
	 */
	private int rating;
	
	/**
	 * default constructor
	 */
	public mp3() {
		
	}
	
	/**
	 * constructor with args
	 */
	public mp3(int ref, String artist, String songName, int rating) {
		this.ref = ref;
		this.artist = artist;
		this.songName = songName;
		this.setRating(rating);
	}
	

	public int getRef() {
		return ref;
	}

	/**
	 * If less than zero then throw exception
	 * 
	 * @param ref
	 */
	public void setRef(int ref) throws IllegalArgumentException {

		if (ref <= 0) {
			this.ref = ref;
		}
		throw new IllegalArgumentException("Ref less than 0");
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating)throws IllegalArgumentException {
		if ((rating > LOWER_RATING) && (rating < 6)) {
			this.rating = rating;
		} else {
			throw new IllegalArgumentException("Value for refoutside range");
		}

	}

	
	}