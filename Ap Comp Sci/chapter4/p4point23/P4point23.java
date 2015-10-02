package p4point23;

public class P4point23
{

	public static void main(String[] args)
	{
		Balloon b = new Balloon();
		b.addAir(100);
		System.out.println("The radius is: " + b.getRadius());
		System.out.println("The voulme is: " + b.getVoulme());
		System.out.println("The surface area is: " + b.getSurfaceArea());
		b.addAir(100);
		System.out.println("\nThe radius is: " + b.getRadius());
		System.out.println("The voulme is: " + b.getVoulme());
		System.out.println("The surface area is: " + b.getSurfaceArea());
	}

}
