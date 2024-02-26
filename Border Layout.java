import java.awt.*;
import javax.swing.*;

class Border_Layout
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
        frame.setLayout(new BorderLayout(5, 5));

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
        panel1.setPreferredSize(new Dimension(100, 50));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 50));

        //Adding panels to frame using Border Layout
        frame.add(panel1, BorderLayout.NORTH);          //Height is fixed
        frame.add(panel2, BorderLayout.WEST);           //Width is fixed
        frame.add(panel3, BorderLayout.CENTER);         //Width is fixed
        frame.add(panel4, BorderLayout.EAST);           //Width is fixed
        frame.add(panel5, BorderLayout.SOUTH);          //Height is fixed

        //Making frame visible
        frame.setVisible(true);
    }
}