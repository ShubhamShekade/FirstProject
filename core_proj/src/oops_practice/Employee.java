package oops_practice;

import java.util.Scanner;
class EmpData
{	
	int eno;
	String ename;
	float sal;
	
	void EmpDetails(int eno,String ename,float sal)
	{
		this.eno=eno;
		this.ename=ename;
		this.sal=sal;
		
	}
	
	void EmpInfo()
	{
		System.out.println("eno="+eno);
		System.out.println("ename="+ename);
		System.out.println("sal"+sal);
	}
}
	
public class Employee {
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("how many records you want");
		int nerc=sc.nextInt();
		EmpData e[]=new EmpData[nerc];
		
		for (int i=0;i<e.length;i++)
		{
			System.out.println("enter employee no name&sal");
			int no=sc.nextInt();
			String na=sc.next();
			float sa=sc.nextFloat();
			
			e[i]=new EmpData();
			e[i].EmpDetails(no,na,sa);
			e[i].EmpInfo();
		}
	}
}
