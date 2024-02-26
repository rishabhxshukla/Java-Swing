import java.awt.*;
import javax.swing.*;

class LayeredPane
{
    public static void main(String args[])
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(600, 500);
        frame.setLocation(500, 100);


        //Creating a layered pane
        JLayeredPane layeredPane = new JLayeredPane();

        //Dimensions (same as frame)
        layeredPane.setBounds(0, 0, 600, 500);

        //Adding layered pane to frame
        frame.add(layeredPane);

        /*-----------------------------------------------*/

        //Creating 1st panel
        JPanel panel1 = new JPanel();

        //Dimensions
        panel1.setBounds(100,50, 200, 200);

        //Background color
        panel1.setBackground(Color.RED);

        //Adding panel 1 to layered pane
        layeredPane.add(panel1, Integer.valueOf(1));

        /*-----------------------------------------------*/

        //Creating 2nd panel
        JPanel panel2 = new JPanel();

        //Dimensions
        panel2.setBounds(200,120, 200, 200);

        //Background color
        panel2.setBackground(Color.BLUE);

        //Adding panel 2 to layered pane
        layeredPane.add(panel2, Integer.valueOf(2));

        /*-----------------------------------------------*/

        //Creating 3rd panel
        JPanel panel3 = new JPanel();

        //Dimensions
        panel3.setBounds(300,170, 200, 200);

        //Background color
        panel3.setBackground(Color.GREEN);

        //Adding panel 3 to layered pane
        layeredPane.add(panel3, Integer.valueOf(3));

        //Making frame visible
        frame.setVisible(true);

        /*-----------------------------------------------*/
    }
}