import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setLayout(null);

        frame.setSize(500, 500);
        frame.setTitle("uzdevums nr.6");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBackground(new Color(209, 252, 211));
        frame.add(panel);


        //email label
        JLabel email = new JLabel("Ievadi e-pastu: ");
        email.setBounds(10,40,100,20);
        panel.add(email);

        //email input
        JTextField emailField = new JTextField();
        emailField.setBounds(120, 40, 140,20);
        panel.add(emailField);

        //password label
        JLabel password = new JLabel("Ievadi paroli: ");
        password.setBounds(10,70,100,20);
        panel.add(password);

        //password input
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(120,70,140,20);
        panel.add(passwordField);

        //btn
        JButton btn= new JButton("Reģistrēties");
        btn.setBounds(10, 110,140,20);
        panel.add(btn);

        //onclick
        btn.addActionListener(new ActionListener() {
            @Override
                    //sets display value
            public void actionPerformed(ActionEvent e) {
                String input = emailField.getText();
               String input2 = passwordField.getText();

                String disEmail = input;
                String disPass = input2;

                System.out.println(input);
                System.out.println(input2);

                //display
                JLabel emailDisplay = new JLabel();
                emailDisplay.setBounds(10,250,250,20);
                panel.add(emailDisplay);
                emailDisplay.setText("Tavs e-pasts ir " + disEmail);


                JLabel passwordDisplay = new JLabel();
                passwordDisplay.setBounds(10,280,250,20);
                panel.add(passwordDisplay);
                passwordDisplay.setText("Tava parole ir " + disPass);


            }
        });



        frame.setVisible(true);

    }
}