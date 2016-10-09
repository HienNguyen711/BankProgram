// ************************************************************************
// Account.java	15.9.2016
// - The class for Account objects
// ************************************************************************
public class Account {
	// Fields
	private String accountNumber;
	private double balance;
	// Constructor
	public Account(String accountNumber) {
		
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	public Account()
	{
		
	}
	// Methods
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean withdraw(double amount)
	{
		if(this.balance >= amount)
		{
			this.balance -= amount;
			return true;
		}
		else
		{
			return false;
		}
	}
	public void deposite(double amount)
	{
		this.balance += amount;
	}
	
	
}
// End
