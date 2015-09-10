
public class P3point9
{

	public static void main(String[] args)
	{
		BankAccount bank = new BankAccount(0, 1, 3);
		Test1(bank);
		Test2(bank);
	}
	
	public static void Test1(BankAccount bank)
	{
		// 5 transactions charge of 2 dollars
		bank.Deposit(10);
		bank.Deposit(10);
		bank.Deposit(10);
		bank.Deposit(10);
		bank.Withdraw(10);
		bank.Monthly();
		System.out.println(bank.getBalance());
	}
	
	public static void Test2(BankAccount bank)
	{
		// 2 transactions no fee charges
		bank.Deposit(10);
		bank.Withdraw(10);
		bank.Monthly();
		System.out.println(bank.getBalance());
	}

}
