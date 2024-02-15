import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MyCalculator extends JFrame implements ActionListener
{
    Container c;
    JLabel label1, label2, label3;
    JTextField textField1, textField2;
    JButton add, sub, mul, div;


    MyCalculator()
    {
        setVisible(true);
        setTitle("My Calculator");
        setBounds(100, 100, 600, 500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        c = getContentPane();
        c.setLayout(null);

        //Labels
        label1 = new JLabel("First number :");
        label2 = new JLabel("Second number :");
        label3 = new JLabel("Result :");

        //Bounds
        label1.setBounds(50, 50, 150, 50);
        label2.setBounds(50, 150, 150, 50);
        label3.setBounds(200, 350, 400, 50);

        //Font
        Font lf = new Font("Arial", Font.BOLD, 18);
        label1.setFont(lf);
        label2.setFont(lf);
        label3.setFont(lf);

        //Adding labels to window
        c.add(label1);
        c.add(label2);
        c.add(label3);

        //TextFields
        textField1 = new JTextField();
        textField2 = new JTextField();

        //Bounds
        textField1.setBounds(250, 50, 150, 50);
        textField2.setBounds(250, 150, 150, 50);

        //Adding text fields to window
        c.add(textField1);
        c.add(textField2);

        //Buttons
        add = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");

        //Bounds
        add.setBounds(100, 250, 50, 50);
        sub.setBounds(170, 250, 50, 50);
        mul.setBounds(240, 250, 50, 50);
        div.setBounds(310, 250, 50, 50);

        //Font
        Font bf = new Font("Arial", Font.BOLD, 22);
        add.setFont(bf);
        sub.setFont(bf);
        mul.setFont(bf);
        div.setFont(bf);

        //Action Listeners
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        //Adding buttons to window
        c.add(add);
        c.add(sub);
        c.add(mul);
        c.add(div);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(textField1.getText());
        int b = Integer.parseInt(textField2.getText());
        int c = 0;

        try
        {
            if (e.getSource() == add) {
                c = a + b;
            }
            else if (e.getSource() == sub) {
                c = a - b;
            }
            else if (e.getSource() == mul) {
                c = a * b;
            }
            else {
                c = a / b;
            }

            label3.setText("Result : " + c);
        }
        catch(NumberFormatException | ArithmeticException ex)
        {
            label3.setText("Error : " + ex);
        }
    }

    public static void main(String args[])
    {
        MyCalculator calc = new MyCalculator();
    }
}