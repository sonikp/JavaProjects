package Experimentation;

// broken: started adding extra labels and fields. now broken

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GroupLayoutExample {
	
	public static void main(String[] args) {
		
		JFrame.setDefaultLookAndFeelDecorated(true);
		JFrame frame = new JFrame("GroupLayout");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		// define labels
		JLabel jl1 = new JLabel("Label1:");
		JLabel jl2 = new JLabel("Label2:");
		JLabel jl3 = new JLabel("Label3:");
		JLabel jl4 = new JLabel("Label4:");
		
		// define textFields
		JTextField jt1 = new JTextField(10);
		JTextField jt2 = new JTextField(10);
		JTextField jt3 = new JTextField(10);
		JTextField jt4 = new JTextField(10);
		*/
		
		/*
		// define buttons
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		*/
		
		// Define the panel to hold the buttons
		JPanel panel = new JPanel();
		panel.setSize(300,300);
		GroupLayout layout = new GroupLayout(panel);
		panel.setLayout(layout);
		layout.setAutoCreateGaps(true);
		layout.setAutoCreateContainerGaps(true);
		
		JLabel lbl_UnitCost = new JLabel("Unit Cost:");  
		JTextField txt_UnitCost = new JTextField(10);
		JLabel lbl_Weight = new JLabel("Weight (grams):");  
		JTextField txt_Weight = new JTextField(10);
		JLabel lbl_NoItems = new JLabel("No. of Items:");  
		JTextField txt_NoItems = new JTextField(10);
		JLabel lbl_ShipCost = new JLabel("Shipping Cost:");  
		JTextField txt_ShipCost = new JTextField(10);
		
		
		// https://www.javatpoint.com/java-grouplayout
		// https://www.java-forums.org/awt-swing/8903-problem-grouplayout-please-help.html
		
		GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();
		
		hGroup.addGroup(  				// layout.setHorizontalGroup
        		layout.createParallelGroup()
        			.addComponent(lbl_UnitCost)
        			.addGap(10, 20, 100) 
        			.addComponent(lbl_Weight)
        			.addGap(10, 20, 100) 
        			.addComponent(lbl_NoItems)
        			.addGap(10, 20, 100) 
        			.addComponent(lbl_ShipCost));
		hGroup.addGroup(  					// layout.setVerticalGroup
	        	layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	    			.addComponent(txt_UnitCost)
	    			.addComponent(txt_Weight)
	    			.addComponent(txt_NoItems)
	    			.addComponent(txt_ShipCost));
		layout.setHorizontalGroup(hGroup);
		
GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();
		
		vGroup.addGroup(  				// layout.setHorizontalGroup
        		layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
        			.addComponent(lbl_UnitCost)
        			.addGap(10, 20, 100) 
        			.addComponent(lbl_Weight)
        			.addGap(10, 20, 100) 
        			.addComponent(lbl_NoItems)
        			.addGap(10, 20, 100) 
        			.addComponent(lbl_ShipCost));
		vGroup.addGroup(  					// layout.setVerticalGroup
	        	layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
	    			.addComponent(txt_UnitCost)
	    			.addComponent(txt_Weight)
	    			.addComponent(txt_NoItems)
	    			.addComponent(txt_ShipCost));
		layout.setVerticalGroup(vGroup);
		
		
		/*
        layout.setHorizontalGroup(  
        		layout.createParallelGroup()		// createSequentialGroup  createParallelGroup
        				.addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_UnitCost)  
                                .addGap(10, 20, 100)  
                                .addComponent(txt_UnitCost))
                    .addGroup(layout.createSequentialGroup()
                                .addComponent(lbl_Weight)  
                                .addGap(10, 20, 100)  
                                .addComponent(txt_Weight)));  
                           
        layout.setVerticalGroup(  
        		layout.createParallelGroup(GroupLayout.Alignment.BASELINE)  
                                .addComponent(lbl_UnitCost)  
                                .addComponent(txt_UnitCost)    
                                .addComponent(lbl_Weight)  
                                .addComponent(txt_Weight));
        					
        */						
		
		/*
		// Set for Horizontal and vertical group
		// labels
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jl1).addComponent(jt1).addComponent(jl2).addComponent(jl3).addComponent(jl4));
		
		layout.setVerticalGroup(layout.createSequentialGroup().addComponent(jl1).addComponent(jt1).addComponent(jl2).addComponent(jl3).addComponent(jl4));
		
		
		// buttons
//		layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(jb1).addComponent(jb2).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jb3).addComponent(jb4))));
//		layout.setHorizontalGroup(layout.createSequentialGroup().addComponent(jb1).addComponent(jb2).addComponent(jb3).addComponent(jb4));	
//		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jb1).addComponent(jb2).addComponent(jb3).addComponent(jb4));
//		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER).addComponent(jb1).addComponent(jb2).addComponent(jb3).addComponent(jb4)); //addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jb3).addComponent(jb4))));
		
//		layout.setVerticalGroup(layout.createSequentialGroup().addComponent(jb1).addComponent(jb2).addComponent(jb3).addComponent(jb4));
		*/
		
		frame.add(panel);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
	
}