package Experimentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import Model.PageTwoModel;

@SuppressWarnings("serial")
public class UI_2 extends JPanel{

    private JPanel topPanel;
    private JPanel centerPanel;
    private JPanel bottomPanel;
    private JLabel pageTwoLabel;
    private JLabel valueLabel;
    private JLabel pic;
    private JButton nextButton;
    private JButton cancelButton;

    public UI_2() {		// UI_2 pageTwoModel
    	
        JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		
        JPanel panel = new JPanel();
        
        setLayout(new BorderLayout());

        pageTwoLabel = new JLabel("Page Two");
        pic = new JLabel((new ImageIcon(UI_2.getImage())));
        valueLabel = new JLabel();
        nextButton = new JButton("Next");
        cancelButton = new JButton("Cancel");

        topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centerPanel = new JPanel(new FlowLayout());
        bottomPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING));

        topPanel.setBackground(Color.WHITE);
        topPanel.add(pageTwoLabel);

        centerPanel.add(pic);
        centerPanel.add(valueLabel);

        bottomPanel.add(nextButton);
        bottomPanel.add(cancelButton);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        
		// display window
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static String getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	public void nextButtonListener(ActionListener listener) {
        nextButton.addActionListener(listener);
    }

    public void cancelButtonListener(ActionListener listener) {
        cancelButton.addActionListener(listener);
    }

    public void setLabelValue(String s) {
        valueLabel.setText(s);
    }
    
    public static void main(String[] args){
    	UI_2 see = new UI_2();
    }
}