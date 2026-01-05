package LW_10.Q3;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new FlowLayout());

        panel.add(new Button("Save"));
        panel.add(new Button("update"));
        panel.add(new Button("Delete"));

        panel.setBackground(Color.LIGHT_GRAY);

        frame.add(panel);

        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}
