package arrays;

import java.util.Scanner;

 class OneDarray 
{
	public static void main (String[] args)
	{
		
		 Scanner s=new Scanner(System.in);
		 int arr[] = new int[6];
	        System.out.println("Enter no. of element in array");
			for( int i=0;i<arr.length;i++)
	       
	        	 arr[i] =s.nextInt();
	     
	
	//int []arr= {2,23,4,5,87,9,7,56,42};
	int i,max,min;
	//max=arr[0];
	min=arr[0];
	for(i=1;i<arr.length;i++)
	
		/* (this condition is used for maximum value in array )
		if(arr[i]>max)
		
		{
			max=arr[i];  
		}
	System.out.println( "maximum element value in array="+max);
	*/
		
		if(arr[i]<min)      //(this condition is used for mam value in array )
		{
			min=arr[i];
		}
	System.out.println( "manimum element value in array="+min);
}
}