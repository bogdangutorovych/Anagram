package com.foxminded.anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {
	
	Anagram anagram = new Anagram();

	@Test
	public void shouldReturnReverseWordLetterSymbolsOnly() {
		assertEquals("Reverse word isn't correct", "", anagram.reverseWord(""));
		assertEquals("Reverse word isn't correct", "", anagram.reverseWord("        "));
		assertEquals("Reverse word isn't correct", "lkjhgfdsa", anagram.reverseWord("asdfghjkl"));
		assertEquals("Reverse word isn't correct", "", anagram.reverseWord("1234567890"));
		assertEquals("Reverse word isn't correct", "", anagram.reverseWord("!·$%&/()="));
		assertEquals("Reverse word isn't correct", "Mnbvcxz", anagram.reverseWord("z1x2c3v4b5n6M7"));
		assertEquals("Reverse word isn't correct", "afba", anagram.reverseWord("a2!b3@+f+=45a_)("));
	}

	@Test
	public void shouldReverseStringAndChangeOrderOfLetterSymbolsOnlyInEachWord(){
		assertEquals("Modified text isn't correct", "", anagram.reverseString(""));
		assertEquals("Modified text isn't correct", "", anagram.reverseString("         "));
		assertEquals("Modified text isn't correct", "rFeDwSqA tG iKuJyH", anagram.reverseString("AqSwDeFr Gt HyJuKi"));
		assertEquals("Modified text isn't correct", "1234 56789 890", anagram.reverseString("1234 56789 890"));
		assertEquals("Modified text isn't correct", "@#$ %^& *()", anagram.reverseString("@#$ %^& *()"));
		assertEquals("Modified text isn't correct", "dc3ba hgf5e", anagram.reverseString("ab3cd efg5h"));
		assertEquals("Modified text isn't correct", "d1cba hgf!e", anagram.reverseString("a1bcd efg!h"));
	}

}
