package CostCalculator;



import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExpFrame extends JFrame {

  private JButton btnStop  = new JButton("Stop");
  private JButton btnStart = new JButton("Start");

  private JTextField txtA = new JTextField();
  private JTextField txtB = new JTextField();
  private JTextField txtC = new JTextField();
  private JTextField txtD = new JTextField();

  private JLabel lblA = new JLabel("Unit Cost :");
  private JLabel lblB = new JLabel("Weight :");
  private JLabel lblC = new JLabel("Item No :");
  private JLabel lblD = new JLabel("Shipping :");

  public ExpFrame(){
    setTitle("CostCalculator");
    setSize(400,200);
    setLocation(new Point(300,200));
    setLayout(null);    
    setResizable(false);

    initComponent();    
    initEvent();    
  }

  private void initComponent(){
    btnStop.setBounds(300,130, 80,25);
    btnStart.setBounds(300,100, 80,25);

    txtA.setBounds(100,10,100,20);
    txtB.setBounds(100,35,100,20);
    txtC.setBounds(100,60,100,20);
    txtD.setBounds(100,85,100,20);

    lblA.setBounds(20,10,100,20);
    lblB.setBounds(20,35,100,20);
    lblC.setBounds(20,60,100,20);
    lblD.setBounds(20,85,100,20);


    add(btnStop);
    add(btnStart);

    add(lblA);
    add(lblB);
    add(lblC);
    add(lblD);

    add(txtA);
    add(txtB);
    add(txtC);
    add(txtD);
  }

  private void initEvent(){

    this.addWindowListener(new WindowAdapter() {
      public void windowClosing(WindowEvent e){
       System.exit(1);
      }
    });

    btnStop.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnTutupClick(e);
      }
    });

    btnStart.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        btnTambahClick(e);
      }
    });
  }
  
  private void btnTutupClick(ActionEvent evt){
    System.exit(0);
  }
  
  private void btnTambahClick(ActionEvent evt){
    Integer x,y,z;
    try{
      x = Integer.parseInt(txtA.getText());
      y = Integer.parseInt(txtB.getText());
      z = x + y;
      txtC.setText(z.toString());

    }catch(Exception e){
      System.out.println(e);
      JOptionPane.showMessageDialog(null, 
          e.toString(),
          "Error", 
          JOptionPane.ERROR_MESSAGE);
    }
  }
}