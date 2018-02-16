package Experimentation;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class JMenuItemsColours {

	// constructor
	public JMenuItemsColours() {

		startUI();

	}

	public void startUI() {

		JFrame newFrame = new JFrame("JMenuItems-Experimentation");
		// getContentPane().setLayout(new FlowLayout());
		newFrame.setLayout(new FlowLayout());

		// change default selection colors
		UIManager.put("Menu.selectionBackground", new javax.swing.plaf.ColorUIResource(Color.blue));
		UIManager.put("MenuItem.selectionBackground", new javax.swing.plaf.ColorUIResource(Color.green));

		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Sex");
		JMenuItem menuItem1 = new JMenuItem("male");
		JMenuItem menuItem2 = new JMenuItem("female");
		JMenuItem menuItem3 = new JMenuItem("androgyne");

		menuItem1.setBackground(Color.red);
		menuItem1.setForeground(Color.yellow);
		menuItem2.setBackground(Color.white);
		menuItem2.setForeground(Color.blue);
		menuItem3.setBackground(Color.red);
		menuItem3.setForeground(Color.yellow);

		menu.setBackground(Color.white);
		menu.setForeground(Color.blue);

		// add the MenuItems to the Menu
		menu.add(menuItem1);
		menu.add(menuItem2);
		menu.add(menuItem3);

		menuBar.add(menu);

		newFrame.setJMenuBar(menuBar);

//		addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent event) {
//				System.exit(0);
//			}
//		});

		newFrame.setSize(400, 400);
		newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		newFrame.setPreferredSize(new Dimension(400, 300));
		// newFrame.pack();
		newFrame.setLocationRelativeTo(null);
		newFrame.setVisible(true);
	}

	public static void main(String[] args) {

		// Run the GUI codes in the Event-dispatching thread for thread-safety
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new JMenuItemsColours(); // Let the constructor do the job
			}
		});

	}

}