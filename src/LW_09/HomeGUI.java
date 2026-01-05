package LW_09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeGUI extends JFrame {
    public HomeGUI() {
        setTitle("Home Page");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Title
        JLabel title = new JLabel("Welcome to Home Page!", SwingConstants.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        add(title, BorderLayout.NORTH);

        // Image
        ImageIcon icon = new ImageIcon(getClass().getResource("/home1.jpg"));
        Image img = icon.getImage().getScaledInstance(600, 400, Image.SCALE_SMOOTH);
        JLabel imageLabel = new JLabel(new ImageIcon(img));
        imageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(imageLabel, BorderLayout.CENTER);

        // BACK BUTTON
        JButton backButton = new JButton("Back");
        backButton.setFont(new Font("Arial", Font.BOLD, 16));
        backButton.setBackground(Color.red);
        backButton.setForeground(Color.white);
        backButton.setFocusPainted(false);

        add(backButton, BorderLayout.SOUTH);

        // Back Button Action
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SignUp();
                dispose();
            }
        });

        setVisible(true);
    }
}
