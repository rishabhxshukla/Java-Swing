import javax.swing.*;
import java.awt.*;

class InputField
{
    public static void main(String args[])
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(400, 300);
        frame.setLocation(600, 100);


        //Text Field
        JTextField tf = new JTextField();
        frame.add(tf);

        //Dimensions
        tf.setBounds(100, 100, 200, 30);

        //Text
        tf.setText("Name");

        //Font
        Font f = new Font("Arial", Font.BOLD, 18);
        tf.setFont(f);

        //Foreground color
        tf.setForeground(Color.black);

        //Background color
        tf.setBackground(Color.cyan);

        //Preventing user from typing
        tf.setEditable(false);
    }
}