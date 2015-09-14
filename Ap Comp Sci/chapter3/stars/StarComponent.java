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
	      
	      Star star1 = new Star(0, 0, false);
	      Star star2 = new Star(getWidth() - 60, getHeight() - 60, false);
	      Star star3 = new Star(0, getHeight() - 60, false);
	      Star star4 = new Star(getWidth() - 60, 0, false);
	      
	      Star star5 = new Star(getWidth() / 2 - 100, getHeight() / 2 - 30, true);
	      Star star6 = new Star(getWidth() / 2 - 30, getHeight() / 2 - 30, true);
	      Star star7 = new Star(getWidth() / 2 + 40, getHeight() / 2 - 30, true);
	      
	      star1.draw(g2);
	      star2.draw(g2);
	      star3.draw(g2);
	      star4.draw(g2);
	      star5.draw(g2);
	      star6.draw(g2);
	      star7.draw(g2);
	   }
}
