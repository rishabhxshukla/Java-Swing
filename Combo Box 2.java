import java.awt.*;
import javax.swing.*;

class ComboBox2
{
    public static void main(String[] args)
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setTitle("My app");
        frame.setSize(600, 500);
        frame.setLocation(500, 100);


        //Creating a combo box
        String menu[] = {"Pizza", "Burger", "Pasta", "Salad", "Water"};
        JComboBox comboBox = new JComboBox(menu);

        //Dimensions
        comboBox.setBounds(220, 100, 100, 30);

        //Font
        Font font = new Font("Arial", Font.BOLD, 22);
        comboBox.setFont(font);

        //Default selected item
        comboBox.setSelectedItem("Burger");

        //Default selected index
        comboBox.setSelectedIndex(3);

        //Adding new item
        comboBox.addItem("Milk");
        comboBox.addItem("Cola");

        //Adding item at index
        comboBox.insertItemAt("Fries", 2);

        //Removing item
        comboBox.removeItem("Pasta");

        //Removing item at index
        comboBox.removeItemAt(4);

        //Removing all items
        /* comboBox.removeAllItems(); */

        /*------------------------------------------------------------*/

        //Label
        JLabel label = new JLabel();
        label.setBounds(240, 200, 100, 30);
        label.setText("");
        Font label_font = new Font("Verdana", Font.PLAIN, 20);
        label.setFont(label_font);
        frame.add(label);

        //Item listener
        comboBox.addItemListener((e) -> {
            String item = e.getItem().toString();
            label.setText(item);
        });

        //Adding combo box to frame
        frame.add(comboBox);

        //Making frame visible
        frame.setVisible(true);
    }
}