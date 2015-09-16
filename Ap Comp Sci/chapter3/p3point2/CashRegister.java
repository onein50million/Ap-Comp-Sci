package p3point2;

public class CashRegister
{
	private int cents;
	private int payedCents;
	private int itemCount;
	private double tax;

	/**
	 * Generates a cash register with specific tax rate
	 * @param tax the tax rate in decimal
	 */
	public CashRegister(double tax)
	{
		this.tax = tax + 1;
	}
	
	private int Convert(double amount)
	{
		int tempDollars = (int) Math.floor(amount);
		int tempCents = (int) Math.round((amount - tempDollars) * 100);
		return (tempDollars * 100) + tempCents;
	}
	
	/**
	 * Resets all values for the next client
	 * @return the amount the client has payed so far
	 */
	public double Reset()
	{
		double tempCents = this.cents;
		this.payedCents = 0;
		this.cents = 0;
		this.itemCount = 0;
		return tempCents / 100;
	}
	
	/**
	 * Adds an purchase to the total of purchases
	 * @param amount amount in dollars of the purchased item
	 * @param tax whether or not to tax the item
	 */
	public void PurchaseItem(double amount, boolean tax)
	{
		int cents = Convert(amount);
		if (tax)
		{
			this.cents += (int) Math.round(cents * this.tax);
		}
		else
		{
			this.cents += cents;
		}
		this.itemCount += 1;
	}
	
	/**
	 * Pays the register with a specific amount of money
	 * @param amount amount of money being payed in dollars
	 */
	public void Pay(double amount)
	{
		this.payedCents += Convert(amount);
	}
	
	/**
	 * Calculates and returns the change for the client's purchase
	 * @return change in dollars
	 */
	public double recieveChange()
	{
		double cents = this.payedCents - this.cents;
		if (cents < 0)
		{
			System.out.println("You are short $" + (cents / 100) * -1);
			return 0;
		} else
		{
			Reset();
			return cents / 100;
		}
	}
	
	/**
	 * Returns total number of purchased items
	 * @return number of items
	 */
	public int getItemCount()
	{
		return this.itemCount;
	}

}
