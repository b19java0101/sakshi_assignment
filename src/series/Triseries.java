package series;

class Triseries
{
	public static void main(String[]args)
	{
		int n1=0,n2=1,n3=2,n4,i;
		int count=10;
		
		System.out.println(" "+n1);
		System.out.println(" "+n2);
		System.out.println(" "+n3);
		for(i=2; i<count; ++i)
		{
			n4=n1+n2+n3;
			System.out.println(" "+n4);
			n1=n2;
			n2=n3;
			n3=n4;
			
			
		}
		
	}
}