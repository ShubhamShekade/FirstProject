

class Sample
{
	public static void main(String[]args)
	{
		String str1=new String("hello");
		String str2=new String("Hello");
		
		System.out.println(str1.charAt(2));
		System.out.println(str1.concat(str2));
		System.out.println(str1);
		str1=str1+"welcome";
		System.out.println(str1);
		System.out.println(str1.indexOf(1));
		System.out.println(str1.lastIndexOf(2));
			
	}
}