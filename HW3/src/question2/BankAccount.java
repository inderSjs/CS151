package question2;

import java.util.*;

public class BankAccount implements Comparable<BankAccount> {
	
	private int acNo;
	private int balance;
	
	public BankAccount( int acNo , int balance)
	{
		this.acNo = acNo;
		this.balance = balance;
	}
	
	public int compareTo( BankAccount other)
	{
		if ( this.balance < other.balance)
			return -1;
		if ( this.balance > other.balance)
			return 1;
		else
			return 0;
		
	}
	
	public int getAccountNumber()
	{
		return this.acNo;
	}
	
	public int getBalance()
	{
		return this.balance;
	}
	
	
	
	

}
