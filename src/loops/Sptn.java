package loops;

class Sptn {
public static void main(String []args) 
{ 
	int i,j,k;
	
	/*for(i=0;i<1;i++){
	      {
		for(j=0;j<=3;j++)
			System.out.print("*");
	       }
	System.out.println();
	{
		for(j=0;j<=0;j++)
			System.out.print("*");
	}
	System.out.println();
	{
		for(j=0;j<=3;j++)
			System.out.print("*");
	}
	System.out.println();
	{
		for(k=0;k<=2;k++)
			System.out.print(" ");
		for(j=3;j<=3; j++)
			System.out.print("*");
			}
	System.out.println();
	{
		for(j=0;j<=3;j++)
			System.out.print("*");
	}
	
	}*/
	
	for(i=0;i<=4;i++)
	{     if(i==1)
	  {
		  System.out.print("*");
		System.out.println( );
	  }
		if(i==0 || i==2||i==4 )
  	  {
	    	  for(j=0;j<=3;j++)
	    	  {
	        
			 System.out.print("*");
	          }
	    	  System.out.println( );
  	  }
  	if(i==3)
	   {
		   System.out.print("   *");
		 System.out.println( );
	   }
     
  	
	          
	    	  
}}}
