public class selectionsortsample
{
public static  void main (String[]args){
	 
	 int arrays[]={9,8,7,5,4,6,3,1,2};
 
	for (int i = 0;i<arrays.length;i++){
		int min =i;
for (int j=i+1;j<arrays.length; j++){
if (arrays[j]<arrays[min]){
	min = j;
}
	}
 int temp = arrays[i];
 arrays[i]=arrays[min];
 arrays[min]=temp;
}
for (int i=0;i<arrays.length;i++){
	System.out.print(arrays[i]+" ");
}
}
}

