package passwords;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.Font;

public class PasswordFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static String[] letters1;
	static String[] letters2;
	static String[] letters3;
	static String[] letters4;
	static String[] letters5;
	static Password pass;
	
	static int letters1Pos;
	static int letters2Pos;
	static int letters3Pos;
	static int letters4Pos;
	static int letters5Pos;
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		pass = new Password();
		pass.newPassword();
//		System.out.println(pass.getPassword());
		letters1 = pass.line1;
		letters2 = pass.line2;
		letters3 = pass.line3;
		letters4 = pass.line4;
		letters5 = pass.line5;
		
		letters1Pos = rand.nextInt(5);
		letters2Pos = rand.nextInt(5);
		letters3Pos = rand.nextInt(5);
		letters4Pos = rand.nextInt(5);
		letters5Pos = rand.nextInt(5);

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException
				| IllegalAccessException | UnsupportedLookAndFeelException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PasswordFrame frame = new PasswordFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PasswordFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton up1 = new JButton("▲");
		up1.setBounds(10, 10, 50, 50);
		contentPane.add(up1);
		
		JButton up2 = new JButton("▲");
		up2.setBounds(70, 10, 50, 50);
		contentPane.add(up2);
		
		JButton up3 = new JButton("▲");
		up3.setBounds(130, 10, 50, 50);
		contentPane.add(up3);
		
		JButton up4 = new JButton("▲");
		up4.setBounds(190, 10, 50, 50);
		contentPane.add(up4);
		
		JButton up5 = new JButton("▲");
		up5.setBounds(250, 10, 50, 50);
		contentPane.add(up5);
		
		JButton down1 = new JButton("▼");
		down1.setBounds(10, 150, 50, 50);
		contentPane.add(down1);
		
		JButton down2 = new JButton("▼");
		down2.setBounds(70, 150, 50, 50);
		contentPane.add(down2);
		
		JButton down3 = new JButton("▼");
		down3.setBounds(130, 150, 50, 50);
		contentPane.add(down3);
		
		JButton down4 = new JButton("▼");
		down4.setBounds(190, 150, 50, 50);
		contentPane.add(down4);
		
		JButton down5 = new JButton("▼");
		down5.setBounds(250, 150, 50, 50);
		contentPane.add(down5);
		
		JLabel label1 = new JLabel(letters1[letters1Pos]);
		label1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label1.setHorizontalAlignment(SwingConstants.CENTER);
		label1.setBounds(10, 80, 50, 50);
		contentPane.add(label1);
		
		JLabel label2 = new JLabel(letters2[letters2Pos]);
		label2.setHorizontalAlignment(SwingConstants.CENTER);
		label2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label2.setBounds(70, 80, 50, 50);
		contentPane.add(label2);
		
		JLabel label3 = new JLabel(letters3[letters3Pos]);
		label3.setHorizontalAlignment(SwingConstants.CENTER);
		label3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label3.setBounds(130, 80, 50, 50);
		contentPane.add(label3);
		
		JLabel label4 = new JLabel(letters4[letters4Pos]);
		label4.setHorizontalAlignment(SwingConstants.CENTER);
		label4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label4.setBounds(190, 80, 50, 50);
		contentPane.add(label4);
		
		JLabel label5 = new JLabel(letters5[letters5Pos]);
		label5.setHorizontalAlignment(SwingConstants.CENTER);
		label5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label5.setBounds(250, 80, 50, 50);
		contentPane.add(label5);
		
		JButton submit = new JButton("SUBMIT");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if((label1.getText()+label2.getText()+label3.getText()+label4.getText()+label5.getText()).equals(pass.getPassword())){
					System.out.println("correct!");
					pass.newPassword();
					
					Random rand = new Random();
					
//					System.out.println(pass.getPassword());
					
					letters1 = pass.line1;
					letters2 = pass.line2;
					letters3 = pass.line3;
					letters4 = pass.line4;
					letters5 = pass.line5;
					
					letters1Pos = rand.nextInt(5);
					letters2Pos = rand.nextInt(5);
					letters3Pos = rand.nextInt(5);
					letters4Pos = rand.nextInt(5);
					letters5Pos = rand.nextInt(5);
					label1.setText(letters1[letters1Pos]);
					label2.setText(letters2[letters2Pos]);
					label3.setText(letters3[letters3Pos]);
					label4.setText(letters4[letters4Pos]);
					label5.setText(letters5[letters5Pos]);
				}
				else{
					System.out.println("wrong!");
				}
				
			}
		});
		submit.setBounds(310, 80, 100, 50);
		contentPane.add(submit);
	
		//first buttons
		up1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letters1Pos = Math.floorMod(letters1Pos + 1, letters1.length);
				label1.setText(letters1[letters1Pos]);
			}
		});
		down1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letters1Pos = Math.floorMod(letters1Pos - 1, letters1.length);
				label1.setText(letters1[letters1Pos]);
			}
		});
		
		//second buttons
		up2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letters2Pos = Math.floorMod(letters2Pos + 1, letters2.length);
				label2.setText(letters2[letters2Pos]);
			}
		});
		down2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letters2Pos = Math.floorMod(letters2Pos - 1, letters2.length);
				label2.setText(letters2[letters2Pos]);
			}
		});
		
		//third buttons
		up3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letters3Pos = Math.floorMod(letters3Pos + 1, letters3.length);
				label3.setText(letters3[letters3Pos]);
			}
		});
		down3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letters3Pos = Math.floorMod(letters3Pos - 1, letters3.length);
				label3.setText(letters3[letters3Pos]);
			}
		});
		
		//fourth buttons
		up4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letters4Pos = Math.floorMod(letters4Pos + 1, letters4.length);
				label4.setText(letters4[letters4Pos]);
			}
		});
		down4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letters4Pos = Math.floorMod(letters4Pos - 1, letters4.length);
				label4.setText(letters4[letters4Pos]);
			}
		});
		
		//fifth buttons
		up5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letters5Pos = Math.floorMod(letters5Pos + 1, letters5.length);
				label5.setText(letters5[letters5Pos]);
			}
		});
		down5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				letters5Pos = Math.floorMod(letters5Pos - 1, letters5.length);
				label5.setText(letters5[letters5Pos]);
			}
		});
		
		
	}
}
