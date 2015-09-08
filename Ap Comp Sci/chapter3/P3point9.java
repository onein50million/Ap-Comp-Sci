
public class P3point9
{

	public static void main(String[] args)
	{
		Test1();
		Test2();
	}
	
	public static void Test1()
	{
		// 5 transactions charge of 2 dollars
		BankAccount bank = new BankAccount(0, 1, 3);
		bank.Deposit(10);
		bank.Deposit(10);
		bank.Deposit(10);
		bank.Deposit(10);
		bank.Deposit(10);
		bank.Monthly();
		System.out.println(bank.balance);
	}
	
	public static void Test2()
	{
		// 2 transactions no fee charges
		BankAccount bank = new BankAccount(0, 1, 3);
		bank.Deposit(10);
		bank.Deposit(10);
		bank.Monthly();
		System.out.println(bank.balance);
	}

}
