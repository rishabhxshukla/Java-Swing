import java.awt.*;
import javax.swing.*;

class CheckBox
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

        //Check boxes
        JCheckBox checkBox1 = new JCheckBox();
        JCheckBox checkBox2 = new JCheckBox();

        //Adding radio buttons to panel
        panel.add(checkBox1);
        panel.add(checkBox2);

        //Adding panel to frame
        frame.add(panel);

        //Dimensions
        checkBox1.setBounds(50, 50, 100, 50);
        checkBox2.setBounds(50, 100, 100, 50);

        //Text
        checkBox1.setText("Male");
        checkBox2.setText("Female");

        //Font
        Font f = new Font("MV Boli", Font.PLAIN, 25);
        checkBox1.setFont(f);
        checkBox2.setFont(f);

        //Button group
        ButtonGroup gender = new ButtonGroup();
        gender.add(checkBox1);
        gender.add(checkBox2);
    }
}