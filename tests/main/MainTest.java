package main;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
	
	@Test
	void testTarget() {
	Main mainobj = new Main();
	int actual = mainobj.target();
	assertEquals(1, actual);
	
	}
}
