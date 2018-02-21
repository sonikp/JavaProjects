package Experimentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class UI_3{

    private JPanel topPanel;
    private JPanel centerPanel;
    private JPanel bottomPanel;
    private JLabel pageThreeLabel;
    private JLabel valueLabel;
    private JButton closeButton;

    public UI_3() {
    	
    	JFrame frame = new JFrame();
 		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		frame.setSize(500, 400);
 		
         JPanel panel = new JPanel();
         
         panel.setLayout(new BorderLayout());

        pageThreeLabel = new JLabel("Page Three");
        valueLabel = new JLabel("End of Page");
        closeButton = new JButton("Close");

        topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centerPanel = new JPanel(new FlowLayout());
        bottomPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING));

        topPanel.setBackground(Color.WHITE);
        topPanel.add(pageThreeLabel);

        centerPanel.add(valueLabel);

        bottomPanel.add(closeButton);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        
		// display window
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
    public static void main(String[] args){
    	UI_3 see = new UI_3();
    }
}