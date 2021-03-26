package JavaTrain2;

import java.util.Scanner;

public class Bank {
	Scanner s = new Scanner(System.in);
	
	protected int accNo;
	private String accOwner;
	protected double balance;
	static String bankName;
	
	public static String bName()
	{
		return bankName = "HDFC";
	}
	
	
	public void take()
	{
		System.out.print("Enter the account no - ");
		this.accNo = s.nextInt();
		
		System.out.print("Enter your name - ");
		this.accOwner = s.next();
		
		System.out.print("Enter your balance - ");
		this.balance = s.nextDouble();
	}
	
	public String show()
	{
		return bankName + " " +  this.accNo + " " + this.accOwner + " " + this.balance; 
	}
	

}
