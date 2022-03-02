package oops_practice;

public class Calculation {
	int a;
	int b;
	
	int sum()
	{
		return a+b;
	}
	
	public static void main(String[]args)
	{
		Calculation cal=new Calculation();
		cal.a=50;
		cal.b=100;
		int r=cal.sum();
		System.out.println(r);
	}

}
