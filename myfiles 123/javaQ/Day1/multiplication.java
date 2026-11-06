

import java.util.Scanner;

public class multiplication{

public static void main (String [] args ){
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the number :");
	
	int num = sc.nextInt();
	for(int i=0;i<=10;i++){
		System.out.println(num+"X"+i+"="+(num*i));
	}
}
}
