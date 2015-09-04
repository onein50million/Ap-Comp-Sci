
public class AlphabetDistance
{

	public static void main(String[] args)
	{
		String s = "hello world";
		int[] numbers = GetNums(s);
		int[] dist = Distances(numbers);
		for (int i = 0; i < dist.length; i++)
		{
			System.out.println(dist[i]);
		}
	}

	public static int[] GetNums(String s)
	{
		s = s.replaceAll("\\s", "");
		s = s.toLowerCase();
		int[] array = new int[s.length()];
		for (int i = 0; i < s.length(); i++)
		{
			array[i] = (int) s.charAt(i) - 96;
		}
		return array;
	}

	public static int[] Distances(int[] nums)
	{
		int add = nums.length / 2;
		int[] dist = new int[add];
		for (int i = 0; i < nums.length / 2; i++)
		{
			int a = nums[i];
			int b = nums[i + add];
			if (a < b)
			{
				dist[i] = b - a;
			}
			else if (a > b)
			{
				dist[i] = 26 - a + b;
			}
			else
			{
				dist[i] = 0;
			}
		}
		return dist;
	}

}
