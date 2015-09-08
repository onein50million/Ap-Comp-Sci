
public class BankAccount
{
	//TODO Ask about what was supposed to be here in the first place
	
	double balance;
	double fee;
	int startingFree;
	int free;
	int charges;
	
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
		this.startingFree = free;
		this.free = this.startingFree;
	}
	
	/**
	 * Withdraws money from this.balance
	 * @param ammount Ammount to withdraw
	 * @return ammount withdrawn
	 */
	public double Withdraw(double ammount)
	{
		this.balance -= ammount;
		return ammount;
	}
	
	/**
	 * Deposits money to this.balance
	 * @param ammount Ammount to deposit
	 */
	public void Deposit(double ammount)
	{
		Deduct();
		this.balance += ammount;
	}
	
	/**
	 * Calculates number of free transactions left 
	 */
	private void Deduct()
	{
		if (this.free > 0)
		{
			this.free -= 1;
		}
		else
		{
			this.charges += 1;
		}
	}
	
	/**
	 * Deducts for number of non-free transactions and resets values
	 */
	public void Monthly()
	{
		this.balance -= this.charges * this.fee;
		this.charges = 0;
		this.free = this.startingFree;
	}
}
