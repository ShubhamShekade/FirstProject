package oops_practice;
import java.util.Scanner;
public class MethodOverloading {
	
	void sum()
	{
		int a=20;
		int b=30;
		System.out.println(a+b);
	}
	
	void sum(int a,int b)
	{
		this.a=a;
		this.b =b;
		System.out.println(a*b);
		
	}
	void sum(int x,int y,int z)
	{
		System.out.println(x+y+z);
	}
	
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		MethodOverloading ov1=new MethodOverloading();
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		ov1.sum();
		ov1.sum(200,300,400);
		ov1.sum(500,600);
	}

}
