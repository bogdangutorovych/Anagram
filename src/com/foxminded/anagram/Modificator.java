package com.foxminded.anagram;

public class Modificator {

	private String reverseWord(String word) {
		String reverseWordOnlyLetters = "";
		char[] wordChars = word.toCharArray();
		for (int i = wordChars.length - 1; i >= 0; --i) {
			if (Character.isAlphabetic(wordChars[i])) {
				reverseWordOnlyLetters += wordChars[i];
			}
		}
		return reverseWordOnlyLetters;
	}
	
	public String reverseString(String inputText) {
		String outputText = "";
		String[] words = inputText.split(" ");
		for (String separateWord : words) {

			char[] wordChars = separateWord.toCharArray();
			char[] wordLetterChars = reverseWord(separateWord).toCharArray();
			int j = 0;
			for (int i = 0; i < wordChars.length; i++) {
				if (Character.isAlphabetic(wordChars[i])) {
					outputText += wordLetterChars[i-j];
				} else {
					j++; 
					outputText += wordChars[i];
				}
			}
			outputText += " ";
		}
		outputText = outputText.trim();
		return outputText;
	}

}
