package com.demotrainning;

import java.util.Scanner;

public class LongestNonPalindromicSubstring {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        if (!isPalindrome(str)) {
            System.out.println(str.length());
        } else {
            boolean allSame = true;
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(0)) {
                    allSame = false;
                    break;
                }
            }

            if (allSame) {
                System.out.println(0);
            } else {
                System.out.println(str.length() - 1);
            }
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
