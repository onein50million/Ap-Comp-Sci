
public class BankAccount
{
	//TODO Ask about what was supposed to be here in the first place
	
	double balance = 0;
	
	/**
	 * Withdraws money from this.balance
	 * @param ammount Ammount to withdraw
	 * @return ammount withdrawn
	 */
	public double Withdraw(double ammount)
	{
		balance -= ammount;
		return ammount;
	}
	
	/**
	 * Deposits money to this.balance
	 * @param ammount Ammount to deposit
	 */
	public void Deposit(double ammount)
	{
		balance += ammount;
	}
}
