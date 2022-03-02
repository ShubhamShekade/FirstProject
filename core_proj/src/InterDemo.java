
public class InterDemo implements inter1 {
	public static void main(String[]args)
	{
		inter1 obj=new InterDemo();
		System.out.println(obj.a);
	}
	
	public void method1()
	{
		System.out.println("Defination for interface method");
	}

}
