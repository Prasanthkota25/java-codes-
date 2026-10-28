public class arrayfunction 
{
	public static void main (String [] args ) {
		int [] arr =  {5,2,9,1,7};
		 System.out.println (temp(arr));
	}
		
	public static  int temp (int[] arr) {
		int temp  =arr[0];
		for(int i=1;i<arr.length;i++){
		      if(arr[i]>temp ){
			 temp = arr[i];
		      }
		}
		return temp ;
		    
	}
	
}
