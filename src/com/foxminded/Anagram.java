package com.foxminded;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Введи строку для преобразования: ");
		String input_text = s.nextLine();

		//делаем строку в которую будем выводить результат
		String output_text = "";

		//разбиваем начальную строку на слова
		String[] words = input_text.split(" ");
		for (String separate_word : words) {
			String reverse_word_only_letters = "";

			//из каждого слова получаем слово-реверс только с буквенными символами
			char[] chars_of_each_word = separate_word.toCharArray();
			for (int i = chars_of_each_word.length - 1; i >= 0; --i) {
				if (Character.isAlphabetic(chars_of_each_word[i])) {
					reverse_word_only_letters += chars_of_each_word[i];
				}
			}

			//формируем выход сравнивая посимвольно начальное слово и слово-реверс с буквенными символами
			char[] chars_of_each_word_only_letter = reverse_word_only_letters.toCharArray();
			int j = 0;
			for (int i = 0; i < chars_of_each_word.length; i++) {
				if (Character.isAlphabetic(chars_of_each_word[i])) {
					output_text += chars_of_each_word_only_letter[i-j];
				} else {
					j++; 
					output_text += chars_of_each_word[i];
				}
			}
			output_text += " ";
		}
		output_text = output_text.trim();
		System.out.println("Результат:");
		System.out.println(output_text);
	}
}