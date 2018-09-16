import javax.swing.*;
import java.awt.*;

public class ExampleJPanel2 extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        ImageIcon icon = new ImageIcon("src/cony.png"); //ประกาศ Object ของ ImageIcon ข้า่งในใส่ path(ที่อยู่) ของรูป
        // วาดได้ 2 แบบ
        // 1
//        g.drawImage(icon.getImage(), 0, 0, null);
        // 2
//        icon.paintIcon(null, g, 0, 0);
    }

    public static void main(String[] args) {
        ExampleJPanel2 panel = new ExampleJPanel2();
        JFrame frame = new JFrame();
        frame.setTitle("Example Frame");
        frame.setSize(400, 400);
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /* **** ปล ที่เห็นพี่สร้าง public static void main ใน class นี้เลยเพราะพี่ขี้เกียจสร้าง class test แยก */
}
