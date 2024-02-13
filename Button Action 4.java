import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RedClass implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ButtonAction4.c.setBackground(Color.RED);
    }
}

class GreenClass implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ButtonAction4.c.setBackground(Color.GREEN);
    }
}

class BlueClass implements ActionListener
{
    @Override
    public void actionPerformed(ActionEvent e)
    {
        ButtonAction4.c.setBackground(Color.BLUE);
    }
}


class ButtonAction4
{
    static Container c;

    public static void main(String args[])
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(400, 300);
        frame.setLocation(600, 100);

        //Container
        c = frame.getContentPane();
        frame.setLayout(null);

        //Buttons
        JButton button1 = new JButton();
        JButton button2 = new JButton();
        JButton button3 = new JButton();

        //Adding buttons to frame
        c.add(button1);
        c.add(button2);
        c.add(button3);

        //Text
        button1.setText("Red");
        button2.setText("Green");
        button3.setText("Blue");

        //Bounds
        button1.setBounds(30, 100, 100, 30);
        button2.setBounds(140, 100, 100, 30);
        button3.setBounds(250, 100, 100, 30);

        //Font
        Font f = new Font("Arial", Font.BOLD, 22);
        button1.setFont(f);
        button2.setFont(f);
        button3.setFont(f);

        //Adding action listeners
        button1.addActionListener(new RedClass());
        button2.addActionListener(new GreenClass());
        button3.addActionListener(new BlueClass());
    }
}