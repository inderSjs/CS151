
public class BankAccount {
	
	private int balance;
	
	public BankAccount( int balance)
	{
		this.balance = balance;
	}
	
	public void withdraw( int amount)
	{
		
		
			System.out.println("withdrawing: " + amount);
			int newBalance = this.balance - amount;
			amount = newBalance;
			System.out.println("new balance is: "+ newBalance);
		
	
		
	}
	
	public void deposit( int amount)
	{
		System.out.println("Depositing: " + amount);
		int newBalance = this.balance + amount;
		amount = newBalance;
		System.out.println("new balance: "+ newBalance);
	}
	
	public void getBalance()
	{
		System.out.println("Balance is: " + this.balance);
	}

}
