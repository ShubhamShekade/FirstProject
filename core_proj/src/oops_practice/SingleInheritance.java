package oops_practice;


class A
{
	int a;
	int b;
	
	public void display()
	{
		System.out.println(a+b);
		
	}
}
class B extends A
{
	int x;
	int y;
	
	public void show()
	{
		System.out.println(x+y);
	}
}

class SingleInhertance
{
	public static void main(String[]args)
	{
		B obj1=new B();
		obj1.a=20;
		obj1.b=40;
		obj1.x=30;
		obj1.y=60;
		obj1.display();
		obj1.show();
		
		
	}
		

	
	

}
