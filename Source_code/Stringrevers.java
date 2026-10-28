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
