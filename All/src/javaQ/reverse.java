package javaQ;

public class reverse {
	public static void main(String[] args) {

//		String s = "prasanth";
//		String rev = " ";
//
//		for (int i = s.length() - 1; i >= 0; i--) {
//			rev = rev + s.charAt(i);
//		}
//		System.out.println(rev);

		String s = "java";
		String reveresed = new StringBuilder(s).reverse().toString();
		System.out.println(reveresed);
	}

}
