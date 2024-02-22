import java.awt.*;
import javax.swing.*;

class ScrollPane
{
    public static void main(String args[])
    {
        JFrame jf = new JFrame("Scroll Pane");
        jf.setLayout(new FlowLayout());
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setSize(600,500);
        jf.setLocationRelativeTo(null);

        JTextArea jta=new JTextArea(5,5);
        jta.setFont(new Font("Verdana",Font.BOLD,34));

        JScrollPane jsp=new JScrollPane(jta,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        jta.setLineWrap(true);
        jf.add(jsp);
        jf.setVisible(true);
    }
}