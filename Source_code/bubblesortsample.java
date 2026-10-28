public class bubblesortsample
{
public static  void main (String [] args ){
	
	int arrays[] = {9,8,7,3,4,6,5,2,1};
	
	bubblesort(arrays);
	
	for(int i : arrays){
		System.out.print(i+" " );
	}
}
public static void bubblesort(int arrays[]){
	for (int i =0;i<arrays.length-1;i++){
		for (int j =0;j<arrays.length-i-1;j++) {
		if(arrays[j]> arrays[j+1]){
			
			int temp = arrays[j];
			arrays[j]=arrays[j+1];
			arrays[j+1]=temp;
		}
		}
	}
}
}
