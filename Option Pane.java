import java.awt.*;
import javax.swing.*;

class OptionPane
{
    public static void main(String args[])
    {
        //JOptionPane.showMessageDialog(null, "Sample message", "Title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Sample message", "Title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Sample message", "Title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Sample message", "Title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Sample message", "Title", JOptionPane.ERROR_MESSAGE);

        //int ans = JOptionPane.showConfirmDialog(null, "Sample message", "Title", JOptionPane.YES_NO_CANCEL_OPTION);
        //System.out.println("Result : " + ans);

        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.println(name);
    }
}