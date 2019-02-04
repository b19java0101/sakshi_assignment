package Inhertance;

import java.io.IOException;

public class TemporaryEmp extends Employeee
{
	double basic,deduction,hra,pfa;
	//double  hra=(50/100)*basic;
	// double pfa=(12/100)*basic;
	int x_leave;
	int total_leaves=15;
    int  extera_leaves=15;
	
	 TemporaryEmp() throws IOException
	 {
		}
	 
   //Methods:
	
void calculate_balance_leaves()
	{
	int total_leaves = extera_leaves;
	System.out.println("Total leave for temporary employee= "+total_leaves);
	}
	 
void print_leave_details() 
{
	System.out.println("total_leaves = 15");
	System.out.println("x_leaves= 15");
}
boolean avail_leave(int no_of_leaves, char type_of_leave)
   {boolean flag = false;

	//Check the type of leave and accordingly add in type of leave

	Object x_leave;
	switch (type_of_leave)
	{
	case 'x':

		extera_leaves = extera_leaves - no_of_leaves;
		flag = true;
		System.out.println("your leave is confirm and avalible balance leave= "+extera_leaves);
		break;
		
	default:
		System.out.println("You have not enter valid leave type :");
		flag = false;
		break;
	}
	return flag;
	}

	 void calculate_salary()
	 {
	       hra= 0.5*basic_salary;
			 pfa= .12*basic_salary;
	  double total_salary = basic+hra-pfa-deduction;
			System.out.println("Net Salary="+total_salary);
		}
}
