package arrays;

import java.util.Scanner;

public class JaggedArray {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    
    
    int col;
    int[][] arr=new int[3][];
    
    for(int p=0;p<arr.length;p++)
    {
    System.out.println("Enter no. of columns for"+ p+ "row");
    col=sc.nextInt();
    arr[p]=new int[col];
    }
   
    // take for array element
   for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            arr[i][j]=sc.nextInt();
        }
    }  
   
   
   
   
    //int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
   
   //print array
   
    for(int i=0;i<arr.length;i++)
    {
        for(int j=0;j<arr[i].length;j++)
        {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    

}

}
