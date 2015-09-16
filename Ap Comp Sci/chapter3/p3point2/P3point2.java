package p3point2;

public class P3point2
{

	public static void main(String[] args)
	{
		CashRegister cash = new CashRegister(.08);
		System.out.println("Test 1 (no tax): ");
		Test1(cash);
		System.out.println("\nTest 2 (with tax): ");
		Test2(cash);
		System.out.println("\nTest 3 (not enough money payed, guy gives up): ");
		Test3(cash);
		System.out.println("\nTest 4 (not enough money payed, guy pays more): ");
		Test4(cash);
	}
	
	public static void Test1(CashRegister cash)
	{
		cash.PurchaseItem(12.54, false);
		cash.PurchaseItem(13.98, false);
		cash.PurchaseItem(0.45, false);
		cash.PurchaseItem(15, false);
		cash.Pay(50);
		System.out.println("Item count: " + cash.getItemCount());
		System.out.println("Change: " + cash.recieveChange());
	}
	
	public static void Test2(CashRegister cash)
	{
		cash.PurchaseItem(10, true);
		cash.PurchaseItem(20, true);
		cash.PurchaseItem(10, true);
		cash.Pay(100);
		System.out.println("Item count: " + cash.getItemCount());
		System.out.println("Change: " + cash.recieveChange());
	}
	
	public static void Test3(CashRegister cash)
	{
		cash.PurchaseItem(87.45, false);
		cash.PurchaseItem(23.90, false);
		cash.PurchaseItem(12.45, true);
		cash.PurchaseItem(34.56, true);
		cash.Pay(50);
		System.out.println("Change: " + cash.recieveChange());
		System.out.println("Money returned: " + cash.Reset());
	}
	
	public static void Test4(CashRegister cash)
	{
		cash.PurchaseItem(37.45, true);
		cash.PurchaseItem(63.45, false);
		cash.PurchaseItem(11.35, true);
		cash.PurchaseItem(34.56, false);
		cash.Pay(50);
		System.out.println("Change: " + cash.recieveChange());
		cash.Pay(105);
		System.out.println("Change: " + cash.recieveChange());
	}

}
