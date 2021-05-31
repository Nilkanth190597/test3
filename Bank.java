package test;

class Account
{
	int acc_no;
	String name;
	float amount;
	
	void insert(int a,String nm,float am)
	{
		acc_no=a;
		name=nm;
		amount=am;
	}
	void deposit(float amt)
	{
		amount=amount+amt;
		System.out.print(amt);
	}
	void withdraw(float amt)
	{
		
		if(amount<amt)
		
			throw new IllegalArgumentException("Invalid deposit amount %s");
		
		else
		
			amount=amount-amt;  
			System.out.println(amt+" withdrawn"); 
			
	}
	
	void checkBalance()
	{
		System.out.println("Balance is: "+amount);
	}
	
	void display(){System.out.println(acc_no+" "+name+" "+amount);}  
}
public class Bank 
{
 public static void main(String args[])
 {
	 Account a1=new Account();  
	 a1.insert(832345,"Ankit",1000);  
	 a1.display();  
	 a1.checkBalance();  
	 a1.deposit(40000);  
	 a1.checkBalance();  
	 a1.withdraw(50000);  
	 a1.checkBalance();  
 }
}
