public class Vowels
{
public static void main (String [] args) {

String str = "test@gmail.com" ;
int count = 0 ; 

int vCount =0;
int cCount =0;

str.toLowerCase();
for (int i =0 ; i<str.length();i++){
	if (str.charAt(i)!=' '){
	count ++;
}
char ch = str.charAt(i);
if (ch=='a' || ch=='e' || ch== 'i' || ch=='o' || ch=='u'){
     vCount++;
	}
    else if((str.charAt(i)>'a' && str.charAt(i)<='z') ||(str.charAt(i)>'A' && str.charAt(i)<='Z')) {
	cCount++;
	}	
}

System.out.println("Total num of Vowels:"+ vCount);
System.out.println("Total num of Consonants:" + cCount);
}
}
