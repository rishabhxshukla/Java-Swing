import java.awt.*;
import javax.swing.*;

class Table
{
    public static void main(String args[])
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(600, 400);
        frame.setLocation(400, 100);


        //Rows
        String data[][] = {
                {"100", "Rishabh", "CSE"},
                {"101", "Alex", "ME"},
                {"102", "Peter", "EE"},
                {"103", "Jenny", "ECE"},
                {"104", "Hailey", "CSE"},
                {"105", "Andrew", "ME"}
        };

        //Headings
        String headings[] = {"Roll No.", "Name", "Stream"};

        //JTable
        JTable table = new JTable(data, headings);

        //Adding table to frame
        frame.add(new JScrollPane(table));

        //Font
        table.setFont(new Font("Serif", Font.PLAIN, 22));

        //Row height
        table.setRowHeight(50);

        //Making frame visible
        frame.setVisible(true);
    }
}