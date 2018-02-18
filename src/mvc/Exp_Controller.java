package mvc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.Exp_Model;
import mvc.Exp_View;

public class Exp_Controller {
	
	private Exp_Model model;
	private Exp_View view;
	private ActionListener actionListener;
	
	// constructor
	public Exp_Controller(Exp_Model model, Exp_View view){
		
		this.model = model;
		this.view = view;	
	}
		
	
    public void contol(){        
        actionListener = new ActionListener() {
              public void actionPerformed(ActionEvent actionEvent) {                  
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
