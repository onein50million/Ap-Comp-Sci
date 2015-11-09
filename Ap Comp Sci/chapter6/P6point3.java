public class P6point3
{

	public static void main(String[] args)
	{
		int n = 120;
		while (true)
		{
			for (int i = 2; i <= Math.round(n / 2); i++)
			{
				if (n % i == 0)
				{
					System.out.println(i);
					n = n / i;
				}
			}
			System.out.println(n);
			break;
		}
	}

	public static int checkPrime(int n)
	{
		for (int i = 2; i <= Math.round(n / 2); i++)
		{
			if (n % i == 0)
			{
				System.out.println(i);
				return n / i;
			}
		}
		return n;
	}

}
