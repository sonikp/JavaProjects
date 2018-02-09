package CostCalculator;


import java.awt.BorderLayout;
import java.awt.GridLayout;

/*
Eclipse Shortcuts:
		http://crunchify.com/my-favorite-eclipse-shortcuts-for-mac-and-windows/
		<command><shift><L>



Research:
		https://beginnersbook.com/2015/07/java-swing-tutorial/
		http://www.java2s.com/Tutorial/Java/0240__Swing/Catalog0240__Swing.htm
		http://www.codejava.net/java-se/swing/jpanel-basic-tutorial-and-examples
		http://www.javaguicodexample.com/javadesktopguimysql3.html
	->	http://www.codecommit.com/blog/java/techniques-of-java-ui-development
		https://examples.javacodegeeks.com/desktop-java/ide/eclipse/eclipse-window-builder-tutorial-gui-creation/
		http://zetcode.com/tutorials/javaswingtutorial/
		
		http://metawidget.sourceforge.net/doc/reference/en/html/ch01.html
		


*/

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class zTestMain {
	
	public static void main(String[] args) {

		/**
		 * Creating JFrame
		 */
		// create JFrame
		JFrame frame = new JFrame("This is the JFrame");
		
		// setting size
		frame.setSize(350,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/**
		 * Creating JPanel
		 */
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout());
		
		JLabel userLabel = new JLabel("UserLabel");
		
		userLabel.setBounds(10, 20, 80, 25);
		panel.add(userLabel);
		
		
        JTextField userText = new JTextField(20);
        userText.setBounds(130,20,165,25);
        panel.add(userText);
        
        JLabel passwordLabel = new JLabel("PasswordLabel");
        passwordLabel.setBounds(10,50,100,25);
        panel.add(passwordLabel);
        
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(130,50,165,25);
        panel.add(passwordText);
        
        JButton loginButton = new JButton("login");
        loginButton.setBounds(10, 80, 80, 25);
        panel.add(loginButton);
		
		
		
		
		frame.add(panel);
		
		// set visibility
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		
	}


	
}