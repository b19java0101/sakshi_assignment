package arrays;

public class JaggedArray1 
{
	public static void main(String[] args)
	{	
     int col;
	   int[][] arr=new int[4][];
	   arr[0]=new int[3];
	   arr[1]=new int[4];
	   arr[2]=new int[2];
	   arr[3]=new int[5];
	    
for(int i=0;i<arr.length;i++)
   {
	for(int j=0;j<arr[i].length;j++)
	{
		System.out.println(arr[i][j]);
	}
	}
}
}