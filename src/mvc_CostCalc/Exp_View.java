package mvc_CostCalc;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;



public class Exp_View{
	
	//--ORIGINAL----------------------------
	private JButton button;
	private JLabel label;	
	//--ORIGINAL----------------------------
	
	private JFrame frame;
	private JPanel textPane;
	private JPanel buttonPane;
	private JButton btnCalc;
	private JLabel lbl_field1;
	private JLabel lbl_field2;
	private JLabel lbl_field3;
	private JLabel lbl_result1;
	private JTextField txt_field1;
	private JTextField txt_field2;
	private JTextField txt_field3;
	private JTextField txt_result1;
	protected static final String lbl_field1_String = "Num1";
	protected static final String lbl_field2_String = "Num2";
	protected static final String lbl_field3_String = "Num3";


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
		
		frame.setLayout(new BorderLayout());
		
		btnCalc = new JButton("Calc");
		
		txt_field1 = new JTextField(10);
		txt_field2 = new JTextField(10);
		txt_field3 = new JTextField(10);
		txt_result1 = new JTextField(10);
		
		lbl_field1 = new JLabel(lbl_field1_String);
		lbl_field2 = new JLabel(lbl_field2_String);
		lbl_field3 = new JLabel(lbl_field3_String);
		lbl_result1 = new JLabel("Results:");
		
		JLabel[] labelFields = {lbl_field1, lbl_field2, lbl_field3};
		JTextField[] textFields = {txt_field1, txt_field2, txt_field3};


		
		//Lay out the text controls and the labels.
        textPane = new JPanel();
        buttonPane = new JPanel();
        
        textPane.add(lbl_field1);
        textPane.add(txt_field1);
        textPane.add(lbl_field2);
        textPane.add(txt_field2);
        textPane.add(lbl_field3);
        textPane.add(txt_field3);
        
        buttonPane.add(btnCalc);
        buttonPane.add(lbl_result1);
        buttonPane.add(txt_result1);


        frame.add(textPane, BorderLayout.NORTH);
        frame.add(buttonPane, BorderLayout.WEST);


		
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
	
	public JButton calcButton(){
		return btnCalc;
	}
	
	public void setResult(String text){
		System.out.println(text);
		txt_result1.setText(text);
		
	}
	

	

	
	//--ORIGINAL----------------------------
	public JButton getButton(){
		return button;
	}
	
	public void setText(String text){
		System.out.println(text);
		label.setText(text);
	}
	//--ORIGINAL----------------------------
	
	
}