package LW_10.Q2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(openItem);
        fileMenu.add(exitItem);

        frame.setJMenuBar(menuBar);

        exitItem.addActionListener(e-> System.exit(0));

        openItem.setEnabled(false);

        frame.setSize(300,200);
        frame.setVisible(true);

    }
}
