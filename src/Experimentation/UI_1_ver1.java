package Experimentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class UI_1_ver1 extends JPanel{

    private JPanel topPanel;
    private JPanel centerPanel;
    private JPanel bottomPanel;
    private JLabel pageOneLabel;
    private JLabel valueLabel;
    private JLabel valueLabel_1;
    private JLabel valueLabel_2;
    private JLabel valueLabel_3;
    private JTextField textField;
    private JTextField textField_1;
    private JTextField textField_2;
    private JTextField textField_3;
    private JButton nextButton;
    private JButton cancelButton;

    public UI_1_ver1() {
        setLayout(new BorderLayout());
        
        JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 400);
		
        JPanel panel = new JPanel();
        
        // NEW https://stackoverflow.com/questions/21658144/jpanel-components-change-position-automatically/21659516#21659516
        
        
        

        pageOneLabel = new JLabel("Page One");
        valueLabel = new JLabel("Enter a value");
        textField = new JTextField(15);
        textField_1 = new JTextField(15);
        textField_2 = new JTextField(15);
        textField_3 = new JTextField(15);
        valueLabel_1 = new JLabel("num_1:");
        valueLabel_2 = new JLabel("num_2:");
        valueLabel_3 = new JLabel("num_3:");
        nextButton = new JButton("Next");
        cancelButton = new JButton("Cancel");

//        topPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        topPanel = new JPanel(new BorderLayout());
        centerPanel = new JPanel(new FlowLayout());
        bottomPanel = new JPanel(new FlowLayout(FlowLayout.TRAILING));

        topPanel.setBackground(Color.WHITE);
        topPanel.add(pageOneLabel);
        topPanel.add(valueLabel_1);
        topPanel.add(textField_1, BorderLayout.PAGE_START);
        topPanel.add(valueLabel_2);
        topPanel.add(textField_2, BorderLayout.CENTER);
        topPanel.add(valueLabel_3);
        topPanel.add(textField_3, BorderLayout.PAGE_END);
        
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
    	UI_1_ver1 see = new UI_1_ver1();
    }
}