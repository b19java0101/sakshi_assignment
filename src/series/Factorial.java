package series;

import java.util.Scanner;

class Factorial
{
public static void main(String args[])
{
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
long number=s.nextInt();
long n=number;
long f=1,i;	
{
for(i=1;i<=n;i++)
f=f*i;
}
System.out.println(f);
}}
