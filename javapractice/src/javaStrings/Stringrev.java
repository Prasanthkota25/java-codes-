package javaStrings;

public class Stringrev {

	public static void main(String[] args) {
//		String s = "java";
//		String rev = " ";
//
//		for (int i = s.length() - 1; i >= 0; i--) {
//			rev = rev + s.charAt(i);
//		}
//		System.out.println(rev);

//		String s = "java";
//		String reversed = new StringBuilder(s).reverse().toString();
//		System.out.println(reversed);

		String s = "java";
		char[] arr = s.toCharArray();
		int left = 0, right = arr.length - 1;
		while (left < right) {
			char temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
		System.out.println(new String(arr));
	}

}
