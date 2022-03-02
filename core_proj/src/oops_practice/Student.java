package oops_practice;
import java.util.Scanner; 

public class Student {
	int id;
	String name;
	
	void dope()
	{
		System.out.println("inserted values are");
	}
	
	public static void main(String[]args)
	{
		System.out.println("insert values");
		Scanner sc=new Scanner (System.in);
		Student s1=new Student();
		int id=sc.nextInt();
		String name=sc.next();
		s1.dope();
		
		System.out.println(id+" "+name);
	}

}
