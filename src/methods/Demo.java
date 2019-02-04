package methods;

import java.util.Scanner;

public class Demo {

	 public static void main(String[] args) {
	        //Demo d=new Demo();
	        Scanner s=new Scanner(System.in);
	        System.out.println("Enter any no.");
	        int x=s.nextInt();
	        boolean res=prime(x);
	        if(res==false){
	            System.out.println("Not Prime");
	            }
	            else
	                System.out.println("Prime");

	    }
	    
	// returntype methodnm(argtype arg1,argtype arg2)
	    // method taking something,returning something
	    //method taking something, returning nothing
	    //method taking nothing, returning something
	    //method taking mothing,returning nothing
	    
	    static boolean prime(int n)
	    {
	        
	        boolean flag=true;
	    for(int i=2;i<n;i++)
	    {
	        if(n%i==0)
	        {
	            flag=false;
	            break;
	        }
	    }
	    return flag;
	    
	    }
}
