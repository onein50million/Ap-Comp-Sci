
public class P6point3
{

	public static void main(String[] args)
	{
		int count = 0;
		int num = 0;
		while (count <= 1000)
		{
			do
			{
				num++;
			}
			while (!checkPrime(num));
			
			System.out.println(num);
			count++;
		}
	}
	
	public static boolean checkPrime(int num)
	{
		for (int i = 2; i <= Math.round(num / 2); i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;
	}

}
