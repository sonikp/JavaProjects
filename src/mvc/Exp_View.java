package mvc;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Exp_View{
	
	private JFrame frame;
	private JLabel label;
	private JButton button;
	
	// constructor
	public Exp_View(String text) {
		frame = new JFrame("View");
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		label = new JLabel(text);
		frame.add(label, BorderLayout.CENTER);
//		frame.getContentPane().add(label, BorderLayout.CENTER);
		
		button = new JButton("Button");
		frame.add(button, BorderLayout.SOUTH);
//		frame.getContentPane().add(button, BorderLayout.SOUTH);
		
	}
	
	public JButton getButton(){
		return button;
	}
	
	public void setText(String text){
		label.setText(text);
	}
}