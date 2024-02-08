import java.awt.*;
import javax.swing.*;

class Frame
{
    public static void main(String args[]) 
    {
        //Creating a window
        JFrame frame = new JFrame();

        //Making window visible                          
        frame.setVisible(true);

        //Stopping program with 'X'
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Title
        frame.setTitle("My app");

        //Window size
        frame.setSize(400, 300);

        //Window location
        frame.setLocation(600, 100);

        //Setting location and size together
        frame.setBounds(600, 100, 400, 300);

        //Preventing window resize
        frame.setResizable(false);

        //Icon image
        ImageIcon icon = new ImageIcon("Images/Icon.jpg");
        frame.setIconImage(icon.getImage());

        //Background color
        Container c = frame.getContentPane();
        c.setBackground(Color.PINK);
    }
}