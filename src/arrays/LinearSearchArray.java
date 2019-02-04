package arrays;
import java.util.Scanner;

class LinearSearchArray
   {
	public static void main (String[] args)
	{
		int i,p=0;
		 boolean flag=false;
		int a[]= {5,8,4,6,78,54,42};
		for(  i=0;i<a.length;i++)
		{
			System.out.println(a[i]);		
		}
		
		
		System.out.println("Enter no. of element in array");
			 Scanner s=new Scanner(System.in);
		 int n=s.nextInt();
		 for(i=0;i<a.length;i++)
		 {
			
			if(a[i]==n)
			{
		  flag=true;
			 p=i;
		       }
		 }
			if(flag==true)
				 {
			 System.out.println("no is present position is="+p);
				 }
				 else
				 
				 System.out.println("no no found");
				 
	}}
