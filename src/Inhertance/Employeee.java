package Inhertance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Employeee
{   
	int empId;
	String empName;
	int total_leaves;
	double basic_salary;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Employeee() throws IOException
    { //properties:

  
        System.out.println("Enter your EmpId");
        empId=Integer.parseInt(br.readLine());
		
        System.out.println("Enter your Empname");
        empName=br.readLine();
		
        System.out.println("Enter basic Salary");
        basic_salary=Double.parseDouble(br.readLine());
        
        //System.out.println("your total Leave is="+total_leaves);
    }
	//methods 
	void calculate_balance_leaves()
	{System.out.println("your total Leave is="+total_leaves); }
	boolean avail_leave(int no_of_leaves, char type_of_leave)
	{return true;}
	void calculate_salary()  
	{ }
	
	
}

