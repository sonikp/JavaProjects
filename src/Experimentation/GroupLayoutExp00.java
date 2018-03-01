package Experimentation;


/*
Research:====================================
--------------------Java GroupLayout Documents:--------------------
https://docs.oracle.com/javase/8/docs/api/javax/swing/GroupLayout.html
https://docs.oracle.com/javase/tutorial/uiswing/layout/group.html
https://docs.oracle.com/javase/tutorial/uiswing/layout/groupExample.html

Other Examples:
http://zetcode.com/tutorials/javaswingtutorial/basicswingcomponents/
https://www.javatpoint.com/java-grouplayout
https://www.java-forums.org/awt-swing/8903-problem-grouplayout-please-help.html
https://stackoverflow.com/questions/16148958/building-gui-using-grouplayout-in-java
https://stackoverflow.com/questions/35252026/aligning-vertical-and-horizontal-sequentialgroup-in-swing

-----------END---------Java GroupLayout Documents:--------------------


*/

import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GroupLayoutExp00 {
	
	 public static void main(String[] args) { 
		 
	        JFrame frame = new JFrame("MyGroupLayoutExample");  
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	        frame.setSize(300,300);
	        
	        JLabel label = new JLabel("Label"); 
	        JTextField textField = new JTextField("TextField"); 
	        JLabel jl1 = new JLabel("Unit Cost:");    
	        JTextField tf1 = new JTextField("Please enter amount"); 
	        JLabel jl2 = new JLabel("Weight (grams):");    
	        JTextField tf2 = new JTextField("Please enter weight");
	        JLabel jl3 = new JLabel("No. of Items:");    
	        JTextField tf3 = new JTextField("Please enter number"); 
	        JLabel jl4 = new JLabel("Shipping Cost:");    
	        JTextField tf4 = new JTextField("Please enter shipping"); 
	        JButton findButton = new JButton("Find");
	        JButton cancelButton = new JButton("Cancel");
	        
	        Container panel = frame.getContentPane();  
	        GroupLayout layout = new GroupLayout(panel);  	  
	        panel.setLayout(layout);  
	        
	        layout.setAutoCreateContainerGaps(true);
	        layout.setAutoCreateGaps(true);
	        /**
	         * Currently attempting to get the two columns next to
	         * each other for name and text field
	         * https://docs.oracle.com/javase/8/docs/api/javax/swing/GroupLayout.html
	         * https://docs.oracle.com/javase/tutorial/uiswing/layout/group.html
	         * => https://docs.oracle.com/javase/tutorial/uiswing/layout/groupExample.html
	         * 
	         */
	      
	        
	        // ===================START: Experiment 2 =========================================================
	        layout.setHorizontalGroup(layout.createSequentialGroup()

	        		);
	        

	        
	        layout.setVerticalGroup(layout.createSequentialGroup()

	        		);
	        // ===================END: Experiment 2 =========================================================
	        
	        
	        
	        
	        
	        
	       
	        // ===================START: Experiment 1 =========================================================
	        layout.setHorizontalGroup(layout.createSequentialGroup()
    				.addComponent(label)
	        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
							.addComponent(jl1)
							.addComponent(jl2)
							.addComponent(jl3)
							.addComponent(jl4)
	        				)
	        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
							.addComponent(tf1)
							.addComponent(tf2)
							.addComponent(tf3)
							.addComponent(tf4)
							
	        				)
	        		.addComponent(findButton)
	        		);
	        

	        
	        layout.setVerticalGroup(layout.createSequentialGroup()
	        		.addComponent(label)
	        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
    						.addComponent(jl1)
    						.addComponent(tf1)
	        				)
	        	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
    						.addComponent(jl2)
    						.addComponent(tf2)
	        	    		) 
	        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
    						.addComponent(jl3)
    						.addComponent(tf3)
	        				)
	        	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
    						.addComponent(jl4)
    						.addComponent(tf4)
	        	    		)  
	        	    .addComponent(findButton)
	        		);
	        // ===================END: Experiment 1 =========================================================
	        
	        /*
	        // ===================START: this is one I made =========================================================
	        layout.setHorizontalGroup(layout.createSequentialGroup()
	        		.addComponent(label)
	        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        				.addComponent(textField)
	        				.addGroup(layout.createSequentialGroup()
	        						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        								.addComponent(jl1)
	        								.addComponent(jl2)
	        								)
	        						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        								.addComponent(tf1)
	        								.addComponent(tf2)
	        								)
	        						)
	        				)	        			
	        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING))
	        			.addComponent(findButton)
	        			.addComponent(cancelButton)
	        		);
	        
	        
	        
	        layout.setVerticalGroup(layout.createSequentialGroup()
	        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	        				.addComponent(label)
	        				.addComponent(textField)
	        				.addComponent(findButton)
	        				)
	        		.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        				.addGroup(layout.createSequentialGroup()
	    	        				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	    	        						.addComponent(jl1)
	    	        						.addComponent(tf1)
	    	        						.addComponent(cancelButton)
	    	        						)
	    	        				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	    	        						.addComponent(jl2)
	    	        						.addComponent(tf2)
	    	        						)
	    	        				)
	        						)
//	        				.addComponent(cancelButton)
	        		);
	        // ===================END: this is one I made =========================================================
	        */
	        
	        /*
	        // ===================START: this is the example code =========================================================
	        layout.setHorizontalGroup(layout.createSequentialGroup()
	        	    .addComponent(label)
	        	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)	//
	        	        .addComponent(textField)
	        	        .addGroup(layout.createSequentialGroup()
	        	            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        	                .addComponent(jl1)
	        	                .addComponent(jl2))
	        	            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        	                .addComponent(jl3)
	        	                .addComponent(jl4))))
	        	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        	        .addComponent(findButton)
	        	        .addComponent(cancelButton)
	        	));

	        	layout.setVerticalGroup(layout.createSequentialGroup()
	        	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	        	        .addComponent(label)
	        	        .addComponent(textField)
	        	        .addComponent(findButton))
	        	    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
	        	        .addGroup(layout.createSequentialGroup()
	        	            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	        	                .addComponent(jl1)
	        	                .addComponent(jl3))
	        	            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	        	                .addComponent(jl2)
	        	                .addComponent(jl4)))
	        	        .addComponent(cancelButton))
	        	);
	        	// ===================END: this is the example code =========================================================
	        	*/
	      
	  	      
	        
	        frame.pack();
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);  
	    }  
	
	
	
	
}