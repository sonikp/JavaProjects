package Experimentation;

import java.awt.Container;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GroupLayoutExp00 {
	
	 public static void main(String[] args) { 
		 
	        JFrame frame = new JFrame("GroupLayoutExample");  
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	        frame.setSize(300,300);
	        
	        JLabel jl1 = new JLabel("Unit Cost:");    
	        JTextField tf1 = new JTextField("Please enter amount"); 
	        JLabel jl2 = new JLabel("Weight (grams):");    
	        JTextField tf2 = new JTextField("Please enter weight");
	        JLabel jl3 = new JLabel("No. of Items:");    
	        JTextField tf3 = new JTextField("Please enter number"); 
	        JLabel jl4 = new JLabel("Shipping Cost:");    
	        JTextField tf5 = new JTextField("Please enter shipping"); 
	        
	        Container contentPanel = frame.getContentPane();  
	        GroupLayout groupLayout = new GroupLayout(contentPanel);  	  
	        contentPanel.setLayout(groupLayout);  
	        
	        groupLayout.setAutoCreateContainerGaps(true);
	        groupLayout.setAutoCreateGaps(true);
	        /**
	         * Currently attempting to get the two columns next to
	         * each other for name and text field
	         */
			groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup()
	        		.addGroup(groupLayout.createParallelGroup()
		        		.addComponent(jl1)
		        		.addComponent(jl2)
		        		.addComponent(jl3)
		        		.addComponent(jl4))
//	        		.addGroup(groupLayout.createParallelGroup()				//createParallelGroup()
//	        			.addComponent(tf1)
//	        			.addComponent(tf2))
	        		);
	        
	        groupLayout.setVerticalGroup(groupLayout.createSequentialGroup()
	        		.addGroup(groupLayout.createSequentialGroup()
			        		.addComponent(jl1)
			        		.addComponent(jl2)
			        		.addComponent(jl3)
			        		.addComponent(jl4))
//		        		.addGroup(groupLayout.createParallelGroup()
//		        			.addComponent(tf1)
//		        			.addComponent(tf2))
		        		);
		        		
	        		
	        /* works good

			groupLayout.setHorizontalGroup(groupLayout.createSequentialGroup()
	        		.addGroup(groupLayout.createParallelGroup()
		        		.addComponent(jl1)
		        		.addComponent(jl2))
	        		.addGroup(groupLayout.createParallelGroup()				//createParallelGroup()
	        			.addComponent(tf1)
	        			.addComponent(tf2))
	        		);
	        
	        groupLayout.setVerticalGroup(groupLayout.createSequentialGroup()
	        		.addGroup(groupLayout.createSequentialGroup()
			        		.addComponent(jl1)
			        		.addComponent(jl2))
		        		.addGroup(groupLayout.createParallelGroup()
		        			.addComponent(tf1)
		        			.addComponent(tf2))
		        		);
			
			
			*/
	        
	        
	        
	        /*
	        groupLayout.setHorizontalGroup(  
	                    groupLayout.createSequentialGroup()  
	                                .addComponent(jl1)  
	                                .addGap(10, 20, 100)  
	                                .addComponent(tf1));  
	        groupLayout.setVerticalGroup(  
	                     groupLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)  
	                                .addComponent(jl1)  
	                                .addComponent(tf1));  
			*/
	        
	        frame.setLocationRelativeTo(null);
	        frame.setVisible(true);  
	    }  
	
	
	
	
}