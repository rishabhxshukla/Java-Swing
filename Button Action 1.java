import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame1 extends JFrame implements ActionListener
{
    Container c;
    JButton button;

    MyFrame1()
    {
        //Container
        c = this.getContentPane();
        c.setLayout(null);

        //Button
        button = new JButton("Click me");

        //Bounds
        button.setBounds(130, 100, 130, 30);

        //Font
        Font f = new Font("Arial", Font.BOLD, 22);
        button.setFont(f);

        //Adding action listener
        button.addActionListener(this);

        //Adding button on frame
        c.add(button);
    }


    //Function to perform action on event
    @Override
    public void actionPerformed(ActionEvent e)
    {
        c.setBackground(Color.BLUE);
    }
}


class ButtonAction1
{
    public static void main(String args[])
    {
        /* Basic JFrame */
        MyFrame1 frame = new MyFrame1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(400, 300);
        frame.setLocation(600, 100);
    }
}