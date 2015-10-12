package p4point3;

import java.util.Scanner;

public class P4point3
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		double[] lens = new double[3];
		
		System.out.println("Enter triangle points (x1, y1, x2, y2, x3, y3)");
		double x1 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double x3 = scan.nextDouble();
		double y3 = scan.nextDouble();
		Triangle t = new Triangle(x1, y1, x2, y2, x3, y3);
		System.out.printf("Perimeter: %.2f", t.getPerimeter());
		lens = t.getSideLengths();
		System.out.printf("\nSide lengths: %.2f %.2f %.2f", lens[0], lens[1], lens[2]);
		
	}
	
	public static void Automatic()
	{
		System.out.println("Triangle 1");
		Test1();
		System.out.println("\n\nTriangle 2 (Mr. N's Triangle)");
		Test2();
	}
	
	public static void Test1()
	{
		double[] lens = new double[3];
		Triangle t = new Triangle();
		t.addPoint(1, 2);
		t.addPoint(6, 3);
		t.addPoint(15, 7);
		System.out.printf("Perimeter: %.2f", t.getPerimeter());
		lens = t.getSideLengths();
		System.out.printf("\nSide lengths: %.2f %.2f %.2f", lens[0], lens[1], lens[2]);
	}
	
	public static void Test2()
	{
		double[] lens = new double[3];
		Triangle t = new Triangle(-5.5, 3, 4, 0, -7, -8.5);
		System.out.printf("Perimeter: %.2f", t.getPerimeter());
		lens = t.getSideLengths();
		System.out.printf("\nSide lengths: %.2f %.2f %.2f", lens[0], lens[1], lens[2]);
	}

}
