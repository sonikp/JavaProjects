package mvc_CostCalc;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

// http://shulgadim.blogspot.com/2012/01/model-view-controller-mvc-pattern_13.html

public class Exp_Model{
	
	private int x;
	
	private int a;
	private int b;
	private int c;
	
	public Exp_Model(){
		x = 0;

	}
	
	public Exp_Model(int x){
		this.x = x;
		a = 1;
		b = 2;
		c = 3;
		System.out.println("const:" + x + a + b + c);
	}
	
	public Exp_Model(int x, int a, int b, int c){
		this.x = x;
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void btn_Calc(){
		x = a + b + c;
		System.out.println("x = " + x);
	}

	
	/*
	private void btn_Calc(ActionEvent evt) {
		Double a, b, c, d, y, z = 0.0;
		String newLine = "\n";
		try {
			a = Double.parseDouble(txt_UnitCost.getText());
			b = Double.parseDouble(txt_Weight.getText());
			c = Double.parseDouble(txt_ItemCount.getText());
			d = Double.parseDouble(txt_ShippingCost.getText());

			// calculations
			y = a / (b * c); // how much is the cost for the smallest weight
								// unit
			z = (a + d) / (b * c); // same as above this time with shipping
									// included

			// formatting to 4 decimal places
			txt_ResultCostPerUnit.setText(df.format(y));
			txt_ResultCostPerUnitShipping.setText(df.format(z));
			txt_TextArea.append(df.format(y)+newLine);
			txt_TextArea.append(df.format(z)+newLine);

		} catch (Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	*/
	
	//--ORIGINAL----------------------------
	public void incX(){
		x++;
	}
	
	public int getX(){
		return x;
	}
	//--ORIGINAL----------------------------

}