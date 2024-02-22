import java.awt.*;
import javax.swing.*;

class Panel
{
    public static void main(String args[])
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(500, 400);
        frame.setLocation(500, 100);


        //JPanel 1
        JPanel jp1 = new JPanel();

        //Adding panel to frame
        frame.add(jp1);

        //Null layout
        jp1.setLayout(null);

        //Dimensions
        jp1.setBounds(140,60, 200, 200);

        //Background color
        jp1.setBackground(Color.blue);

        /*---------------------------------------------*/

        //JPanel 2
        JPanel jp2 = new JPanel();

        //Adding panel to 1st panel
        jp1.add(jp2);

        //Null layout
        jp2.setLayout(null);

        //Dimensions
        jp2.setBounds(40,37, 120, 120);

        //Background color
        jp2.setBackground(Color.red);

        /*---------------------------------------------*/

        //Button
        JButton button = new JButton();

        //Adding button to 2nd panel
        jp2.add(button);

        //Text
        button.setText("Click me");

        //Dimensions
        button.setBounds(18,45,85,30);
    }
}