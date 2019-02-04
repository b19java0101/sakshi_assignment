package series;

import java.util.Scanner;
class evenodd
{
public static void main(String args[])
{
System.out.println("enter the number");
Scanner s=new Scanner(System.in);
int number=s.nextInt();
int i= number;
//for(i=2;i<=100;i++)
if(i%2==0)
{
System.out.println("number is even="+i);
}
else
{
System.out.println("value is odd ="+i);
}
}
}



