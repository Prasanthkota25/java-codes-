package com.demotrainning;

public class palindromecharremove {

	public static String makePalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				if (isPal(s, i + 1, j))
					return s.substring(0, i) + s.substring(i + 1);
				if (isPal(s, i, j - 1))
					return s.substring(0, j) + s.substring(j + 1);
				return "Not possible";
			}
			i++;
			j--;
		}
		return s;
	}

	public static boolean isPal(String s, int left, int right) {
		while (left < right)
			if (s.charAt(left++) != s.charAt(right--))
				return false;
		return true;
	}

	public static void main(String[] args) {
		System.out.println(makePalindrome("madamm")); 
	
	}
}