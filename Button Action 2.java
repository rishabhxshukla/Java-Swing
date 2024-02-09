import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame2 extends JFrame implements ActionListener
{
    Container c;
    JButton button1, button2, button3;


    MyFrame2()
    {
        c = this.getContentPane();
        c.setLayout(null);

        //Button 1 :
        button1 = new JButton("Red");
        button1.setBounds(140, 50, 100, 30);
        Font f1 = new Font("Arial", Font.BOLD, 22);
        button1.setFont(f1);
        button1.addActionListener(this);

        //Button 2 :
        button2 = new JButton("Blue");
        button2.setBounds(140, 100, 100, 30);
        Font f2 = new Font("Arial", Font.BOLD, 22);
        button2.setFont(f2);
        button2.addActionListener(this);

        //Button 3 :
        button3 = new JButton("Green");
        button3.setBounds(140, 150, 100, 30);
        Font f3 = new Font("Arial", Font.BOLD, 22);
        button3.setFont(f3);
        button3.addActionListener(this);

        //Adding buttons on frame
        c.add(button1);
        c.add(button2);
        c.add(button3);
    }


    @Override
    public void actionPerformed(ActionEvent e)
    {
        Object event = e.getSource();

        if (event == button1) {
            c.setBackground(Color.RED);
        }

        else if (event == button2) {
            c.setBackground(Color.BLUE);
        }

        else {
            c.setBackground(Color.GREEN);
        }
    }
}


class ButtonAction2
{
    public static void main(String args[])
    {
        /* Basic JFrame */
        MyFrame2 frame = new MyFrame2();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(400, 300);
        frame.setLocation(600, 100);
    }
}