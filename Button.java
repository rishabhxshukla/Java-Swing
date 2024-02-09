import java.awt.*;
import javax.swing.*;

class Button
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
        c.setLayout(null);

        //Button
        JButton button = new JButton();

        //Adding button to window
        frame.add(button);

        //Text
        button.setText("Click me!");

        //Size
        button.setSize(150, 50);

        //Location
        button.setLocation(100, 100);

        //Foreground color
        button.setForeground(Color.black);

        //Background color
        button.setBackground(Color.cyan);

        //Font
        Font f = new Font("Arial", Font.BOLD, 22);
        button.setFont(f);

        //Cursor
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        button.setCursor(cursor);
    }
}