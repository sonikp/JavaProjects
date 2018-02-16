package CostCalculator;

import java.awt.Point; // not sure what this is need to investigate
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ExpFrame extends JFrame {
	
	// adding JTable
	
	
	private JTextArea txt_TextArea = new JTextArea();
	private JScrollPane scrollPane = new JScrollPane(txt_TextArea, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

	private JButton btnClear = new JButton("Clear");
	private JButton btnCalc = new JButton("Calc");

	private JTextField txt_UnitCost = new JTextField();
	private JTextField txt_Weight = new JTextField();
	private JTextField txt_ItemCount = new JTextField();
	private JTextField txt_ShippingCost = new JTextField();
	private JTextField txt_ResultCostPerUnit = new JTextField();
	private JTextField txt_ResultCostPerUnitShipping = new JTextField();

	private JLabel lbl_UnitCost = new JLabel("Unit Cost:");
	private JLabel lbl_Weight = new JLabel("Weight (grams):");
	private JLabel lbl_ItemCount = new JLabel("No. of Items:");
	private JLabel lbl_ShippingCost = new JLabel("Shipping Cost:");
	private JLabel lbl_ResultCostPerUnit = new JLabel("Res: Cost/gram:");
	private JLabel lbl_ResultCostPerUnitShipping = new JLabel("Res: Cost/gram w.Shipping:");

	// create output decimal formatting
	DecimalFormat df = new DecimalFormat("#,###,##0.0000");

	public ExpFrame() {
		setTitle("CostCalculator");
		setSize(500, 400);
		setLocation(new Point(300, 200));
		setLayout(null);
		setResizable(false);

		initComponent();
		initEvent();
	}

	private void initComponent() {

		btnCalc.setBounds(230, 345, 80, 25);
		btnClear.setBounds(300, 345, 80, 25);
		
		txt_TextArea.setBounds(20, 170, 460, 165);

		txt_UnitCost.setBounds(200, 10, 150, 20);
		txt_Weight.setBounds(200, 35, 150, 20);
		txt_ItemCount.setBounds(200, 60, 150, 20);
		txt_ShippingCost.setBounds(200, 85, 150, 20);
		txt_ResultCostPerUnit.setBounds(200, 110, 150, 20);
		txt_ResultCostPerUnitShipping.setBounds(200, 135, 150, 20);

		lbl_UnitCost.setBounds(20, 10, 100, 20);
		lbl_Weight.setBounds(20, 35, 150, 20);
		lbl_ItemCount.setBounds(20, 60, 100, 20);
		lbl_ShippingCost.setBounds(20, 85, 100, 20);
		lbl_ResultCostPerUnit.setBounds(20, 110, 100, 20);
		lbl_ResultCostPerUnitShipping.setBounds(20, 135, 180, 20);

		add(btnClear);
		add(btnCalc);
		add(txt_TextArea);		// cant add scrollPane
//		add(scrollPane);


		add(lbl_UnitCost);
		add(lbl_Weight);
		add(lbl_ItemCount);
		add(lbl_ShippingCost);
		add(lbl_ResultCostPerUnit);
		add(lbl_ResultCostPerUnitShipping);

		add(txt_UnitCost);
		add(txt_Weight);
		add(txt_ItemCount);
		add(txt_ShippingCost);
		add(txt_ResultCostPerUnit);
		add(txt_ResultCostPerUnitShipping);
	}

	private void initEvent() {

		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(1);
			}
		});

		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_Exit(e);
			}
		});

		btnCalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_Calc(e);
			}
		});
	}

	private void btn_Exit(ActionEvent evt) {
		// System.exit(0);
		txt_UnitCost.setText("");
		txt_Weight.setText("");
		txt_ItemCount.setText("");
		txt_ShippingCost.setText("");
		txt_ResultCostPerUnit.setText("");
		txt_ResultCostPerUnitShipping.setText("");
		txt_TextArea.setText("");

	}

	private void btn_Calc(ActionEvent evt) {
		Double a, b, c, d, y, z;
		String newLine = "\n";
		try {
			a = Double.parseDouble(txt_UnitCost.getText());
			b = Double.parseDouble(txt_Weight.getText());
			c = Double.parseDouble(txt_ItemCount.getText());
			d = Double.parseDouble(txt_ShippingCost.getText());

			// calculations
			y = a / (b * c); // how much is the cost for the smallest weight
								// unit
			z = (a + d) / (b * c); // same as above this time with shipping
									// included

			// formatting to 4 decimal places
			txt_ResultCostPerUnit.setText(df.format(y));
			txt_ResultCostPerUnitShipping.setText(df.format(z));
			txt_TextArea.append(df.format(y)+newLine);
			txt_TextArea.append(df.format(z)+newLine);

		} catch (Exception e) {
			System.out.println(e);
			JOptionPane.showMessageDialog(null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
}