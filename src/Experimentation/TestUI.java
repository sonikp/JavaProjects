package Experimentation;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;

import CostCalculator.zTestJTable;

public class TestUI {
	


	
	public TestUI() {
		
        // create a jtextarea
		JButton button = new JButton("ButtonName");
		JLabel lbl_name = new JLabel("Label_Name");
		JTextField txt_name = new JTextField("Text_Name");
        JTextArea textArea = new JTextArea();
        
        // add text to it; we want to make it scroll
        textArea.setText("xx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\nxx\n");
        
        // create a scrollpane, givin it the textarea as a constructor argument
        JScrollPane scrollPane = new JScrollPane(textArea);

        // now add the scrollpane to the jframe's content pane, specifically
        // placing it in the center of the jframe's borderlayout
        JFrame frame = new JFrame("JScrollPane Test");
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        // make it easy to close the application
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // set the frame size (you'll usually want to call frame.pack())
        frame.setSize(new Dimension(240, 180));
        
        // center the frame
        frame.setLocationRelativeTo(null);
        
        // make it visible to the user
        frame.setVisible(true);
		
		
		

		


	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
            	new TestUI();
            }
        });
		
		
		
		



		
		
		
	}
}