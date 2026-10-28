package org.training.mavenquickstart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class StringDemo {

	public Integer getLength(String name) {

		return name.length();
	}

	public char getCharAt(int n, String name) {

		return name.charAt(n);
	}

	public String toUppercase(String name) {

		return name.toUpperCase();
	}

	public String toLowercase(String name) {

		return name.toLowerCase();
	}

	public boolean getStartsWith(String name) {

		return name.startsWith("p");
	}

	public boolean getEndsWith(String name) {

		return name.endsWith("h");
	}

	public boolean isEmpty(String name) {

		return name.isEmpty();
	}

	public String replace(String name) {

		return name.replace("prasanth", "kota");
	}

	public String isreplace(String name) {

		return name.replace("p", "s");
	}

	public String getTrim(String name) {

		return name.trim();
	}

	public String toSubString(String name, int index) {

		return name.substring(index);
	}

	public String isSubString(String name, int start, int end) {

		return name.substring(start, end);
	}

	public int getIndexOf(String name) {

		return name.indexOf('p');
	}

	public int lastIndexOf(String name) {

		return name.lastIndexOf('h');
	}

	public boolean equalTo(String name, String name2) {

		return name.equals(name2);
	}

	public char[] arrayof(String str) {
		return str.toCharArray();

	}

	public String[] splitOf(String str) {
		return str.split(",");
	}

	public String reverse(String name) {
		String namereverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			namereverse += name.charAt(i);
		}
		return namereverse;
	}

	public int Count(String name) {
		int count = 0;
		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			if (ch == 'i') {
				count++;
			}
		}
		return count;
	}

	public int countof(String str) {

		int vCount = 0;

		str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {

			}
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;
			}

		}
		return vCount;
	}

	public int Valueof(String str) {

		int[] last = new int[128];
		for (int i = 0; i < 128; i++) {
			last[i] = -1;
		}

		int start = 0;
		int Max = 0;

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			start = Math.max(start, last[c] + 1);
			last[c] = i;
			Max = Math.max(Max, i - start + 1);
		}

		return Max;
	}

	public int maxNum(int[] arr) {
		int temp = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > temp) {
				temp = arr[i];
			}
		}
		return temp;
	}

	public int[] seriesOf(int[] arr) {
		int i = 0;
		int temp = arr[i];

		for (i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j])
					arr[j] = -1;

			}
		}
		
		return arr;
	}
	
	
	public int [] arraySortOf (int[]  arr ) {
		
		int i = 0;
		int n = arr.length;
		for (  i = 0 ; i<n-1;i++) {
			for (int j = 0 ; j<n-1-i ; j++) {
			if (arr[j]> arr[j+1]);
			int  temp = arr[j];
			arr[j]=arr[j+1];
			arr[j+1]=temp ;
			}
		}
		return arr ;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
