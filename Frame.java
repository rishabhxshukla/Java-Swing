import java.awt.*;
import javax.swing.*;

class Frame
{
    public static void main(String args[]) 
    {
        //Creating a window
        JFrame frame = new JFrame();

        //Stopping program with 'X'
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Null layout
        frame.setLayout(null);

        //Title
        frame.setTitle("My app");

        //Window size
        frame.setSize(600, 500);

        //Window location
        frame.setLocation(500, 100);

        //Setting location and size together
        frame.setBounds(500, 100, 600, 500);

        //Preventing window resize
        frame.setResizable(false);

        //Icon image
        ImageIcon icon = new ImageIcon("Images/Icon.jpg");
        frame.setIconImage(icon.getImage());

        //Background color
        frame.getContentPane().setBackground(Color.PINK);

        //Making window visible
        frame.setVisible(true);
    }
}