package stars;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Star
{
	private int xZero;
	private int yZero;
	
	public Star(int x, int y)
	{
		xZero = x;
		yZero = y;
				
	}
	
	public void draw(Graphics2D g2)
	{
		Point2D.Double p00 = new Point2D.Double(xZero, yZero);
		Point2D.Double p01 = new Point2D.Double(xZero + 30, yZero);
		Point2D.Double p02 = new Point2D.Double(xZero + 60, yZero);
		Point2D.Double p10 = new Point2D.Double(xZero, yZero + 30);
		Point2D.Double p12 = new Point2D.Double(xZero + 60, yZero + 30);
		Point2D.Double p20 = new Point2D.Double(xZero, yZero + 60);
		Point2D.Double p21 = new Point2D.Double(xZero + 30, yZero + 60);
		Point2D.Double p22 = new Point2D.Double(xZero + 60, yZero + 60);
		
		Line2D.Double line1 = new Line2D.Double(p00, p22);
		Line2D.Double line2 = new Line2D.Double(p10, p12);
		Line2D.Double line3 = new Line2D.Double(p20, p02);
		Line2D.Double line4 = new Line2D.Double(p01, p21);
		
		g2.draw(line1);
		g2.draw(line2);
		g2.draw(line3);
		g2.draw(line4);
	}
}
