public class mergesortsample
{
public static void main (String [] args ){

int [] arr ={8,5,3,2,9,6,7,1};
mergesort(arr);

for (int i = 0; i<arr.length; i++){
	System.out.print(arr[i]+ "  " );
}
}
public static void mergesort(int[]arr){
	int length = arr.length;
	if(length<=1)return;

int middle=length/2;
int[] leftarr = new int[middle];
int[] rightarr = new int [length - middle];

int i = 0;
int j =0;

for (; i<length;i++){
	if (i<middle){
		leftarr[i]=arr[i];
	}
	else{
		rightarr[j]=arr[i];
		j++;
	}
}
mergesort(leftarr);
mergesort(rightarr);
merge(leftarr,rightarr,arr);

}
public static void merge(int[]leftarr,int[]rightarr,int[]arr){
	int leftsize=arr.length/2;
	int rightsize= arr.length-leftsize;
	int i=0,l=0,r=0;
	
	while(l<leftsize&& r <rightsize){
		if (leftarr[l]<rightarr[r]){
			arr[i]=leftarr[l];
			i++;
			l++;
		}
		else{
			arr[i]= rightarr[r];
			i++;
			r++;
		}
	}
	while(l < leftsize){
		arr[i]=leftarr[l];
		i++;
		l++;
	}
	while(r<rightsize){
		arr[i]=rightarr[r];
		i++;
		r++;
	}
}
}