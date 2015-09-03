
import java.util.Random;

public class P2point5
{

	public static void main(String[] args)
	{
		System.out.print("The winning numbers are: ");
		GetNumbers(6);
	}

	public static void GetNumbers(int n)
	{
		Random r = new Random();
		for (int i = 0; i < n; i++)
		{
			System.out.print(r.nextInt(49) + 1 + " ");
		}
	}

}
