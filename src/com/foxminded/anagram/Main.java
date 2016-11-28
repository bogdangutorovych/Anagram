package com.foxminded.anagram;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input initial text: ");
		String inputText = s.nextLine();

		Anagram modificator = new Anagram();

		System.out.println("Converted text:");
		System.out.println(modificator.reverseString(inputText));
	}
}