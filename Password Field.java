import java.awt.*;
import javax.swing.*;

class PasswordField
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


        //Password Field
        JPasswordField pf = new JPasswordField();
        frame.add(pf);

        //Dimensions
        pf.setBounds(100, 100, 200, 30);

        //Text
        pf.setText("pass@123");

        //Character for hiding password
        pf.setEchoChar('*');

        //Foreground color
        pf.setForeground(Color.black);

        //Background color
        pf.setBackground(Color.cyan);
    }
}