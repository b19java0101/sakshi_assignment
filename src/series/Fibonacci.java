package series;

class Fibonacci
{
	public static void main (String[]args)
	{
		int n1,n2,n3,i,count;
		n1=0;
		n2=1;
		count=20;
		System.out.println(" "+n1);
		System.out.println(" "+n2);
		for(i=2; i<count; ++i)
		{
			n3=n1+n2;
			System.out.println(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		
	}
}