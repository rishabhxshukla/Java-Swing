import java.awt.*;
import javax.swing.*;

class ComboBox
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

        //Button
        JButton button = new JButton();
        button.setBounds(220, 200, 100, 30);
        button.setText("Select");
        button.setFocusable(false);
        Font button_font = new Font("Arial", Font.PLAIN, 18);
        button.setFont(button_font);
        frame.add(button);

        //Label
        JLabel label = new JLabel();
        label.setBounds(240, 300, 100, 30);
        label.setText("");
        Font label_font = new Font("Verdana", Font.PLAIN, 20);
        label.setFont(label_font);
        frame.add(label);

        //Action listener
        button.addActionListener((e) -> {
            String item = comboBox.getSelectedItem().toString();
            label.setText(item);
        });

        //Adding combo box to frame
        frame.add(comboBox);

        //Making frame visible
        frame.setVisible(true);
    }
}