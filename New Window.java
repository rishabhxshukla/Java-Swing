import java.awt.*;
import javax.swing.*;

class NewWindow
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


        //Button
        JButton button = new JButton();
        button.setText("Click me!");
        button.setFocusable(false);
        button.setBounds(220, 180, 150, 50);
        button.setFont(new Font("Mono", Font.BOLD, 25));
        button.setBorder(BorderFactory.createRaisedSoftBevelBorder());

        //Action listener
        button.addActionListener((e) -> {
            if (e.getSource() == button) {
                JFrame frame2 = new JFrame();
                frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame2.setLayout(null);
                frame2.setTitle("New window");
                frame2.setSize(400, 300);
                frame2.setLocation(0, 0);
                frame2.setVisible(true);
            }
        });

        //Adding button to frame
        frame.add(button);

        //Making frame visible
        frame.setVisible(true);
    }
}