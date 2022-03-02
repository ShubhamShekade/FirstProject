package exceptex;

public class ExcepDemo {
	
	public static void main(String[]args)
	{
	System.out.println("executing the program");
	ExcepDemo ed=new ExcepDemo();
	ed. checkLogic();
	}
	
	int checkLogic()
	{
		int a=10;
		int b=2;
		int arr[]=new int[5];
		try
		{
			if((a/b)==5)
			{
				return a;	
			}
			System.out.println("nothing to print");
		}
		catch(ArithmeticException|ArrayIndexOutOffBoundException){
			System.out.println(ae);
			
		}
	
	