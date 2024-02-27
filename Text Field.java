import java.awt.*;
import java.awt.font.TextLayout;
import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.text.Caret;

class TextField
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


        //Creating a text field
        JTextField textField = new JTextField();

        //Dimensions
        textField.setBounds(200, 120, 200, 40);

        //Text
        textField.setText("");

        //Foreground color
        textField.setForeground(Color.GREEN);

        //Background color
        textField.setBackground(Color.BLACK);

        //Caret color
        textField.setCaretColor(Color.WHITE);

        //Font
        Font font = new Font("Arial", Font.BOLD, 20);
        textField.setFont(font);

        //Padding
        textField.setMargin(new Insets(2, 10, 2, 10));

        //Preventing user from typing
        /* textField.setEditable(false); */

        //Adding label to frame
        frame.add(textField);

        /*----------------------------------------------------------*/

        //Button
        JButton button = new JButton();
        button.setText("Submit");
        button.setFocusable(false);
        button.setBounds(240, 200, 100, 30);
        button.setFont(font);
        button.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        frame.add(button);

        //Action listener
        button.addActionListener((e) -> {
            if (e.getSource() == button) {
                String name = textField.getText();
                System.out.println("Name : " + name);
            }
        });

        //Making frame visible
        frame.setVisible(true);
    }
}