package javaStrings;

public class stringcount {

	public static void main(String[] args) {

		String s = " prasanth";

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
		System.out.println("vowels :" + vowels);
		System.out.println("consonants : " + consonants);
	}
}
