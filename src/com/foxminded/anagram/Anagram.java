package com.foxminded.anagram;
import java.util.Scanner;

public class Anagram {

	static String reverseWord(String word) {
		String reverseWordOnlyLetters = "";
		char[] wordChars = word.toCharArray();
		for (int i = wordChars.length - 1; i >= 0; --i) {
			if (Character.isAlphabetic(wordChars[i])) {
				reverseWordOnlyLetters += wordChars[i];
			}
		}
		return reverseWordOnlyLetters;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Input initial text: ");
		String inputText = s.nextLine();

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
		System.out.println("Converted text:");
		System.out.println(outputText);
	}
}