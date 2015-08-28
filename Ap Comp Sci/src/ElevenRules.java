
public class ElevenRules
{

	public static void main(String[] args)
	{
		long[] nums = new long[5];
		nums[0] = 353727;
		nums[1] = 7643268910l;
		nums[2] = 6123590234l;
		nums[3] = 1358024679121l;
		nums[4] = 6380;
		for (int i = 0; i < nums.length; i++)
		{
			eleven(nums[i]);
		}
	}
	
	public static void eleven(long n)
	{
		for (int i = 0; i <= String.valueOf(n).length(); i++)
		{
			System.out.print(n + "    ");
			String str = String.valueOf(n);
			long smallN = Integer.parseInt(str.substring(0, str.length() - 1));
			long endnum = Integer.parseInt(str.substring(str.length() - 1, str.length()));
			System.out.println(smallN + " - " + endnum);
			n = smallN - endnum;
		}
		System.out.print(n + "    ");
		if(CheckEleven(n))
		{
			System.out.println("Yes");
		}
		else
		{
			System.out.println("No");
		}
	}
	public static boolean CheckEleven(long n)
	{
		String str = String.valueOf(n);
		int num1 = Integer.parseInt(str.substring(0, 1));
		int num2 = Integer.parseInt(str.substring(1, 2));
		return num1 == num2;
	}

}
