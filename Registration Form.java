import java.awt.*;
import javax.swing.*;

class RegistrationForm
{
    public static void main(String args[])
    {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Registration Form");
        frame.setSize(500, 450);
        frame.setLocation(500, 100);

        /* NAME */
        JLabel nameLabel = new JLabel();
        frame.add(nameLabel);
        nameLabel.setText("Full name :");
        nameLabel.setFont(new Font("Arial", Font.ITALIC, 22));
        nameLabel.setBounds(20, 0, 200, 50);

        JTextField name = new JTextField();
        frame.add(name);
        name.setText("name");
        name.setFont(new Font("Arial", Font.PLAIN, 20));
        name.setBounds(20, 50, 200, 50);


        /* EMAIL */
        JLabel emailLabel = new JLabel();
        frame.add(emailLabel);
        emailLabel.setText("Email :");
        emailLabel.setFont(new Font("Arial", Font.ITALIC, 22));
        emailLabel.setBounds(20, 100, 200, 50);

        JTextField email = new JTextField();
        frame.add(email);
        email.setText("email");
        email.setFont(new Font("Arial", Font.PLAIN, 20));
        email.setBounds(20, 150, 200, 50);


        /* PASSWORD */
        JLabel passwordLabel = new JLabel();
        frame.add(passwordLabel);
        passwordLabel.setText("Password :");
        passwordLabel.setFont(new Font("Arial", Font.ITALIC, 22));
        passwordLabel.setBounds(20, 200, 200, 50);

        JTextField password = new JTextField();
        frame.add(password);
        password.setText("password");
        password.setFont(new Font("Arial", Font.PLAIN, 20));
        password.setBounds(20, 250, 200, 50);


        /* GENDER */
        JLabel genderLabel = new JLabel();
        frame.add(genderLabel);
        genderLabel.setText("Gender :");
        genderLabel.setFont(new Font("Arial", Font.ITALIC, 22));
        genderLabel.setBounds(20, 300, 200, 50);

        JRadioButton male = new JRadioButton();
        JRadioButton female = new JRadioButton();
        frame.add(male);
        frame.add(female);
        male.setBounds(130, 300, 80, 50);
        female.setBounds(210, 300, 100, 50);
        male.setText("Male");
        female.setText("Female");
        male.setFont(new Font("Arial", Font.PLAIN, 20));
        female.setFont(new Font("Arial", Font.PLAIN, 20));
        ButtonGroup gender = new ButtonGroup();
        gender.add(male);
        gender.add(female);
    }
}