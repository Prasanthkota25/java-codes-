public class splitString

{
	public static void main (String []args){

	String [] array = {"jan","mar","jun","aug","sep","dec","nov","may","feb","apr","jul"};
	for(String month:array ){
	System.out.println(month);
}
	}
}




                   junit 
			

public class StringDemo {			
				 
	public String[] splitOf(String str) {
		return str.split(",");
	}
	
	
	
 public class StringDemoTest {
		@Test 
	public void splitof() {
		String[] array = {"jan","mar","jun","aug","sep","dec","nov","may","feb","apr","jul"};
		assertArrayEquals( array, new StringDemo().splitOf("jan,mar,jun,aug,sep,dec,nov,may,feb,apr,jul")); 
	}
	
	
	
	
	
	
	
	
	public class Stringrevers
{
public static void main (String [] args){

String str = "Infinite" ;
String strreversed = "";
int count = 0;

for (int i = str.length() -1;i>=0;i--) {
 strreversed += str.charAt(i);   
 char ch = str.charAt(i);
 if (ch=='i'){
	 count++;
 }

}
System.out.println(strreversed);
System.out.println(count);
}
}





           junit
		   
		   
		   
public class StringDemo {

public String reverse(String name) {
		String namereverse = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			namereverse += name.charAt(i);
		}
		return namereverse;
	}
public int  Count(String name) {
		int count = 0;
		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			if (ch == 'i') {
				count++;
			}
		}
		return count;
	}

		   
public class StringDemoTest  {
	@Test 
	public void reverse() {
	
		assertEquals("etinifnI", new StringDemo().reverse("Infinite"));
	
	}
	
	
	@Test 
	public void count() {
		assertEquals(2,new StringDemo().Count("Infinite"));
	}
	
	
	}




	
	
	
	
	
	
	
	
	
	
