
public class AlphabetDistance
{

	public static void main(String[] args)
	{
		String s = "hello world";
		int[] numbers = GetNums(s);
	}
	
	public static int[] GetNums(String s)
	{
		int[] array;
		array = new int[s.length() - 1];
		for (int i = 0; i < s.length() - 1; i++)
		{
			array[i] = (int)s.charAt(i) - 96;
		}
		return array;
	}

}
