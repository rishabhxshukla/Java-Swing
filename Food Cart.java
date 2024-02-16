import java.awt.*;
import javax.swing.*;

class FoodCart
{
    static JFrame frame = new JFrame();

    void frame()
    {
        /* Basic JFrame */
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Food Cart");
        frame.setSize(600, 400);
        frame.setLocation(400, 100);
    }


    void title()
    {
        //Label
        JLabel title = new JLabel();

        //Adding label to frame
        frame.add(title);

        //Dimensions
        title.setBounds(20, 20, 200, 30);

        //Text
        title.setText("Select an item :");

        //Foreground
        title.setForeground(Color.RED);

        //Font
        Font title_font = new Font("Arial", Font.BOLD, 25);
        title.setFont(title_font);
    }


    void checkBox()
    {
        //Check boxes
        JCheckBox cb1 = new JCheckBox();
        JCheckBox cb2 = new JCheckBox();
        JCheckBox cb3 = new JCheckBox();
        JCheckBox cb4 = new JCheckBox();
        JCheckBox cb5 = new JCheckBox();

        //Adding check boxes to frame
        frame.add(cb1);
        frame.add(cb2);
        frame.add(cb3);
        frame.add(cb4);
        frame.add(cb5);

        //Dimensions
        cb1.setBounds(20, 70, 180, 30);
        cb2.setBounds(20, 120, 180, 30);
        cb3.setBounds(20, 170, 180, 30);
        cb4.setBounds(20, 220, 180, 30);
        cb5.setBounds(20, 270, 180, 30);

        //Text
        cb1.setText("Pizza - 1000");
        cb2.setText("Burger - 500");
        cb3.setText("Pasta - 700");
        cb4.setText("Salad - 250");
        cb5.setText("Water - 100");

        //Font
        Font item_font = new Font("MV Boli", Font.PLAIN, 22);
        cb1.setFont(item_font);
        cb2.setFont(item_font);
        cb3.setFont(item_font);
        cb4.setFont(item_font);
        cb5.setFont(item_font);

        // Button group (optional)
        ButtonGroup items = new ButtonGroup();
        items.add(cb1);
        items.add(cb2);
        items.add(cb3);
        items.add(cb4);
        items.add(cb5);
    }


    void amount()
    {
        //Label
        JLabel amount = new JLabel();

        //Adding label to frame
        frame.add(amount);

        //Dimensions
        amount.setBounds(350, 100, 150, 30);

        //Text
        amount.setText("Bill amount :");

        //Font
        Font amount_font = new Font("Arial", Font.BOLD, 25);
        amount.setFont(amount_font);
    }

    
    public static void main(String args[])
    {
        FoodCart obj = new FoodCart();
        obj.frame();
        obj.title();
        obj.checkBox();
        obj.amount();
    }
}