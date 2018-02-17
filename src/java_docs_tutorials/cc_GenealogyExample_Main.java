package java_docs_tutorials;


/*
 * A 1.4 example that uses the following files:
 *    GenealogyModel.java
 *    Person.java
 *
 * Based on an example provided by tutorial reader Olivier Berlanger.
 */
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cc_GenealogyExample_Main extends JPanel 
                              implements ActionListener {
    cc_GenealogyTree tree;
    private static String SHOW_ANCESTOR_CMD = "showAncestor";

    public cc_GenealogyExample_Main() {
        super(new BorderLayout());
        
        //Construct the panel with the toggle buttons.
        JRadioButton showDescendant = 
                new JRadioButton("Show descendants", true);
        final JRadioButton showAncestor = 
                new JRadioButton("Show ancestors");
        ButtonGroup bGroup = new ButtonGroup();
        bGroup.add(showDescendant);
        bGroup.add(showAncestor);
        showDescendant.addActionListener(this);
        showAncestor.addActionListener(this);
        showAncestor.setActionCommand(SHOW_ANCESTOR_CMD);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(showDescendant);
        buttonPanel.add(showAncestor);

        //Construct the tree.
        tree = new cc_GenealogyTree(getGenealogyGraph());
        JScrollPane scrollPane = new JScrollPane(tree);
        scrollPane.setPreferredSize(new Dimension(200, 200));

        //Add everything to this panel.
        add(buttonPanel, BorderLayout.PAGE_START);
        add(scrollPane, BorderLayout.CENTER);
    }

    /** 
     * Required by the ActionListener interface.
     * Handle events on the showDescendant and
     * showAncestore buttons. 
     */
    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand() == SHOW_ANCESTOR_CMD) {
            tree.showAncestor(true);
        } else {
            tree.showAncestor(false);
        }
    }
    
    /**
     *  Constructs the genealogy graph used by the model.
     */
    public cc_Person getGenealogyGraph() {
        //the greatgrandparent generation
        cc_Person a1 = new cc_Person("Jack (great-granddaddy)");
        cc_Person a2 = new cc_Person("Jean (great-granny)");
        cc_Person a3 = new cc_Person("Albert (great-granddaddy)");
        cc_Person a4 = new cc_Person("Rae (great-granny)");
        cc_Person a5 = new cc_Person("Paul (great-granddaddy)");
        cc_Person a6 = new cc_Person("Josie (great-granny)");

        //the grandparent generation
        cc_Person b1 = new cc_Person("Peter (grandpa)");
        cc_Person b2 = new cc_Person("Zoe (grandma)");
        cc_Person b3 = new cc_Person("Simon (grandpa)");
        cc_Person b4 = new cc_Person("James (grandpa)");
        cc_Person b5 = new cc_Person("Bertha (grandma)");
        cc_Person b6 = new cc_Person("Veronica (grandma)");
        cc_Person b7 = new cc_Person("Anne (grandma)");
        cc_Person b8 = new cc_Person("Renee (grandma)");
        cc_Person b9 = new cc_Person("Joseph (grandpa)");

        //the parent generation
        cc_Person c1 = new cc_Person("Isabelle (mom)");
        cc_Person c2 = new cc_Person("Frank (dad)");
        cc_Person c3 = new cc_Person("Louis (dad)");
        cc_Person c4 = new cc_Person("Laurence (dad)");
        cc_Person c5 = new cc_Person("Valerie (mom)");
        cc_Person c6 = new cc_Person("Marie (mom)");
        cc_Person c7 = new cc_Person("Helen (mom)");
        cc_Person c8 = new cc_Person("Mark (dad)");
        cc_Person c9 = new cc_Person("Oliver (dad)");

        //the youngest generation
        cc_Person d1 = new cc_Person("Clement (boy)");
        cc_Person d2 = new cc_Person("Colin (boy)");

        cc_Person.linkFamily(a1,a2,new cc_Person[] {b1,b2,b3,b4});
        cc_Person.linkFamily(a3,a4,new cc_Person[] {b5,b6,b7});
        cc_Person.linkFamily(a5,a6,new cc_Person[] {b8,b9});
        cc_Person.linkFamily(b3,b6,new cc_Person[] {c1,c2,c3});
        cc_Person.linkFamily(b4,b5,new cc_Person[] {c4,c5,c6});
        cc_Person.linkFamily(b8,b7,new cc_Person[] {c7,c8,c9});
        cc_Person.linkFamily(c4,c7,new cc_Person[] {d1,d2});

        return a1;
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("GenealogyExample");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        cc_GenealogyExample_Main newContentPane = new cc_GenealogyExample_Main();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
