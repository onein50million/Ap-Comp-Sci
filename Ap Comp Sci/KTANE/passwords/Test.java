package passwords;

public class Test
{

	public static void main(String[] args)
	{
		Password p = new Password();
		p.newPassword();
		for (int i = 0; i < 5; i++)
		{
			System.out.println(p.getLine(i));
		}
	}

}
