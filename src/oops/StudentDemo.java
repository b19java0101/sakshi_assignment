package oops;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentDemo
{
	static int i=1; //instatnt variable
  static int roll_no=1;
	 //int roll_no;
	String name;
	Float marks;
	static final String trainer_nm="shikhi";
	//InputStreamReader br=new InputStreamReader(System.in);
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
   StudentDemo()throws IOException
 {
 System.out.println("Enter data for Student :"+i);
 i++;
 
 System.out.println("aloted your roll_no" );
 //roll_no++;        // ( bcz static variable can not work in costractor, and  if we use then its incress contiou inclue printing)

//roll_no=Integer.parseInt(br.readLine());   //(if we do not print roll automatical and roll no does not declare static)
 
 System.out.println("Enter Student name:");
 name=(br.readLine());
 
 System.out.println("Enter Student marks:");
 marks=Float.parseFloat(br.readLine());
 }
 
void display()
{
	System.out.println(roll_no+" "+name+" "+marks+" "+trainer_nm);
	roll_no++;
	}
	
	
public static void main(String[] args)throws IOException
	{
		StudentDemo s1=new StudentDemo();
		StudentDemo s2=new StudentDemo();
		StudentDemo s3=new StudentDemo();
		s1.display();
		s2.display();
		s3.display();
		
	}

}
