package Inhertance;
import java.io.IOException;

class  PermanentEmp extends Employeee
{
	int paid_leave, sick_leave, casual_leave;
    double basic, hra,pfa,deduction;
  //double  hra=(50/100)*basic;
  	// double pfa=(12/100)*basic;
	
	PermanentEmp()throws IOException
	{
		total_leaves=30;
		paid_leave=10;
		sick_leave =10;
		casual_leave=10;
	}
	
	void print_leave_details() 
	{
		System.out.println("Paid_leave= "+paid_leave);
		System.out.println("Sick_leave= "+sick_leave);
		System.out.println("Casual_leave= "+casual_leave);
	}

	void calculate_balance_leaves() 
	{
		int total_leaves = paid_leave+casual_leave+sick_leave;
		System.out.println("total leaves= "+total_leaves);
	}

	boolean avail_leave(int no_of_leaves, char type_of_leave) 
	{
		
			boolean flag = false;

			//Check the type of leave and accordingly add in type of leave

			switch (type_of_leave)
			{
			case 'p':

				paid_leave = paid_leave - no_of_leaves;
				flag = true;
				System.out.println("your leave is confirm and avalible balance leave= "+paid_leave);
				break;
			case 's':
				sick_leave = sick_leave - no_of_leaves ;
				flag = true;
				System.out.println("your leave is confirm and avalible balance leave= "+sick_leave);
				break;
			case 'c':
				casual_leave = casual_leave - no_of_leaves ;
				flag = true;
				System.out.println("your leave is confirm and avalible balance leave= "+casual_leave);
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
		pfa=0.12*basic_salary;
     double total_salary = basic+hra-pfa-deduction;
		System.out.println("Net Salary="+total_salary);
	}
}