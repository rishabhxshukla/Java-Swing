import java.awt.*;
import javax.swing.*;

class ToggleButton
{
    public static void main(String[] args)
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(400, 300);
        frame.setLocation(600, 100);


        //Toggle Button
        JToggleButton tb = new JToggleButton();

        //Adding combo box to frame
        frame.add(tb);

        //Dimensions
        tb.setBounds(140, 80, 100, 30);

        //Text
        tb.setText("On");

        //Font
        Font f = new Font("Arial", Font.BOLD, 22);
        tb.setFont(f);

        //Adding action listener
        tb.addActionListener((e) -> {

            if (tb.getText().equals("On")) {
                tb.setText("Off");
                frame.getContentPane().setBackground(Color.RED);
            }
            else {
                tb.setText("On");
                frame.getContentPane().setBackground(Color.GREEN);
            }
        });
    }
}