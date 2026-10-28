public class arraysample
{
	public static void main (String[]args){
		int [] num= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Even Numbers : ");
		for (int i =0;i<num.length;i++){
			if (num[i]%2==0){
				System.out.println(num[i]);
			}
		}
		System.out.println("Odd Numbers :");
		for (int i=0;i<num.length;i++){
			if(num[i]%2!=0){
				System.out.println(num[i]);
			}
		}
	}
}
