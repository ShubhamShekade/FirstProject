package java_assignment;
import java.util.*;

public class Ebill {
	
        public static void main(String args[]) 
        {   
        	Scanner sc= new Scanner(System.in);
        	System.out.print("Enter number of units");  
        	int units= sc.nextInt();  
	
 
	double b=0;
 
        	if(units<100)
	 {
	      b=units*1.20;
	  }
	else if(units<300)
	 {
	   b=100*1.20+(units-100)*2;
	 }
	else if(units>300)
	{
	    b=100*1.20+200*2+(units-300)*3;
	}
       
	System.out.println("Bill to pay : " + b); 
      } 
}