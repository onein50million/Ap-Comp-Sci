import java.util.Scanner;


public class P4point12
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the realitive humidity (0 to 1): ");
		double humid = scan.nextDouble();
		System.out.print("Enter the degrees (In C): ");
		double temp = scan.nextDouble();
		scan.close();
		double n = f(temp, humid);
		double dewPoint = (237.7 * n) / (17.27 - n);
		System.out.printf("The dew point temperature is: %.2f", dewPoint);
		
	}
	
	public static double f(double temp, double humid)
	{
		double n = (17.27 * temp) / (237.7 + temp) + Math.log(humid);
		return n;
	}

}
