package Coding_Questions;

import java.util.Scanner;

public class vowelsconsonants {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Name : ");
		String s = sc.next();
		int vowels = 0;
		int consonants = 0;
		s = s.toLowerCase();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					vowels++;
				} else {
					consonants++;
				}
			}
		}
		System.out.println(" Vowels : " + vowels);
		System.out.println(" Consonants : " + consonants);
	}
}
