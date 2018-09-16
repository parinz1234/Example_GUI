package MouseMotionListener;

import javax.swing.*;

public class ExampleMouseMotionListener {
    public static void main(String[] args) {
        MyMouseMotionListener myMouseMotionListener = new MyMouseMotionListener();
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        frame.addMouseMotionListener(myMouseMotionListener); // เป็นการบอกว่า myMouseMotionListener ที่สร้างขึ้น จะได้รับ event ของ mouse ที่เกิดขึ้นใน JFrame นี้
        // อันนี้เป็น addMouseMotionListener นะ
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
