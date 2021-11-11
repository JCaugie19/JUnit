package edu.augustana.csc305.labs;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HannaldousTest {

	@Test
	public void testHowBad() {
		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		assertEquals(4, Hannaldous.numLettersCase(5, passwords));
	}
	@Test
	public void testHowBadNCase() {
		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		assertEquals(2, Hannaldous.numLettersCase(0, passwords));
	}
	@Test
	public void testHowBadOneCase() {
		String[] passwords = new String[] { "cat" };
		assertEquals(1, Hannaldous.numLettersCase(2, passwords));
	}
	@Test
	public void testHowBadNCase2() {
		String[] passwords = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		assertEquals(6, Hannaldous.numLettersCase(15, passwords));
	}

}
