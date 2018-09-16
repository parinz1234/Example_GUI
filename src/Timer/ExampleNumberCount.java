package Timer;

import javax.swing.*;

public class ExampleNumberCount {
    public static void main(String[] args) {
        NumberPanel panel = new NumberPanel();
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
