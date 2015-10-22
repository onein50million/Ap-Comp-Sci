import javax.swing.JOptionPane;

public class P5point8
{

	public static void main(String[] args)
	{
		String method;

		double checking = Double.parseDouble(JOptionPane.showInputDialog("Enter initial balance (checking)"));
		if (checking < 0)
		{
			System.out.println("No negative numbers");
			return;
		}

		double savings = Double.parseDouble(JOptionPane.showInputDialog("Enter initial balance (savings)"));
		if (savings < 0)
		{
			System.out.println("No negative numbers");
			return;
		}

		String bool = JOptionPane.showInputDialog("Checking or savings? ('c'/'s')");
		if (!bool.equals("c") && !bool.equals("s"))
		{
			System.out.println("Not a valid option");
			return;
		}

		String bool2 = JOptionPane.showInputDialog("Withdraw, deposit, or transfer?");
		if (!bool2.equals("w") && !bool2.equals("d") && !bool2.equals("t"))
		{
			System.out.println("Not a valid option");
			return;
		}
		method = bool2.equals("w") ? "withdraw" : bool2.equals("d") ? "deposit" : "transfer";

		double n = Double.parseDouble(JOptionPane.showInputDialog("Enter " + method + " amount"));
		if ((bool.equals("c") ? checking : savings) < n && (bool2.equals("w") || bool2.equals("t")))
		{
			System.out.println("Withdraw amount too large");
			return;
		}
		if (n < 0)
		{
			System.out.println("No negative numbers");
			return;
		}

		if (bool2.equals("w"))
		{
			if (bool.equals("c"))
			{
				checking -= n;
			} else
			{
				savings -= n;
			}
		} else if (bool2.equals("d"))
		{
			if (bool.equals("c"))
			{
				checking += n;
			} else
			{
				savings += n;
			}
		} else
		{
			if (bool.equals("s"))
			{
				checking -= n;
				savings += n;
			} else
			{
				savings -= n;
				checking += n;
			}
		}

		System.out.println("Checking: $" + checking);
		System.out.println("Savings: $" + savings);

	}
}
