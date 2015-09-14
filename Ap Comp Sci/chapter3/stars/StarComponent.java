package stars;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

@SuppressWarnings("serial")
public class StarComponent extends JComponent
{
	public void paintComponent(Graphics g)
	   {  
	      Graphics2D g2 = (Graphics2D) g;
	      
	      Star star1 = new Star(0, 0);
	      Star star2 = new Star(getWidth() - 60, getHeight() - 60);
	      Star star3 = new Star(getWidth() / 2 - 30, getHeight() / 2 - 30);
	      
	      star1.draw(g2);
	      star2.draw(g2);
	      star3.draw(g2);
	   }
}
