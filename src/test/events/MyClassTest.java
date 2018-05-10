package events;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyClassTest {

	@Test
	public void testIsValidDate() {
		//fail("Not yet implemented");
		Event tester = new Event();
		assertEquals("February can't have more than 28 days", false, tester.isValidDate(2, 30));
	}

}
