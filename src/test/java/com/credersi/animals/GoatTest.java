package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class GoatTest {
	
	@Test
	public void testInitialState() {
		Goat goat = new Goat();
		assertTrue(goat.isAlive());
		assertEquals(goat.howHungry(), 50);
	}

	@Test
	public void goatAlive() {
		Goat goat = new Goat();
		for (int i = 0; i < 2; i++) {
			goat.runs();
		}		
		assertEquals(goat.isAlive(), false);

	}
}
