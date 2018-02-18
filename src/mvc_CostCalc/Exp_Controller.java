package mvc_CostCalc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc_CostCalc.Exp_Model;
import mvc_CostCalc.Exp_View;

public class Exp_Controller {
	
	private Exp_Model model;
	private Exp_View view;
	private ActionListener actionListener;
	
	// constructor
	public Exp_Controller(mvc_CostCalc.Exp_Model model, mvc_CostCalc.Exp_View view){
		
		this.model = model;
		this.view = view;	
	}
	
	public void calculateFunction() {
		actionListener = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				System.out.println("action = calculate_button");
				calculate();
			}
		};
		view.calcButton().addActionListener(actionListener);
	}

	private void calculate() {
		model.btn_Calc();
		view.setText(Integer.toString(model.getX()));
	}
	

    public void contol(){        
        actionListener = new ActionListener() {
              public void actionPerformed(ActionEvent actionEvent) { 
            	  System.out.println("action = button_pushed");
                  linkBtnAndLabel();
              }
        };                
        view.getButton().addActionListener(actionListener);   
    }
	
	private void linkBtnAndLabel(){
		model.incX();
		view.setText(Integer.toString(model.getX()));
	}
	
}
