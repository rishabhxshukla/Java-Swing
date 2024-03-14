import java.awt.*;
import javax.swing.*;

class MyCanvas extends Canvas
{
    @Override
    public void paint(Graphics g)
    {
        super.paint(g);

        //Rectangle
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);

        //Oval
        g.setColor(Color.BLUE);
        g.fillOval(200, 200, 100, 100);
    }

    public static void main(String args[])
    {
        /* Basic JFrame */
        JFrame frame = new JFrame();
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My app");
        frame.setSize(600, 500);
        frame.setLocation(500, 100);


        //Creating a canvas
        MyCanvas canvas = new MyCanvas();
        canvas.setBounds(40, 30, 500, 400);
        canvas.setBackground(Color.WHITE);

        //Adding canvas to frame
        frame.add(canvas);

        //Making frame visible
        frame.setVisible(true);
    }
}