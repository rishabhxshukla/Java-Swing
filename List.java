import java.awt.*;
import javax.swing.*;

class List
{
    public static void main(String args[])
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(500, 400);
        frame.setLocation(500, 100);


        //Panel
        JPanel jp = new JPanel();

        //Dimensions
        jp.setBounds(0, 0, 300, 400);

        //List items
        String fruits[] = {"apple", "banana", "orange", "mango", "grapes"};

        //List
        JList list = new JList(fruits);

        //Font
        list.setFont(new Font("Arial", Font.BOLD, 25));

        //Adding list to panel
        jp.add(new JScrollPane(list));

        //Adding panel to frame
        frame.add(jp);
    }
}