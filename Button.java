import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

class Button
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


        //Creating a button
        JButton button = new JButton();

        //Text
        button.setText("On");

        //Dimensions
        button.setBounds(220, 220, 150, 50);

        //Foreground color
        button.setForeground(Color.black);

        //Background color
        button.setBackground(Color.cyan);

        //Font
        Font font = new Font("Lucida Sans", Font.BOLD, 25);
        button.setFont(font);

        //Focus
        button.setFocusable(false);

        //Cursor
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        button.setCursor(cursor);

        //Border
        Border border = BorderFactory.createRaisedSoftBevelBorder();
        button.setBorder(border);

        //Disabling button
        /* button.setEnabled(false); */

        //Image
        ImageIcon icon = new ImageIcon("Images/Icon.jpg");
        Image image = icon.getImage().getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(image);
        JLabel label = new JLabel();
        label.setIcon(scaledIcon);
        label.setBounds(240, 60, 120, 120);
        frame.add(label);

        //Action listener
        button.addActionListener((e) -> {
            if (button.getText().equals("On")) {
                button.setText("Off");
                label.setVisible(false);
                frame.getContentPane().setBackground(Color.DARK_GRAY);
            }
            else {
                button.setText("On");
                label.setVisible(true);
                frame.getContentPane().setBackground(Color.LIGHT_GRAY);
            }
        });

        //Adding button to frame
        frame.add(button);

        //Making frame visible
        frame.setVisible(true);
    }
}