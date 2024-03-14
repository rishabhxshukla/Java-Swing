package MouseMotion;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class MouseMotion implements MouseMotionListener
{
    JTextArea textArea;

    public MouseMotion(JTextArea textArea)
    {
        this.textArea = textArea;
    }

    @Override
    public void mouseDragged(MouseEvent e)
    {
        textArea.append("Mouse dragged to: " + e.getX() + ", " + e.getY() + "\n");
    }

    @Override
    public void mouseMoved(MouseEvent e)
    {
        textArea.append("Mouse moved to: " + e.getX() + ", " + e.getY() + "\n");
    }

    public static void main(String args[])
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setTitle("My app");
        frame.setSize(600, 500);
        frame.setLocation(500, 100);


        //Creating a Label
        JLabel label = new JLabel();
        label.setText("Mouse motion!");
        label.setBounds(190, 50, 200, 30);
        label.setFont(new Font("MV Boli", Font.PLAIN, 25));
        frame.add(label);

        //Creating a Text Area
        JTextArea textArea = new JTextArea();
        textArea.setBounds(130, 120, 300, 200);
        textArea.setFont(new Font("MV Boli", Font.PLAIN, 15)); // Corrected this line
        frame.add(textArea);

        //Creating an instance of MouseMotion
        MouseMotion mouseMotionListener = new MouseMotion(textArea);

        //Adding mouse-motion listener on label
        label.addMouseMotionListener(mouseMotionListener);

        //Making frame visible
        frame.setVisible(true);
    }
}