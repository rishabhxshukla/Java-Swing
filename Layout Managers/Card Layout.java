package LayoutManagers;
import java.awt.*;
import javax.swing.*;

class Card_Layout
{
    public static void main(String args[])
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(600, 500);
        frame.setLocation(500, 100);

        
        //Create a panel to hold the CardLayout
        JPanel cardPanel = new JPanel();
        CardLayout card = new CardLayout();
        cardPanel.setLayout(card);

        //Creating panels
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        //Background color
        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.GREEN);
        panel3.setBackground(Color.BLUE);
        panel4.setBackground(Color.YELLOW);
        panel5.setBackground(Color.PINK);

        //Preferred size of panels
        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        //Adding panels to cardPanel with unique names
        cardPanel.add(panel1, "panel1");
        cardPanel.add(panel2, "panel2");
        cardPanel.add(panel3, "panel3");
        cardPanel.add(panel4, "panel4");
        cardPanel.add(panel5, "panel5");

        //Adding cardPanel to frame
        frame.add(cardPanel);

        //Show the fourth panel
        card.show(cardPanel, "panel4");

        //Making frame visible
        frame.setVisible(true);
    }
}
