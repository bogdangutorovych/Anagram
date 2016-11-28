package com.foxminded.anagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {
	
	Anagram anagram = new Anagram();

	@Test
	public void shouldReturnOnlyReverseLetterSymbols() {
		assertEquals("Reverse word isn't correct", "Ba", anagram.reverseWord("a2!B3@"));
		assertEquals("Reverse word isn't correct", "afba", anagram.reverseWord("a2!b3@+f+=45a_)("));
	}

	@Test
	public void shouldChangeOrderOfLetterSymbolsOnlyInEachWord(){
		assertEquals("Modified text isn't correct", "dcba hgfe", anagram.reverseString("abcd efgh"));
		assertEquals("Modified text isn't correct", "d1cba hgf!e", anagram.reverseString("a1bcd efg!h"));
	}

}
