package Experimentation;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;

/**
 * Part 1:
 * https://www.ntu.edu.sg/home/ehchua/programming/java/J4a_GUI.html
 * 
 * Part 2:
 * https://www.ntu.edu.sg/home/ehchua/programming/java/J4a_GUI_2.html
 * 
 * http://zetcode.com/tutorials/javaswingtutorial/
 * https://docs.oracle.com/javase/tutorial/uiswing/index.html
 * 
 * Tutorial Starts Here:
 * https://docs.oracle.com/javase/tutorial/uiswing/components/index.html
 *
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;




public class ProgrammingGraphUI extends JFrame  {
	
	private JTextField tfCount; 	
	private JButton btnCount; 		
	private int count = 0;



	// constructor
	public ProgrammingGraphUI() {
		
//		Container cp = getContentPane();	
//		cp.setLayout(new FlowLayout());
//		cp.add(new JLabel("Counter")); 
		
		
//		createAndShowGUI_one();		///my creation
		createAndShowGUI();

	}
	
	private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("TopLevelDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Demo Window"); // "super" JFrame sets title
        frame.setSize(500, 500); // "super" JFrame sets initial size
        frame.setLocationRelativeTo(null);

        //Create the menu bar.  Make it have a green background.
        JMenuBar greenMenuBar = new JMenuBar();
        greenMenuBar.setOpaque(true);
        greenMenuBar.setBackground(Color.CYAN);		// 154, 165, 127  && new Color(255, 255, 255)
        greenMenuBar.setPreferredSize(new Dimension(200, 20));

        //Create a yellow label to put in the content pane.
        JLabel yellowLabel = new JLabel();
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(new Color(248, 213, 131));
        yellowLabel.setPreferredSize(new Dimension(200, 180));

        //Set the menu bar and add the label to the content pane.
        frame.setJMenuBar(greenMenuBar);
        frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);
        frame.add(greenMenuBar);
        frame.add(yellowLabel, BorderLayout.CENTER);

        //Display the window.

//        frame.pack();
        frame.setVisible(true);
    }
	
	
	
	// common practice to create a dedicated method to handle all the GUI codes
	public void createAndShowGUI_one() {
		
		btnCount = new JButton("button");
		tfCount = new JTextField("textField");
		
		//Create a panel and add components to it.
		// Taken from https://docs.oracle.com/javase/tutorial/uiswing/components/toplevel.html
		JPanel panelMain = new JPanel(new BorderLayout());
//		contentPane.setBorder(BorderFactory.createLineBorder(Color.black));
		panelMain.add(btnCount, BorderLayout.CENTER);
		panelMain.add(tfCount, BorderLayout.PAGE_END);
		
		// currently testing layouts for panels
		setLayout(new FlowLayout());

		add(new JLabel("Counter"));
		add(tfCount);
		add(btnCount);
		add(panelMain);
		
		
		// window setup and default close operation
		
		setTitle("......"); // "super" JFrame sets title
		setSize(500, 500); // "super" JFrame sets initial size
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		pack();			// packs and automatically resizes and position components
		setVisible(true); // "super" JFrame shows
	}

	public static void main(String[] args) {
		
		
		// Run the GUI codes in the Event-dispatching thread for thread-safety
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ProgrammingGraphUI(); // Let the constructor do the job
			}
		});

	}
}