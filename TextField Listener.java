import java.awt.*;
import javax.swing.*;

class TextFieldListener
{
    public static void main(String args[])
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setLayout(null);
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

        //Label
        JLabel label = new JLabel("");
        frame.add(label);

        //Dimensions
        label.setBounds(130, 150, 200, 30);

        //Adding action listener
        tf.addActionListener((e) -> {
            String name = tf.getText().toUpperCase();
            label.setText(name);
        });

        //Making frame visible
        frame.setVisible(true);
    }
}