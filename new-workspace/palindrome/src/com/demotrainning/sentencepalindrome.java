package com.demotrainning;

import java.util.Scanner;

public class sentencepalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence:");

        String str = sc.nextLine();

      
        str = str.toLowerCase().replace(" ", "");

        String str1 = "";

       
        for (int i = str.length() - 1; i >= 0; i--) {
            str1 = str1 + str.charAt(i);
        }

       
        if (str.equals(str1)) {
            System.out.println("The given sentence is a palindrome.");
        } else {
            System.out.println("The given sentence is not a palindrome.");
        }

     
    }
}
