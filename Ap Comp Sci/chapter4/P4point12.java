import java.util.Scanner;


public class P4point12
{
	static final double a = 237.7;
	static final double b = 17.27;
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the realitive humidity (0 to 1): ");
		double humid = scan.nextDouble();
		System.out.print("Enter the degrees (In C): ");
		double temp = scan.nextDouble();
		scan.close();
		double n = f(temp, humid);
		double dewPoint = (a * n) / (b - n);
		System.out.printf("The dew point temperature is: %.2f", dewPoint);
		
	}
	
	public static double f(double temp, double humid)
	{
		double n = (b * temp) / (a + temp) + Math.log(humid);
		return n;
	}

}
