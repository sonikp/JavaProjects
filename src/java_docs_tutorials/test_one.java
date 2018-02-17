package java_docs_tutorials;

/*
I could try using the TextSamplerDemo and basing my
UI on the LH panel in the demo...

Source:
https://docs.oracle.com/javase/tutorial/uiswing/examples/components/index.html#TextSamplerDemo


 */

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

// from https://docs.oracle.com/javase/tutorial/uiswing/components/toplevel.html
// Examples :: https://docs.oracle.com/javase/tutorial/uiswing/examples/components/index.html#TextSamplerDemo

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class test_one {



	// declare variables
	private static final long serialVersionUID = 1L;

	// constructor
	public test_one() {
		
		showUI();
	}

	public void showUI() {

		// topFrame = new JFrame();
		
		//Create and set up the window.
        JFrame frame = new JFrame("TopLevelDemo");
        

        
       

        //Create the menu bar.  Make it have a green background.
        JMenuBar theMenuBar = new JMenuBar();
        theMenuBar.setOpaque(true);
        theMenuBar.setBackground(Color.BLACK);	// new Color(154, 165, 127)
        theMenuBar.setPreferredSize(new Dimension(200, 20));

        //Create a yellow label to put in the content pane.
        JLabel yellowLabel = new JLabel("YELLOW");
        yellowLabel.setOpaque(true);
        yellowLabel.setBackground(new Color(248, 213, 131));
        yellowLabel.setPreferredSize(new Dimension(200, 180));

        //Set the menu bar and add the label to the content pane.
        frame.setJMenuBar(theMenuBar);
        frame.add(yellowLabel, BorderLayout.CENTER);


		// window setup and default close operation


        frame.setSize(500, 500); // "super" JFrame sets initial size
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// pack(); // packs and automatically resizes and position components
        frame.setVisible(true); // "super" JFrame shows

	}

	public static void main(String[] args) {

		// Run the GUI codes in the Event-dispatching thread for thread-safety
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new test_one(); // Let the constructor do the job
			}
		});

	}
}