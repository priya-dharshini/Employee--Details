import java.util.Scanner;

public class Employee_Details {
	public static void main(String[] args)
	{
	int[] basic={20000,30000,10000,12000,50000,23000,29000};
	int[] hra={8000,12000,8000,6000,20000,9000,12000};
	int[] it={3000,9000,1000,2000,20000,4400,10000};
	String empname[]={"Ashish","sushma","rahul","chahat","ranjan","suman","tanmay"};
	String join_date[]={"01/04/2009","23/08/2012","12/11/2008","29/01/2013","16/07/2005","1/1/2000","12/06/2006"};
	String dept[]={"R&D","PM","Acct","FrontDek","Engg","Manifacturing","PM"};
	int da[]={20000,32000,12000,15000,40000};
	String designation[]={"Engineer","Consultant","Clerk","Receptionist","Manager"};
	int salary;
	Scanner in=new Scanner(System.in);
	int empid=in.nextInt();
	System.out.println("Emp NO.      Emp Name      Department      Designation      Salary");		
	switch(empid)
	{
	case 1001:{		
					
					salary=basic[0]+hra[0]+da[0]-it[0];
					System.out.println(empid+"          "+empname[0]+"          "+dept[0]+"          "+designation[0]+"        "+salary);
					break;
			}
	
	case 1002:{
					
					salary=basic[1]+hra[1]+da[1]-it[1];
					System.out.println(empid+"          "+empname[1]+"          "+dept[1]+"          "+designation[1]+"          "+salary);
					break;
			}

	case 1003:{
					
					salary=basic[2]+hra[2]+da[2]-it[2];
					System.out.println(empid+"          "+empname[2]+"          "+dept[2]+"          "+designation[2]+"          "+salary);
					break;
			}
	
	case 1004:{
					
					salary=basic[3]+hra[3]+da[3]-it[3];
					System.out.println(empid+"          "+empname[3]+"          "+dept[3]+"          "+designation[3]+"          "+salary);
					break;
			}
	
	case 1005:{
					
					salary=basic[4]+hra[4]+da[4]-it[4];
					System.out.println(empid+"          "+empname[4]+"          "+dept[4]+"          "+designation[4]+"          "+salary);
					break;
			}
	
	case 1006:{
					
					salary=basic[5]+hra[5]+da[5]-it[5];
					System.out.println(empid+"          "+empname[5]+"          "+dept[5]+"          "+designation[5]+"          "+salary);
					break;
			}
	
	case 1007:{
					
					salary=basic[6]+hra[6]+da[6]-it[6];
					System.out.println(empid+"          "+empname[6]+"           "+dept[6]+"          "+designation[6]+"          "+salary);
					break;
			}
	
	default:{
				System.out.println("there is no employee with eid"+empid);
			}

	}
	}
}
