package LayoutManagers;
import java.awt.*;
import javax.swing.*;

class Grid_Layout
{
    public static void main(String args[])
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(600, 500);
        frame.setLocation(500, 100);


        //Setting frame layout
        frame.setLayout(new GridLayout(3, 2, 5, 5));

        //Creating panels
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        JPanel panel6 = new JPanel();

        //Background color
        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.BLUE);
        panel4.setBackground(Color.YELLOW);
        panel5.setBackground(Color.PINK);
        panel6.setBackground(Color.MAGENTA);

        //Adding panels to frame
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panel4);
        frame.add(panel5);
        frame.add(panel6);

        //Making frame visible
        frame.setVisible(true);
    }
}