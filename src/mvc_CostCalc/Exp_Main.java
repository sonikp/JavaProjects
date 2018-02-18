package mvc_CostCalc;

import javax.swing.SwingUtilities;

import mvc_CostCalc.Exp_Model;
import mvc_CostCalc.Exp_View;

public class Exp_Main {
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {                                           
                Exp_Model model = new Exp_Model(0);
                Exp_View view = new Exp_View("-"); 
                Exp_Controller controller = new Exp_Controller(model,view);
                controller.contol();
                controller.calculateFunction();
            }
        });  
	}
}