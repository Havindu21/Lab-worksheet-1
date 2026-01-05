package LW_07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class RegistrationForm extends JFrame implements ActionListener {

    final String[] dates = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    final String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    final String[] years = {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010"};

    private String url = "jdbc:mysql://localhost:3306/oop?useSSL=false";
    private String uname = "root";
    private String password = "";


    JTextField nameText, mobileText;
    JRadioButton male, female;
    JComboBox day, month, year;
    JTextArea addressText, outputText;
    JCheckBox terms;
    JButton submit, reset;

    RegistrationForm() {

        setSize(1000, 650);
        setResizable(false);
        setBackground(Color.WHITE);
        Container contentPane = getContentPane();
        contentPane.setLayout(null);

        JLabel title = new JLabel("Registration Form");
        title.setForeground(Color.BLUE);
        title.setSize(230, 75);
        title.setLocation(385, 10);
        title.setFont(new Font("Arial", Font.BOLD, 26));
        contentPane.add(title);

        JLabel name = new JLabel("Name: ");
        name.setForeground(Color.BLUE);
        name.setSize(150, 50);
        name.setLocation(50, 75);
        name.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(name);

        nameText = new JTextField();
        nameText.setForeground(Color.RED);
        nameText.setSize(300, 30);
        nameText.setLocation(200, 85);
        nameText.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(nameText);

        JLabel mobile = new JLabel("Mobile: ");
        mobile.setForeground(Color.BLUE);
        mobile.setSize(150, 50);
        mobile.setLocation(50, 125);
        mobile.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(mobile);

        mobileText = new JTextField();
        mobileText.setForeground(Color.RED);
        mobileText.setSize(300, 30);
        mobileText.setLocation(200, 135);
        mobileText.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(mobileText);

        JLabel gender = new JLabel("Gender: ");
        gender.setForeground(Color.BLUE);
        gender.setSize(150, 50);
        gender.setLocation(50, 175);
        gender.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(gender);

        male = new JRadioButton("Male");
        male.setSelected(true);
        male.setForeground(Color.BLUE);
        male.setSize(150, 30);
        male.setLocation(200, 185);
        male.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(male);

        female = new JRadioButton("Female");
        female.setSelected(false);
        female.setForeground(Color.BLUE);
        female.setSize(150, 30);
        female.setLocation(350, 185);
        female.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(female);

        ButtonGroup genderGrp = new ButtonGroup();
        genderGrp.add(male);
        genderGrp.add(female);

        JLabel dob = new JLabel("DOB: ");
        dob.setForeground(Color.BLUE);
        dob.setSize(150, 50);
        dob.setLocation(50, 225);
        dob.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(dob);

        day = new JComboBox(dates);
        day.setForeground(Color.BLUE);
        day.setSize(90, 30);
        day.setLocation(200, 230);
        day.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(day);

        month = new JComboBox(months);
        month.setForeground(Color.BLUE);
        month.setSize(115, 30);
        month.setLocation(290, 230);
        month.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(month);

        year = new JComboBox(years);
        year.setForeground(Color.BLUE);
        year.setSize(90, 30);
        year.setLocation(405, 230);
        year.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(year);

        JLabel address = new JLabel("Address: ");
        address.setForeground(Color.BLUE);
        address.setSize(150, 50);
        address.setLocation(50, 275);
        address.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(address);

        addressText = new JTextArea();
        addressText.setForeground(Color.RED);
        addressText.setSize(300, 150);
        addressText.setLocation(200, 275);
        addressText.setFont(new Font("Arial", Font.BOLD, 18));
        addressText.setLineWrap(true);
        contentPane.add(addressText);

        outputText = new JTextArea();
        outputText.setForeground(Color.RED);
        outputText.setSize(300, 340);
        outputText.setLocation(600, 85);
        outputText.setFont(new Font("Arial", Font.BOLD, 18));
        outputText.setLineWrap(true);
        contentPane.add(outputText);

        terms = new JCheckBox("Accept terms & conditions.");
        terms.setForeground(Color.BLUE);
        terms.setSize(300, 50);
        terms.setLocation(50, 450);
        terms.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(terms);

        submit = new JButton("Submit");
        submit.setForeground(Color.WHITE);
        submit.setBackground(Color.BLUE);
        submit.setSize(200, 50);
        submit.setLocation(150, 520);
        submit.setFont(new Font("Arial", Font.BOLD, 35));
        submit.addActionListener(this);
        contentPane.add(submit);

        reset = new JButton("Reset");
        reset.setForeground(Color.WHITE);
        reset.setBackground(Color.BLUE);
        reset.setSize(200, 50);
        reset.setLocation(550, 520);
        reset.setFont(new Font("Arial", Font.BOLD, 35));
        reset.addActionListener(this);
        contentPane.add(reset);

        //java Database Connection
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException exception) {
            exception.printStackTrace();
        }

        try {
            Connection connection =
                    DriverManager.getConnection(url, uname, password);
        } catch (SQLException exception) {
            exception.printStackTrace();
        }


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String nameTxt = nameText.getText();
        String mobileTxt = mobileText.getText();
        String genderTxt = "";
        if (male.isSelected()) {
            genderTxt = "Male";
        } else if (female.isSelected()) {
            genderTxt = "Female";
        }
        String dayTxt = day.getSelectedItem().toString();
        String monthTxt = month.getSelectedItem().toString();
        String yearTxt = year.getSelectedItem().toString();
        String addressTxt = addressText.getText();

        JButton selectedBtn = (JButton) e.getSource();
        if (selectedBtn == submit) {
            if (terms.isSelected()) {
                //Print details
                System.out.println("Printing details.");
                outputText.setText(" Name: " + nameTxt + "\n Mobile: " + mobileTxt + "\n Gender: " + genderTxt + "\n Date: " + dayTxt + "-" + monthTxt + "-" + yearTxt + "\n Address: " + addressTxt);

                try {
                    Connection connection =
                            DriverManager.getConnection(url, uname, password);
                    PreparedStatement preparedStmt =
                            connection.prepareStatement("INSERT INTO `user` (`name`, `DOB`,`mobile`, `gender`, `address`) VALUES (?, ?, ?, ?, ?)");


                    preparedStmt.setString(1, nameTxt);
                    preparedStmt.setString(2, mobileTxt);
                    preparedStmt.setString(3, genderTxt);
                    preparedStmt.setString(4, dayTxt+" - "+monthTxt+" - "+yearTxt);
                    preparedStmt.setString(5, addressTxt);
                    preparedStmt.execute();
                    connection.close();
                } catch (SQLException exception) {
                    exception.printStackTrace();
                }

            } else {
                JOptionPane.showMessageDialog(this, "Please accept terms & conditions to submit.");
            }
        } else if (selectedBtn == reset) {
            //reset everything
            System.out.println("Resetting everything");
            nameText.setText("");
            mobileText.setText("");
            male.setSelected(true);
            female.setSelected(false);
            day.setSelectedIndex(0);
            month.setSelectedIndex(0);
            year.setSelectedIndex(0);
            addressText.setText("");
            terms.setSelected(false);
            outputText.setText("");
        }
    }
}

