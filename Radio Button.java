import java.awt.*;
import javax.swing.*;

class RadioButton
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


        //Create a panel with FlowLayout
        JPanel panel = new JPanel(new FlowLayout());

        //Radio buttons
        JRadioButton radioBtn1 = new JRadioButton();
        JRadioButton radioBtn2 = new JRadioButton();

        //Adding radio buttons to panel
        panel.add(radioBtn1);
        panel.add(radioBtn2);

        //Adding panel to frame
        frame.add(panel);

        //Dimensions
        radioBtn1.setBounds(50, 50, 100, 50);
        radioBtn2.setBounds(50, 100, 100, 50);

        //Text
        radioBtn1.setText("Male");
        radioBtn2.setText("Female");

        //Font
        Font f = new Font("MV Boli", Font.PLAIN, 25);
        radioBtn1.setFont(f);
        radioBtn2.setFont(f);

        //Button group
        ButtonGroup gender = new ButtonGroup();
        gender.add(radioBtn1);
        gender.add(radioBtn2);
    }
}