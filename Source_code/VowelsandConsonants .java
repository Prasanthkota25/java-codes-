public class Vowels
{
public static void main (String [] args) {

String str = "Java Programming" ;
int count = 0 ; 

int vCount =0;
int cCount =0;

for (int i =0 ; i<str.length();i++);{
if (str.charAt(i)!=' ');{
	count ++;
}
if (str.charAt(i)=='a' || str.charAt (i)=='e' || str.charAt(i)== 'i' || str.charAt(i)=='o' || str.charAt(i)=='u');
     vCount++;
}
else if (str.charAt(i)>'a' && str.charAt(i)<='z'){
	cCount++;
}

}

System.out.println("Total num of Vowels: " +  vCount);
System.out.println("Total num of Consonants: " +  cCount);
}
}
}