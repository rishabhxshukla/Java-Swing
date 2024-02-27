import java.awt.*;
import javax.swing.*;

class CheckBox
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


        //Creating check boxes
        JCheckBox checkBox1 = new JCheckBox();
        JCheckBox checkBox2 = new JCheckBox();

        //Dimensions
        checkBox1.setBounds(220, 150, 100, 50);
        checkBox2.setBounds(220, 200, 120, 50);

        //Text
        checkBox1.setText("Male");
        checkBox2.setText("Female");

        //Font
        Font font = new Font("MV Boli", Font.PLAIN, 25);
        checkBox1.setFont(font);
        checkBox2.setFont(font);

        //Focus
        checkBox1.setFocusable(false);
        checkBox2.setFocusable(false);

        //Button group
        ButtonGroup gender = new ButtonGroup();
        gender.add(checkBox1);
        gender.add(checkBox2);

        //Adding check boxes to frame
        frame.add(checkBox1);
        frame.add(checkBox2);

        //Making frame visible
        frame.setVisible(true);
    }
}