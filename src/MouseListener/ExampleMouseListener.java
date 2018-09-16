package MouseListener;

import javax.swing.*;

public class ExampleMouseListener {
    public static void main(String[] args) {
        MyMouseListener myMouseListener = new MyMouseListener();
        JFrame frame = new JFrame();
        frame.setSize(200,200);
        frame.addMouseListener(myMouseListener); // เป็นการบอกว่า myMouseListener ที่สร้างขึ้น จะได้รับ event ของ mouse ที่เกิดขึ้นใน JFrame นี้
        // อันนี้เป็น addMouseListener นะ
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
