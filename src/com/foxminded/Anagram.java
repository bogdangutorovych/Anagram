package com.foxminded;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("����� ������ ��� ��������������: ");
		String input_text = s.nextLine();

		//������ ������ � ������� ����� �������� ���������
		String output_text = "";

		//��������� ��������� ������ �� �����
		String[] words = input_text.split(" ");
		for (String separate_word : words) {
			String reverse_word_only_letters = "";

			//�� ������� ����� �������� �����-������ ������ � ���������� ���������
			char[] chars_of_each_word = separate_word.toCharArray();
			for (int i = chars_of_each_word.length - 1; i >= 0; --i) {
				if (Character.isAlphabetic(chars_of_each_word[i])) {
					reverse_word_only_letters += chars_of_each_word[i];
				}
			}

			//��������� ����� ��������� ����������� ��������� ����� � �����-������ � ���������� ���������
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
		System.out.println("���������:");
		System.out.println(output_text);
	}
}