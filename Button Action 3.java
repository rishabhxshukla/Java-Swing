import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonAction3
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

        //Container
        Container c = frame.getContentPane();
        frame.setLayout(null);

        //Button
        JButton button = new JButton();

        //Adding button to frame
        c.add(button);

        //Text
        button.setText("Click me");

        //Bounds
        button.setBounds(130, 100, 130, 30);

        //Font
        Font f = new Font("Arial", Font.BOLD, 22);
        button.setFont(f);

        //Adding action listener
        button.addActionListener((e) -> {
            c.setBackground(Color.RED);
        });
    }
}