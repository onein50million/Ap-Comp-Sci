public class P6point3
{

	public static void main(String[] args)
	{
		int n = 120;
		int i;
		while (!checkPrime(n))
		{
			i = 2;
			while (true)
			{
				if (n % i == 0)
				{
					System.out.println(i);
					n = n / i;
					break;
				}
				i++;
			}
		}
		System.out.println(n);
	}

	public static boolean checkPrime(int n)
	{
		for (int i = 2; i <= Math.round(n / 2); i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
