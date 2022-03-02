package oops_practice;

public class Employe {
	int empid;
	String empname;
	int salary;
	int deptno;
	
	/*Employe(int id,String name,int sal,int dno)//constructor
	{
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
	}*/
	/*void SetData(int id,String name,int sal,int dno)
	{
		empid=id;
		empname=name;
		salary=sal;
		deptno=dno;
		
	}*/
	void display()//display method for printing values
	{
		System.out.println(empid);
		System.out.println(empname);
		System.out.println(salary);
		System.out.println(deptno);
		
	}
	public static void main(String[]args)//main method for object creation and execution
	{
		/*Employe emp1=new Employe(20,"koooo",60000,143);
		emp1.display();
		Employe emp2=new Employe(30,"shubh",25000,1432);
		emp2.display();
		*/
		
	/*Employe emp1=new Employe();
	emp1.SetData(10,"koko", 60000,143);
	emp1.display();
	*/
		Employe emp1=new Employe();
		emp1.empid =10;
		emp1.empname="koko";
		emp1.salary=60000;
		emp1.deptno=143;
		emp1.display();
	}

}
