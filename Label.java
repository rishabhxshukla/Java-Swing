import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class Label
{
    public static void main(String args[])
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setTitle("My app");
        frame.setSize(600, 500);
        frame.setLocation(500, 100);

        //Creating a label
        JLabel label = new JLabel();

        //Text
        label.setText("Hello world!");

        //Dimensions
        label.setBounds(130, 60, 310, 280);

        //Foreground color
        label.setForeground(Color.RED);

        //Background color
        label.setBackground(Color.BLACK);
        label.setOpaque(true);

        //Font
        Font font = new Font("MV Boli", Font.PLAIN, 25);
        label.setFont(font);

        //Border
        Border border = BorderFactory.createLineBorder(Color.GREEN, 3);
        label.setBorder(border);

        //Adding image
        ImageIcon img = new ImageIcon("Images/Image 1.jpg");
        label.setIcon(img);

        //Moving text around image
        label.setVerticalTextPosition(JLabel.TOP);           //Placing text on top
        label.setHorizontalTextPosition(JLabel.CENTER);      //Placing text on center

        //Gap between text and image
        label.setIconTextGap(10);

        //Adding label to frame
        frame.add(label);

        //Making frame visible
        frame.setVisible(true);
    }
}