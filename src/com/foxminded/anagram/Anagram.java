package com.foxminded.anagram;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input initial text: ");
		String inputText = s.nextLine();

		Modificator modificator = new Modificator();

		System.out.println("Converted text:");
		System.out.println(modificator.reverseString(inputText));
	}
}