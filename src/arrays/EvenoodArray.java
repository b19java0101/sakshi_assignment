package arrays;

import java.util.Scanner;

 class EvenoodArray
{
	public static void main (String[] args)
	{
		
		 Scanner s=new Scanner(System.in);
		 int arr[] = new int[6];
	        System.out.println("Enter no. of element in array");
			for( int i=0;i<arr.length;i++)
	        	 arr[i] =s.nextInt();
	     
	
	int i ,even,odd;
	int evencount=0;
	int oddcount=0;
	even=arr[0];
	odd=arr[0];
	
	//for even
	for(i=0;i<arr.length;i++)
		if(arr[i]%2==0)
		   {
			even=arr[i]; 
			evencount++;
			System.out.println("even no in array are="+even);
			}
			else 
			{
			}
	System.out.println();
	
	//for odd
	for(i=0;i<arr.length;i++)
	  if(arr[i]%2!=0) 
		{
			odd=arr[i];
			oddcount++;
			System.out.println("odd no in array are="+odd);
		}
		else 
		{
				
		}
}
}