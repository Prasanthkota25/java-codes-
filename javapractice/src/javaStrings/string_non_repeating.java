package javaStrings;

public class string_non_repeating {

	public static void main(String[] args) {
		String s = "swiss";

		for (int i = 0; i < s.length(); i++) {
			boolean isuniqe = true;
			for (int j = 0; j < s.length(); j++) {
				if (i != j && s.charAt(i) == s.charAt(j)) {
					isuniqe = false;
					break;
				}
			}
			if (isuniqe) {
				System.out.println("first non reparting charachter : " + s.charAt(i));
				return;
			}
		}
		System.out.println("no non repating character");
	}
}
