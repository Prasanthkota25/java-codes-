package javaStrings;

public class Stringpara {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		String rev = new StringBuilder(s).reverse().toString();

		if (s.equals(rev)) {
			System.out.println("Is a palindrome");
		} else {
			System.out.println("Is not a palindrome");
		}
	}

}
