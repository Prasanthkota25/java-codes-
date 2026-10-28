

public class longsubString 
{
	public static void main(String[] args) {

		String str = "abcabcbb";
		String str2 = "abcbacbbebdcefghibjkklmn";
		System.out.println(lengthOfSubString(str));
		System.out.println(lengthOfSubString(str2));
	}
	public static int lengthOfSubString(String s) {
		int start = 0; int Max = 0;
		
		for (int i = 0; i <s.length(); i++) {
			
			start = Math.max(start, s.lastIndexOf(s.charAt(i),i-1) + 1);
			Max = Math.max(Max, i - start + 1);
		}

		return Max;
	}
}
