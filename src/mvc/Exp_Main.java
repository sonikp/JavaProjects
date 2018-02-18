package mvc;

//http://shulgadim.blogspot.com/2012/01/model-view-controller-mvc-pattern_13.html


import mvc.Exp_Model;
import mvc.Exp_View;
import javax.swing.SwingUtilities;

public class Exp_Main {
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {                                           
                Exp_Model model = new Exp_Model(0);
                Exp_View view = new Exp_View("-"); 
                Exp_Controller controller = new Exp_Controller(model,view);
                controller.contol();
            }
        });  
	}
}