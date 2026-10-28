public class InsertionSortsample 
{ 
    public static void main(String[] args){

	   int[] arr ={6,5,1,2,3,8,7,9,4};

	   int n=arr.length;
	   int temp=0;
	   for(int i=1;i<n;i++){
	      for(int j=i;j>0;j--){ 
		    if(arr[j] < arr[j-1] ){
				
			temp=arr[j];
			arr[j] = arr[j-1];
			arr[j-1] = temp; 
			}
			else
			break; 
		  }
	   } 
		  for(int num : arr){
		  System.out.print(num + " ");
		  }
	}
}
 