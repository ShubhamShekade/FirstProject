package oops_practice;

public class ConstructorOverloading {
	int x=10;
	int y=10;
	ConstructorOverloading(int a,int b)
	{
		int x=a;
		int y=b;
		
	}
	ConstructorOverloading(int a,int b,String c)
	{
		int x=a;
		int y=b;	
		c="shubh";
		
	}
	void koko()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println('c');
	}
	public static void main(String[]args)
	{
		ConstructorOverloading sk=new ConstructorOverloading(100,200,"ok");
		sk.koko();
	}
}
