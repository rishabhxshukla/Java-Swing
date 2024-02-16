import java.awt.*;
import javax.swing.*;

class ComboBox
{
    public static void main(String[] args)
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(400, 300);
        frame.setLocation(600, 100);


        //Combo Box (Drop Down)
        String menu[] = {"Pizza", "Burger", "Pasta", "Salad", "Water"};
        JComboBox dd = new JComboBox(menu);

        //Adding combo box to frame
        frame.add(dd);

        //Dimensions
        dd.setBounds(140, 30, 100, 30);

        //Font
        Font f = new Font("Arial", Font.BOLD, 22);
        dd.setFont(f);

        //Default selected item
        dd.setSelectedItem("Burger");

        //Default selected index
        dd.setSelectedIndex(3);

        //Adding new items
        dd.addItem("Milk");
        dd.addItem("Cola");

        //Removing item
        dd.removeItem("Pasta");

        //Button
        JButton button = new JButton();
        frame.add(button);
        button.setBounds(140, 100, 100, 30);
        button.setText("Select");
        Font button_font = new Font("Arial", Font.PLAIN, 18);
        button.setFont(button_font);

        //Label
        JLabel label = new JLabel();
        frame.add(label);
        label.setBounds(160, 150, 100, 30);
        label.setText("");
        Font label_font = new Font("Verdana", Font.PLAIN, 20);
        label.setFont(label_font);

        //Button action listener
        button.addActionListener((e) -> {
            String item = dd.getSelectedItem().toString();
            label.setText(item);
        });
    }
}