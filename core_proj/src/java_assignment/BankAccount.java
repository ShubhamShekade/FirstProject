package java_assignment;

import java.util.*;

public class BankAccount {
	
	
	
	private int ANo,ABalance;
	private static String bankName;
	private String accountPassword;
	
	public int getAccountNo() {
		
		return ANo;
	}
	
	public void setAccountNo(int an) {
		
		ANo=an;
	}
	
public int getAccountBalance() {
		
		return ABalance;
	}

public void setAccountBalance(int bn) {
	ABalance=bn;
}

public int getbankName() {
	
	return ABalance;
}

public void setbankName(String bbn) {
bankName= bbn;
}
	
public void setAccountPassword(String accountPassword) {
	this.accountPassword = accountPassword;
}
	
	
	//constructor
	BankAccount(){
		
		Scanner sc= new Scanner(System.in); 
		System.out.print("Enter account number: ");  
		ANo= sc.nextInt();  
		
		Scanner sc1= new Scanner(System.in); 
		System.out.print("Enter account balance ");  
		ABalance= sc1.nextInt(); 
		
		Scanner sc2= new Scanner(System.in); 
		System.out.print("Enter bank name ");  
		bankName= sc2.nextLine(); 
		Scanner sc3= new Scanner(System.in);   
		System.out.println("Enter Account Password");
		String accountPassword=sc3.next();
		sc.nextLine();
	}
	
	
	
	public void display()
	  {
	   
		           
		System.out.print("\n Your account no. is : " + ANo); 
		System.out.print("\n Your account balance is: " + ABalance);
		System.out.print("\n Your Bank name is : " + bankName);
		
	  }
	      
	
	
	public static void main(String[] args) {
		
		BankAccount obj = new BankAccount();
		obj.display();
		obj.setAccountNo(obj.ANo);
		obj.getAccountNo();
		obj.setAccountBalance(obj.ABalance);
		obj.getAccountNo();

		obj.setbankName(obj.bankName);
		obj.getAccountNo();
		obj.setAccountPassword(obj.accountPassword);
		obj.getAccountNo();
		
		
		
	
	}
		
		
	}
