package com.demotrainning;

public class Lexicographicallypalindromicstring {

	public static void main(String[] args) {
		String str = "madam";
		String result = makePalindrome(str);
		System.out.println(result);
	}

	public static String makePalindrome(String str) {

		int[] freq = new int[26];
		for (char ch : str.toCharArray()) {
			freq[ch - 'a']++;
		}
		int oddCount = 0;
		String middle = "";
		String left = "";

		for (int i = 0; i < 26; i++) {
			if (freq[i] % 2 != 0) {
				oddCount++;
				middle = String.valueOf((char) (i + 'a'));
			}
			if (oddCount > 1) {
				return "no palindromic string";
			}

			for (int j = 0; j < freq[i] / 2; j++) {
				left += (char) (i + 'a');
			}
		}

		String right = "";
		for (int i = left.length() - 1; i >= 0; i--) {
			right += left.charAt(i);
		}
		return left + middle + right;
	}
}