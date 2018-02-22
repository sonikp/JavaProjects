package Experimentation;

// this doesn't work as described in the documentation
// https://docs.oracle.com/javase/8/docs/api/javax/swing/GroupLayout.html
// this could probably be used as an experiment or deleted



import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class JavaDocs_SequentialGroup extends JFrame {
	
	public JavaDocs_SequentialGroup() {
		JPanel panel = new JPanel();
		GroupLayout layout = new GroupLayout(panel);
		panel.setLayout(layout);

		// Turn on automatically adding gaps between components
		layout.setAutoCreateGaps(true);

		// Turn on automatically creating gaps between components that touch
		// the edge of the container and the container.
		layout.setAutoCreateContainerGaps(true);

		JLabel label1 = new JLabel();
		JLabel label2 = new JLabel();
		JTextField tf1 = new JTextField();
		JTextField tf2 = new JTextField();

		// Create a sequential group for the horizontal axis.

		GroupLayout.SequentialGroup hGroup = layout.createSequentialGroup();

		// The sequential group in turn contains two parallel groups.
		// One parallel group contains the labels, the other the text fields.
		// Putting the labels in a parallel group along the horizontal axis
		// positions them at the same x location.
		//
		// Variable indentation is used to reinforce the level of grouping.
		hGroup.addGroup(layout.createParallelGroup().addComponent(label1).addComponent(label2));
		hGroup.addGroup(layout.createParallelGroup().addComponent(tf1).addComponent(tf2));
		layout.setHorizontalGroup(hGroup);

		// Create a sequential group for the vertical axis.
		GroupLayout.SequentialGroup vGroup = layout.createSequentialGroup();

		// The sequential group contains two parallel groups that align
		// the contents along the baseline. The first parallel group contains
		// the first label and text field, and the second parallel group
		// contains
		// the second label and text field. By using a sequential group
		// the labels and text fields are positioned vertically after one
		// another.
		vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(label1).addComponent(tf1));
		vGroup.addGroup(layout.createParallelGroup(Alignment.BASELINE).addComponent(label2).addComponent(tf2));
		layout.setVerticalGroup(vGroup);

		this.add(panel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		
	}
	
	
	


    public static void main(String args[]) {

        EventQueue.invokeLater(() -> new JavaDocs_SequentialGroup());
    }
}