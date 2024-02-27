import java.awt.*;
import javax.swing.*;

class RadioButton
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


        //Creating radio buttons
        JRadioButton radioBtn1 = new JRadioButton();
        JRadioButton radioBtn2 = new JRadioButton();

        //Dimensions
        radioBtn1.setBounds(220, 150, 100, 50);
        radioBtn2.setBounds(220, 200, 120, 50);

        //Text
        radioBtn1.setText("Male");
        radioBtn2.setText("Female");

        //Font
        Font font = new Font("MV Boli", Font.PLAIN, 25);
        radioBtn1.setFont(font);
        radioBtn2.setFont(font);

        //Focus
        radioBtn1.setFocusable(false);
        radioBtn2.setFocusable(false);

        //Button group
        ButtonGroup gender = new ButtonGroup();
        gender.add(radioBtn1);
        gender.add(radioBtn2);

        //Adding radio buttons to frame
        frame.add(radioBtn1);
        frame.add(radioBtn2);

        //Making frame visible
        frame.setVisible(true);
    }
}