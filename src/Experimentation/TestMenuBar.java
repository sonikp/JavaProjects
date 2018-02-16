package Experimentation;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class TestMenuBar {

    public static void main(String[] args) {
        new TestMenuBar();
    }

    public TestMenuBar() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (ClassNotFoundException ex) {
                } catch (InstantiationException ex) {
                } catch (IllegalAccessException ex) {
                } catch (UnsupportedLookAndFeelException ex) {
                }

                UIManager.put("MenuBar.background", Color.RED);
                UIManager.put("Menu.background", Color.GREEN);
                UIManager.put("MenuItem.background", Color.MAGENTA);

                JMenu mnu = new JMenu("Testing");
                mnu.add("Menu Item 1");
                mnu.add("Menu Item 2");

                JMenuBar mb = new JMenuBar();
                mb.add(mnu);
                mb.add(new JMenu("Other"));

                JFrame frame = new JFrame("Test");
                frame.setJMenuBar(mb);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setLayout(new BorderLayout());
                frame.add(new JPanel());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }

        });
    }

}