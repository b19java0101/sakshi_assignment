package arrays;

import java.util.Scanner;

public class TwoD {
	 public static void main(String[] args) {
	         Scanner sc=new Scanner(System.in);
	       System.out.println("Enter no. of rows for 2D array");
	        int i=sc.nextInt();
	        System.out.println("Enter no. of columns for 2D array");
	        int j=sc.nextInt();
	        int[][] arr=new int[i][j];      //i=row,j=column
	        for( i=0;i<arr.length;i++)
	        {
	            for( j=0;j<arr[i].length;j++)
	                   {
	                arr[i][j]=sc.nextInt();
	                   }}

	        for( i=0;i<arr.length;i++)
	        {
	            for( j=0;j<arr[i].length;j++)
	            {
	                System.out.print(arr[i][j]+" ");
	            }
	            System.out.println();
	        }}
	             
		 
		 
	     /*  int[][] arr={{6,5,6},{4,8,6},{5,8,9}};
	        
	        for(int i=0;i<arr.length;i++)
	        {
	            for(int j=0;j<arr[i].length;j++)
	            {
	                System.out.print(arr[i][j]+" ");
	            }
	            System.out.println();
	        }}*/
	  
}
