import java.awt.*;
import javax.swing.*;

class MenuBar
{
    public static void main(String args[])
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(400, 300);
        frame.setLocation(600, 100);

        // Menu Bar
        JMenuBar menubar = new JMenuBar();

        // File Menu
        JMenu file = new JMenu("File"); // Specify the text for the menu
        JMenuItem f1 = new JMenuItem("Open");
        JMenuItem f2 = new JMenuItem("Create");
        JMenuItem f3 = new JMenuItem("Delete");

        // Adding file menu items
        file.add(f1);
        file.add(f2);
        file.add(f3);

        // Edit Menu
        JMenu edit = new JMenu("Edit"); // Specify the text for the menu
        JMenuItem e1 = new JMenuItem("Cut");
        JMenuItem e2 = new JMenuItem("Copy");
        JMenuItem e3 = new JMenuItem("Paste");

        // Adding edit menu items
        edit.add(e1);
        edit.add(e2);
        edit.add(e3);

        // Adding file and edit menus to the menubar
        menubar.add(file);
        menubar.add(edit);

        // Adding menu bar to frame
        frame.setJMenuBar(menubar);

        // Making frame visible
        frame.setVisible(true);
    }
}
