package p3point9;

public class BankAccount
{
	private double balance;
	private double fee;
	private int free;
	private int charges;
	
	/**
	 * Initializes a bank account
	 * @param balance Starting balance
	 * @param fee Fee deducted for each transaction
	 * @param free number of free transactions allowed each month
	 */
	public BankAccount(double balance, double fee, int free)
	{
		this.balance = balance;
		this.fee = fee;
		this.charges = 0;
		this.free = free;
	}
	
	/**
	 * Withdraws money from this.balance
	 * @param amount Amount to withdraw
	 * @return amount withdrawn
	 */
	public double Withdraw(double amount)
	{
		this.charges += 1;
		this.balance -= amount;
		return amount;
	}
	
	/**
	 * Deposits money to this.balance
	 * @param ammount Amount to deposit
	 */
	public void Deposit(double ammount)
	{
		this.charges += 1;
		this.balance += ammount;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	/**
	 * Deducts for number of non-free transactions and resets values
	 */
	public void Monthly()
	{
		this.balance -= Math.max(Math.max(charges, free) - free, 0) * this.fee;
		this.charges = 0;
	}
}
