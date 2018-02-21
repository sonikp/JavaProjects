package Experimentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UI_1 extends JPanel{

    private JPanel topPanel;
    private JPanel centerPanel;
    private JPanel bottomPanel;
    private JLabel pageOneLabel;
    private JLabel valueLabel;
    private JTextField textField;
    private JButton nextButton;
    private JButton cancelButton;

    public UI_1() {
        setLayout(new BorderLayout());
        
        JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		
        JPanel panel = new JPanel();
        

        pageOneLabel = new JLabel("Page One");
        valueLabel = new JLabel("Enter a value");
        textField = new JTextField(15);
        nextButton = new JButton("Next");
        cancelButton = new JButton("Cancel");

        topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        centerPanel = new JPanel(new FlowLayout());
        bottomPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING));

        topPanel.setBackground(Color.WHITE);
        topPanel.add(pageOneLabel);
        
        centerPanel.setBackground(Color.BLUE);
        centerPanel.add(valueLabel);
        centerPanel.add(textField);
        
        
        bottomPanel.setBackground(Color.RED);
        bottomPanel.add(nextButton);
        bottomPanel.add(cancelButton);

        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        
		// display window
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void nextButtonListener(ActionListener listener) {
        nextButton.addActionListener(listener);
    }

    public void cancelButtonListener(ActionListener listener) {
        cancelButton.addActionListener(listener);
    }

    public String textFieldValue() {
        return textField.getText();
    }
    
    public static void main(String[] args){
    	UI_1 see = new UI_1();
    }
}