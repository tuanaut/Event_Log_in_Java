package events;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForValidTime {

	@Test
	public void testIsValidTime() {
		//fail("Not yet implemented");
		Event tester = new Event();
		assertEquals("Hour input has to be 1-12", false, tester.isValidTime(13, 30));
	}

}
