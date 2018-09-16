package Timer;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NumberPanel extends JPanel {
    private int number;

    public NumberPanel() {
        this.number = 1;
        MyActionListener myActionListener = new MyActionListener(); //ประกาศ object ของ inner class
        Timer time = new Timer(1000, myActionListener); // timer เอาไว้ส่ง event ไปยัง listner ในที่นี้จะส่งทุกๆ 1000ms หรือ 1 วินาที
        time.start(); // สั่งให้ timer ทำงาน
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(String.valueOf(number), 70, 70); //วาดตัวเลข
    }

    /* อันนี้เรียกว่า Inner Class ( class ที่อยู่ใน class อีกทีนึง) */
    class MyActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            number++;
            repaint(); //สั่งให้ Jpanel วาด grahpic ใหม่
        }
    }
}
