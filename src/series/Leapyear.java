package series;
 import java.util.Scanner;
class Leapyear
{
public static void main(String args[])
{
System.out.println("enter the year");
Scanner s=new Scanner(System.in);
int year=s.nextInt();
int a= year;
if(a%4==0)
{
System.out.println("year is leap="+a);
}
else
{
System.out.println("year is not leap="+a);
}}}
