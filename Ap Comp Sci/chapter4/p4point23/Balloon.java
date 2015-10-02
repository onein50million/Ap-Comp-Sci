package p4point23;

public class Balloon
{
	private double volume;
	private double sArea;
	private double radius;
	
	public Balloon(double air)
	{
		this.volume = air;
	}
	
	public Balloon()
	{
		this.volume = 0;
	}
	
	public void addAir(double amount)
	{
		this.volume += amount;
		updateRadius();
		updateSArea();
	}
	
	private void updateRadius()
	{
		this.radius = Math.cbrt((3d / 4d) / Math.PI * this.volume);
	}
	
	private void updateSArea()
	{
		this.sArea = 4 * Math.PI * Math.pow(this.radius, 2);
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public double getSurfaceArea()
	{
		return this.sArea;
	}
	
	public double getVoulme()
	{
		return this.volume;
	}
}
