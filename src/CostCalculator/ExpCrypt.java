package CostCalculator;

import java.awt.*;
import javax.swing.*;



public class ExpCrypt {
	
	  private static final Dimension SCROLL_SIZE = new Dimension(400, 300);
	  private JPanel mainPanel = new JPanel();
	  private JTextArea area1 = new JTextArea();
	  private JTextArea area2 = new JTextArea();
	  private JButton encryptBtn = new JButton("Encrypt >>");
	  private JButton decipherBtn = new JButton("<< Decipher");
	   
	  public ExpCrypt() {
	    JScrollPane scrollPane1 = new JScrollPane(area1);
	    JScrollPane scrollPane2 = new JScrollPane(area2);
	    scrollPane1.setPreferredSize(SCROLL_SIZE);
	    scrollPane2.setPreferredSize(SCROLL_SIZE);
	    scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);	//HORIZONTAL_SCROLLBAR_ALWAYS
	    scrollPane2.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	     
	    JPanel leftPanel = new JPanel(new BorderLayout(5, 5));
	    JPanel rightPanel = new JPanel(new BorderLayout(5, 5));
	     
	    leftPanel.add(scrollPane1, BorderLayout.CENTER);
	    leftPanel.add(encryptBtn, BorderLayout.SOUTH);
	    rightPanel.add(scrollPane2, BorderLayout.CENTER);
	    rightPanel.add(decipherBtn, BorderLayout.SOUTH);
	     
	    JPanel centerPanel = new JPanel(new GridLayout(1, 0, 10, 10));
	    centerPanel.add(leftPanel);
	    centerPanel.add(rightPanel);
	     
	    int eb = 7;
	    mainPanel.setBorder(BorderFactory.createEmptyBorder(eb, eb, eb, eb));
	    mainPanel.setLayout(new BorderLayout(6, 6));
	    mainPanel.add(centerPanel, BorderLayout.CENTER);
	    mainPanel.add(new JLabel("Crypt v0.1", SwingConstants.LEFT), BorderLayout.NORTH);
	  }
	 
	  public JComponent getComponent() {
	    return mainPanel;
	  }
	 
	  private static void createAndShowUI() {
	    JFrame frame = new JFrame("Crypt");
	    frame.getContentPane().add(new ExpCrypt().getComponent());
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.pack();
	    frame.setLocationRelativeTo(null);
	    frame.setVisible(true);
	  }
	
	
	
	
	public static void main(String[] args) {
		
		java.awt.EventQueue.invokeLater(new Runnable() {
		      public void run() {
		        createAndShowUI();
		      }
		    });


	}
	

	
}