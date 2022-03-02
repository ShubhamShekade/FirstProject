package oops_practice;
import java.util.Scanner;
public class StaticEx {
	
	static int a;
	String name;
	
	static void m1(int b , String s)
	{
		String name=s;
		int a=b;
		
	}
	 void m2(int a, String s)
	{
		System.out.println("name and salary is"+" "+a+" "+s);
	}
	public static void main(String[]args)
	{
		System.out.println("add salary and name of the emplpoyee");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		//StaticEx e1=new StaticEx();
		//e1.name="koko";
		String name=sc.next();
		
		//a=100;
		//m1();
		StaticEx e1=new StaticEx();
		e1.m2(a,name);
		//e1.name="koko";
		//System.out.println(e1.name);
	}

}
