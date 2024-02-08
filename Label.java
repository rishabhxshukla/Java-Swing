import java.awt.*;
import javax.swing.*;

class Label
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


        //Creating a label
        JLabel label = new JLabel();

        //Adding label to window
        frame.add(label);

        //Text
        label.setText("Hello world!");

        //Foreground color
        label.setForeground(Color.RED);

        //Background color
        label.setBackground(Color.BLACK);
        label.setOpaque(true);

        //Font
        Font font = new Font("MV Boli", Font.PLAIN, 25);
        label.setFont(font);

        //Adding image
        ImageIcon img = new ImageIcon("Images/Image 1.jpg");
        label.setIcon(img);

        //Moving text around image
        label.setVerticalTextPosition(JLabel.TOP);           //Placing text on top
        label.setHorizontalTextPosition(JLabel.CENTER);      //Placing text on left

        //Set gap between text and image
        label.setIconTextGap(10);
    }
}