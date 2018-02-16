package CostCalculator;

// https://www.codeproject.com/Questions/453820/In-a-JPanel-to-add-JTextarea-in-that-how-to-add-JS

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.WindowConstants;

public class ExpTextAreaExample extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -116021326175824941L;
	private JScrollPane jScrollPane1;
	private JTextArea textArea;

	public ExpTextAreaExample() {
		this.setPreferredSize(new Dimension(360,200	));
		
		textArea = new JTextArea(8,30);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		
		jScrollPane1 = new JScrollPane(textArea);
		
		jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		JPanel panel = new JPanel();
		panel.setSize(200, 200);
		panel.add(jScrollPane1);
		getContentPane().add(panel);
		pack();
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				UIManager.put("swing.boldMetal", Boolean.FALSE);
				new ExpTextAreaExample().setVisible(true);
			}
		});
		
	}
	
	
}