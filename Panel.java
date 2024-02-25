import java.awt.*;
import javax.swing.*;

class Panel
{
    public static void main(String args[])
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(600, 500);
        frame.setLocation(500, 100);


        //Creating 1st panel
        JPanel panel1 = new JPanel();

        //Border layout
        panel1.setLayout(new BorderLayout());

        //Dimensions
        panel1.setBounds(0,0, 200, 200);

        //Background color
        panel1.setBackground(Color.RED);

        //Adding panel 1 to frame
        frame.add(panel1);

        /*-----------------------------------------------*/

        //Creating 2nd panel
        JPanel panel2 = new JPanel();

        //Border layout
        panel2.setLayout(new BorderLayout());

        //Dimensions
        panel2.setBounds(200,0, 200, 200);

        //Background color
        panel2.setBackground(Color.BLUE);

        //Adding panel 2 to frame
        frame.add(panel2);

        /*-----------------------------------------------*/

        //Creating 3rd panel
        JPanel panel3 = new JPanel();

        //Border layout
        panel3.setLayout(new BorderLayout());

        //Dimensions
        panel3.setBounds(400,0, 200, 200);

        //Background color
        panel3.setBackground(Color.GREEN);

        //Adding panel 3 to frame
        frame.add(panel3);

        /*-----------------------------------------------*/

        //Creating 4th panel
        JPanel panel4 = new JPanel();

        //Null layout
        panel4.setLayout(null);

        //Dimensions
        panel4.setBounds(0,200, 600, 300);

        //Background color
        panel4.setBackground(Color.YELLOW);

        //Adding panel 4 to frame
        frame.add(panel4);

        /*-----------------------------------------------*/

        //Adding items on panels
        JLabel label1 = new JLabel("Panel 1");
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setHorizontalAlignment(JLabel.CENTER);
        panel1.add(label1);

        JLabel label2 = new JLabel("Panel 2");
        label2.setVerticalAlignment(JLabel.CENTER);
        label2.setHorizontalAlignment(JLabel.CENTER);
        panel2.add(label2);

        JLabel label3 = new JLabel("Panel 3");
        label3.setVerticalAlignment(JLabel.CENTER);
        label3.setHorizontalAlignment(JLabel.CENTER);
        panel3.add(label3);

        JButton button = new JButton("Panel 4");
        button.setBounds(250, 120, 80, 20);
        panel4.add(button);

        //Making frame visible
        frame.setVisible(true);

        /*-----------------------------------------------*/
    }
}