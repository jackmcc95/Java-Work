package monther;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSwitcher {

	//test data
	int one = 1;
	String monthOne= "Jan";
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testSwitcher() {
		fail("Not yet implemented");
	}

	@Test
	public void testMonthtoStringValid() {
		assertEquals(monthOne, switcher.monthtoString(one));
	}

	@Test (expected= NumberFormatException.class)
	public void testMonthtoStringInvalid() {
		int zero = 0;
		switcher.monthtoString(zero);
	}
}
