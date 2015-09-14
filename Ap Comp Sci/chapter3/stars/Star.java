package stars;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Star
{
	private int xZero;
	private int yZero;
	private boolean fancy;
	
	public Star(int x, int y, boolean bool)
	{
		xZero = x;
		yZero = y;
		fancy = bool;
				
	}
	
	public void draw(Graphics2D g2)
	{
		if (fancy)
		{
			Point2D.Double ptop = new Point2D.Double(xZero + 30, yZero - 24);
			Point2D.Double pleftTop = new Point2D.Double(xZero, yZero);
			Point2D.Double prightTop = new Point2D.Double(xZero + 60, yZero);
			Point2D.Double pleftBottom = new Point2D.Double(xZero + 6, yZero + 42);
			Point2D.Double prightBottom = new Point2D.Double(xZero + 60, yZero + 42);
			
			Line2D.Double line1 = new Line2D.Double(ptop, prightBottom);
			Line2D.Double line2 = new Line2D.Double(prightBottom, pleftTop);
			Line2D.Double line3 = new Line2D.Double(pleftTop, prightTop);
			Line2D.Double line4 = new Line2D.Double(prightTop, pleftBottom);
			Line2D.Double line5 = new Line2D.Double(pleftBottom, ptop);
			
			g2.draw(line1);
			g2.draw(line2);
			g2.draw(line3);
			g2.draw(line4);
			g2.draw(line5);
		}
		else
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
}
