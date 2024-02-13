import java.awt.*;
import javax.swing.*;

class RegistrationForm
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Registration Form");
        frame.setSize(600, 400);
        frame.setLocation(0, 0);

        /* NAME */
        JLabel nameLabel = new JLabel();
        frame.add(nameLabel);
        nameLabel.setText("Full name :");
        nameLabel.setFont(new Font("Arial", Font.ITALIC, 22));
        nameLabel.setBounds(0, 0, 200, 50);

        JTextField nameField = new JTextField();
        frame.add(nameField);
        nameField.setText("name");
        nameField.setFont(new Font("Arial", Font.PLAIN, 20));
        nameField.setBounds(0, 50, 200, 50);

        /* EMAIL */
        JLabel emailLabel = new JLabel();
        frame.add(emailLabel);
        emailLabel.setText("Email :");
        emailLabel.setFont(new Font("Arial", Font.ITALIC, 22));
        emailLabel.setBounds(0, 100, 200, 50);

        JTextField emailField = new JTextField();
        frame.add(emailField);
        emailField.setText("email");
        emailField.setFont(new Font("Arial", Font.PLAIN, 20));
        emailField.setBounds(0, 150, 200, 50);

        /* PASSWORD */
        JLabel passwordLabel = new JLabel();
        frame.add(passwordLabel);
        passwordLabel.setText("Password :");
        passwordLabel.setFont(new Font("Arial", Font.ITALIC, 22));
        passwordLabel.setBounds(0, 200, 200, 50);

        JTextField passwordField = new JTextField();
        frame.add(passwordField);
        passwordField.setText("password");
        passwordField.setFont(new Font("Arial", Font.PLAIN, 20));
        passwordField.setBounds(0, 250, 200, 50);
    }
}