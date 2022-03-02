package oops_practice;

public class Animal
{
	String dogname;
	int age;
	String food;
	String breed;
	
	void pet_shop()
	{
		System.out.println("my name is"+" "+ dogname);
		System.out.println("my age is"+" "+ age);
		System.out.println("my fav food is"+" "+ food);
		System.out.println("i'm a "+" "+ breed);
		
	}
	
	public static void main(String[]args)
	{
		Animal ani1= new Animal();
		ani1.dogname="vaddo_hundya_bail";
		ani1.age=18;
		ani1.food="varan_bhat";
		ani1.breed="vanar";
		ani1.pet_shop();
		
		Animal ani2=new Animal();
		ani2.dogname="shubham shekade";
		ani2.age=23;
		ani2.food="pizza";
		ani2.breed="human";
		ani2.pet_shop();
		
		
	}

}
