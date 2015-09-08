import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;;

public class P2point4
{

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		Rectangle rekt = new Rectangle(150, 150, 50, 50);
		frame.setBounds(rekt);
		JOptionPane.showMessageDialog(frame, "Maybe don't not not not click");
		rekt.translate(70, 70);
		frame.setBounds(rekt);
	}

}
