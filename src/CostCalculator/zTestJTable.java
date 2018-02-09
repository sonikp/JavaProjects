package CostCalculator;

/*

JTable :: http://www.codejava.net/java-se/swing/a-simple-jtable-example-for-display 

*/

/*
Eclipse Shortcuts:
		http://crunchify.com/my-favorite-eclipse-shortcuts-for-mac-and-windows/
		<command><shift><L> => show menu
		<command><shift><F> => auto format source code



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


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class zTestJTable extends JFrame{
	
	public zTestJTable()
    {
        //headers for the table
        String[] columns = new String[] {
            "Id", "Name", "Hourly Rate", "Part Time"
        };
         
        //actual data for the table in a 2d array
        Object[][] data = new Object[][] {
            {1, "John", 40.0, false },
            {2, "Rambo", 70.0, false },
            {3, "Zorro", 60.0, true },
        };
        
        final Class[] columnClass = new Class[] {
                Integer.class, String.class, Double.class, Boolean.class
         };
        
		// create table model with data
		DefaultTableModel model = new DefaultTableModel(data, columns) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false; // set = true
			}

			@Override
			public Class<?> getColumnClass(int columnIndex) {
				return columnClass[columnIndex];
			}
		};
        
        JTable table = new JTable(model);		// replaces below
        
        /*
        aligning data in center:
        https://coderanch.com/t/339409/java/Centering-Text-JTable
        https://stackoverflow.com/questions/7433602/how-to-center-in-jtable-cell-a-value/7433758
        
        
        */
        
        /*
        OLD
        //create table with data
        JTable table = new JTable(data, columns);
        */
        
        
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new zTestJTable();
            }
        });

	

		
	}


	
}