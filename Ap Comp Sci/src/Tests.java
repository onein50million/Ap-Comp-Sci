public class Tests
{

	public static void main(String[] args)
	{
		//Pers
		String s = "Panthers";
		int n = s.length();
		String m = s.substring(0, 1) + s.substring(n - 3, n);
		System.out.println(m);
	}

}
