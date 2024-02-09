import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener
{
    Container c;
    JButton button;

    MyFrame()
    {
        //Container
        c = this.getContentPane();
        c.setLayout(null);

        //Button
        button = new JButton("Click me");

        //Location Size
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


class ButtonAction
{
    public static void main(String args[])
    {
        /* Basic JFrame */
        MyFrame frame = new MyFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(400, 300);
        frame.setLocation(600, 100);
    }
}