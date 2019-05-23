package mp3Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import mp3P4.mp3;

public class TestMp3 {
	
	
	//test data
	int refNumberValid, refNumberInvalid, ratingValid, ratingInvalidLower, ratingInvalidUpper; 
	String songNameValid, songNameInvalid, artistValid, artistInvalid;
	
	
	
	@Before
	public void setUp() throws Exception {
		
		refNumberValid = 1;
		refNumberInvalid =-1; 
		ratingValid =2;
		ratingInvalidLower = 0;
		ratingInvalidUpper = 6;
		
		songNameValid = "ValidSongName";
		songNameInvalid = null;
		artistValid = "ValidArtist";
		artistInvalid = null;
		
	}
	/**
	 * testing default constructor
	 */
	@Test
	public void testMp3ConstructorDefault() {
		mp3 Mymp3 = new mp3();
		assertNotNull(Mymp3);
	}

	@Test
	public void testMp3NonDefaultConstructor() {
		mp3 myMp3 = new mp3(refNumberValid, artistValid,songNameValid, ratingValid);
		assertNotNull(myMp3);
		
		//testing valid
		assertEquals(refNumberValid, myMp3.getRef());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testSetGetRefInValid() {
		mp3 myMp3 = new mp3();
		myMp3.setRef(refNumberInvalid);
		assertEquals(refNumberInvalid, myMp3.getRef());
	}

	@Test
	public void testSetGetArtistValid() {
		mp3 myMp3 = new mp3();
		myMp3.setArtist(artistValid);
		assertEquals(artistValid, myMp3.getArtist());
	}

	@Test
	public void testSetGetSongNameValid() {
		mp3 myMp3 = new mp3();
		myMp3.setSongName(songNameValid);
		assertEquals(songNameValid, myMp3.getSongName());
	}
	
	@Test
	public void testSetGetSongNameInValid() {
		mp3 myMp3 = new mp3();
		myMp3.setSongName(songNameInvalid);
		assertEquals(songNameInvalid, myMp3.getSongName());
	}

	@Test
	public void testSetGetRatingValidValues() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(ratingValid);
		assertEquals(ratingValid, myMp3.getRating());
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testSetGetRatingValidValuesUpperBoundary() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(ratingInvalidUpper);
		assertEquals(ratingValid, myMp3.getRating());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testSetGetRatingInValidValuesLower() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(ratingInvalidLower);
}
	@Test(expected = IllegalArgumentException.class)
	public void testSetGetRatingInValidValuesUpper() {
		mp3 myMp3 = new mp3();
		myMp3.setRating(ratingInvalidUpper);
}
}
