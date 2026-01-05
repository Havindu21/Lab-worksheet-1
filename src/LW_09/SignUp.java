package LW_09;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class SignUp extends JFrame implements ActionListener {

    private final String[] date = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    private final String[] month = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    private final String[] year = {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015"};
    private final JTextField nameField;
    private final JTextField emailField;
    private final JTextField SIEMField;
    private final JPasswordField PWField;
    private final JPasswordField SIPWField;
    private final JComboBox dateBox;
    private final JComboBox monthBox;
    private final JComboBox yearBox;
    private final JRadioButton maleButton;
    private final JRadioButton femaleButton;
    private final JButton SUButton;
    private final JButton SIButton;
    private final JCheckBox robot;

    private String url = "jdbc:mysql://localhost:3306/oop?useSSL=false";
    private String uname = "root";
    private String dbpassword = "";

    public SignUp() {
        setTitle("Sign In");
        setBounds(570, 140, 400, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        Container container = getContentPane();
        container.setLayout(null);
        container.setBackground(Color.white);

        JLabel SUtitle = new JLabel("Sign Up");
        SUtitle.setFont(new Font("Arial", Font.BOLD, 20));
        SUtitle.setForeground(Color.blue);
        SUtitle.setSize(400, 30);
        SUtitle.setLocation(165, 10);
        container.add(SUtitle);

        JLabel nameLabel = new JLabel("Name");
        nameLabel.setFont(new Font("Arial", Font.BOLD, 16));
        nameLabel.setForeground(Color.black);
        nameLabel.setSize(100, 30);
        nameLabel.setLocation(20, 55);
        container.add(nameLabel);

        nameField = new JTextField();
        nameField.setFont(new Font("Arial", Font.PLAIN, 16));
        nameField.setSize(200, 30);
        nameField.setLocation(150, 55);
        container.add(nameField);

        JLabel emaiLabel = new JLabel("Email");
        emaiLabel.setFont(new Font("Arial", Font.BOLD, 16));
        emaiLabel.setForeground(Color.black);
        emaiLabel.setSize(100, 30);
        emaiLabel.setLocation(20, 100);
        container.add(emaiLabel);

        emailField = new JTextField();
        emailField.setFont(new Font("Arial", Font.PLAIN, 16));
        emailField.setSize(200, 30);
        emailField.setLocation(150, 100);
        container.add(emailField);

        JLabel genderLabel = new JLabel("Gender");
        genderLabel.setFont(new Font("Arial", Font.BOLD, 16));
        genderLabel.setForeground(Color.black);
        genderLabel.setSize(100, 30);
        genderLabel.setLocation(20, 145);
        container.add(genderLabel);

        maleButton = new JRadioButton("Male");
        maleButton.setFont(new Font("Arial", Font.BOLD, 16));
        maleButton.setBackground(Color.white);
        maleButton.setSelected(true);
        maleButton.setSize(75, 20);
        maleButton.setLocation(150, 150);
        container.add(maleButton);

        femaleButton = new JRadioButton("Female");
        femaleButton.setFont(new Font("Arial", Font.BOLD, 16));
        femaleButton.setBackground(Color.white);
        femaleButton.setSelected(true);
        femaleButton.setSize(85, 20);
        femaleButton.setLocation(250, 150);
        container.add(femaleButton);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        JLabel birthDayLabel = new JLabel("Birthday");
        birthDayLabel.setFont(new Font("Arial", Font.BOLD, 16));
        birthDayLabel.setForeground(Color.black);
        birthDayLabel.setSize(100, 30);
        birthDayLabel.setLocation(20, 190);
        container.add(birthDayLabel);

        dateBox = new JComboBox(date);
        dateBox.setFont(new Font("Arial", Font.BOLD, 16));
        dateBox.setSize(50, 25);
        dateBox.setLocation(150, 190);
        container.add(dateBox);

        monthBox = new JComboBox(month);
        monthBox.setFont(new Font("Arial", Font.BOLD, 16));
        monthBox.setSize(100, 25);
        monthBox.setLocation(200, 190);
        container.add(monthBox);

        yearBox = new JComboBox(year);
        yearBox.setFont(new Font("Arial", Font.BOLD, 16));
        yearBox.setSize(60, 25);
        yearBox.setLocation(300, 190);
        container.add(yearBox);

        JLabel PWLabel = new JLabel("Password");
        PWLabel.setFont(new Font("Arial", Font.BOLD, 16));
        PWLabel.setForeground(Color.black);
        PWLabel.setSize(100, 30);
        PWLabel.setLocation(20, 235);
        container.add(PWLabel);

        PWField = new JPasswordField();
        PWField.setFont(new Font("Arial", Font.PLAIN, 16));
        PWField.setSize(200, 30);
        PWField.setLocation(150, 235);
        container.add(PWField);

        robot = new JCheckBox("I am not a robot.");
        robot.setFont(new Font("Arial", Font.PLAIN, 16));
        robot.setSize(250, 30);
        robot.setLocation(15, 280);
        robot.setForeground(Color.black);
        robot.setBackground(Color.white);
        container.add(robot);

        SUButton = new JButton("Sign Up");
        SUButton.setFont(new Font("Arial", Font.BOLD, 16));
        SUButton.setForeground(Color.white);
        SUButton.setBackground(Color.blue);
        SUButton.setSize(350, 30);
        SUButton.setLocation(20, 325);
        SUButton.addActionListener(this);
        container.add(SUButton);

        JLabel SItitle = new JLabel("Sign In");
        SItitle.setFont(new Font("Arial", Font.BOLD, 20));
        SItitle.setForeground(Color.blue);
        SItitle.setSize(400, 30);
        SItitle.setLocation(165, 370);
        container.add(SItitle);

        JLabel SIEMLabel = new JLabel("Email");
        SIEMLabel.setFont(new Font("Arial", Font.BOLD, 16));
        SIEMLabel.setForeground(Color.black);
        SIEMLabel.setSize(100, 30);
        SIEMLabel.setLocation(20, 415);
        container.add(SIEMLabel);

        SIEMField = new JTextField();
        SIEMField.setFont(new Font("Arial", Font.PLAIN, 16));
        SIEMField.setSize(200, 30);
        SIEMField.setLocation(150, 415);
        container.add(SIEMField);

        JLabel SIPWLabel = new JLabel("Password");
        SIPWLabel.setFont(new Font("Arial", Font.BOLD, 16));
        SIPWLabel.setForeground(Color.black);
        SIPWLabel.setSize(100, 30);
        SIPWLabel.setLocation(20, 460);
        container.add(SIPWLabel);

        SIPWField = new JPasswordField();
        SIPWField.setFont(new Font("Arial", Font.PLAIN, 16));
        SIPWField.setSize(200, 30);
        SIPWField.setLocation(150, 460);
        container.add(SIPWField);

        SIButton = new JButton("Sign In");
        SIButton.setFont(new Font("Arial", Font.BOLD, 16));
        SIButton.setForeground(Color.white);
        SIButton.setBackground(Color.blue);
        SIButton.setSize(350, 30);
        SIButton.setLocation(20, 505);
        SIButton.addActionListener(this);
        container.add(SIButton);

        //java Database Connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }

        try {
            Connection connection =
                    DriverManager.getConnection(url, uname, dbpassword);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == SUButton) {
            if (robot.isSelected()) {
                String nameq = nameField.getText();
                String emailq = emailField.getText();
                String genderq = "";
                if (maleButton.isSelected()) {
                    genderq = "Male";
                } else if (femaleButton.isSelected()) {
                    genderq = "Female";
                }

                String dayq = dateBox.getSelectedItem().toString();
                String monthq = monthBox.getSelectedItem().toString();
                String yearq = yearBox.getSelectedItem().toString();
                String dobq = dayq + "-" + monthq + "-" + yearq;

                String passwordq = PWField.getText();

                JOptionPane.showMessageDialog(null,
                        "Name: " + nameq +
                                "\nEmail: " + emailq +
                                "\nGender: " + genderq +
                                "\nDOB: " + dobq +
                                "\nPassword: " + passwordq);



            try {
                Connection con = DriverManager.getConnection(url, uname, dbpassword);
                PreparedStatement pst = con.prepareStatement(
                        "INSERT INTO `signup` (`name`, `email`, `gender`, `birthday`, `password`) VALUES (?, ?, ?, ?, ?)");
                pst.setString(1, nameq);
                pst.setString(2, emailq);
                pst.setString(3, genderq);
                pst.setString(4, dobq);
                pst.setString(5, passwordq);
                pst.execute();
                con.close();



            } catch (SQLException ex) {
                ex.printStackTrace();
            }

            } else {
                JOptionPane.showMessageDialog(null, "Please confirm that you are not a robot.");
            }

        } else if (e.getSource() == SIButton) {
            String email = SIEMField.getText();
            String password = SIPWField.getText();

            try {
                Connection con = DriverManager.getConnection(url, uname,dbpassword);

                PreparedStatement pst = con.prepareStatement(
                        "SELECT * FROM `signup` WHERE `email` = ? AND `password` = ?"
                );

                pst.setString(1, email);
                pst.setString(2, password);

                ResultSet rs = pst.executeQuery();

                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Login Successful!");

                    new HomeGUI();
                    this.dispose();

                } else {

                    JOptionPane.showMessageDialog(null, "Incorrect email or password.");
                }

                con.close();

            } catch (SQLException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database error.");
            }

        }
    }
}