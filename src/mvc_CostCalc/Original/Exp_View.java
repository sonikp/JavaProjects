package mvc_CostCalc.Original;

import java.awt.BorderLayout;
import java.awt.Point;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;



public class Exp_View{
	
	//--ORIGINAL----------------------------
	private JFrame frame;
	private JLabel label;
	private JButton button;
	//--ORIGINAL----------------------------
	
	
	
	// constructor
	public Exp_View(String text) {
		
		createAndShowGUI(text);
		
	}
	
	private void createAndShowGUI(String text) {
		frame = new JFrame("CostCalculator");
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		
		
		//--ORIGINAL----------------------------
		label = new JLabel(text);
		frame.add(label, BorderLayout.CENTER);
		button = new JButton("Button");
		frame.add(button, BorderLayout.SOUTH);
		//--ORIGINAL----------------------------
		
		// display window
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		
	}
	

	

	
	//--ORIGINAL----------------------------
	public JButton getButton(){
		return button;
	}
	
	public void setText(String text){
		label.setText(text);
	}
	//--ORIGINAL----------------------------
	
	
}