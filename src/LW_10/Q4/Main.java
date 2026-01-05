package LW_10.Q4;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        fileMenu.add(openItem);
        fileMenu.add(exitItem);

        frame.setJMenuBar(menuBar);

        openItem.setEnabled(false);
        exitItem.addActionListener(e->System.exit(0));


        String[][] data = {
            {"Amal","CS/2022/020", "85"},
            {"Nimali", "ET/2022/014", "77"},
            {"Kamal", "CT/2022/011", "92"}
        };

        String[] columnData = {"Name", "ID", "Marks"};

        JTable table = new JTable(data,columnData);

        table.setDefaultEditor(Object.class,null);

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);

        JPanel panel = new JPanel(new FlowLayout());

        panel.add(new JButton("Save"));
        panel.add(new JButton("Update"));
        panel.add(new JButton("Delete"));

        panel.setBackground(Color.LIGHT_GRAY);

        frame.add(panel,BorderLayout.SOUTH);



        frame.setSize(500,350);
        frame.setVisible(true);
    }
}
