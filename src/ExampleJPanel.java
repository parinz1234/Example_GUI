import javax.swing.*;
import java.awt.*;

public class ExampleJPanel extends JPanel {
    @Override
    /* เป็น method ที่เอาไว้วาด grahpic ต่างๆ , คำพูด, รูปภาพ, รูปร่าง 2d 3d */
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("I Love Java", 70, 70); // วาด string "I love JAVA" ลงบนตำแหน่งที่ x = 70, y =70
        g.drawRect(50, 50, 100, 30); //วาดสี่เหลี่ยม ลงบนตำแหน่ง x = 50, y = 50, กว้าง = 100, สูง =  30
    }

    public static void main(String[] args) {
        ExampleJPanel panel = new ExampleJPanel();
        JFrame frame = new JFrame();
        frame.setTitle("Example Frame");
        frame.setSize(200, 200);
        frame.add(panel); // ทำการเพิ่ม JPanel ที่เราสร้างเข้าไปใน JFrame เพราะว่า Jpanel ไม่สามารถแสดงผลขึ้นมาเองได้ต้องเอาไปไว้ใน container ซึ่งที่นี้คือ JFrame
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    /* **** ปล ที่เห็นพี่สร้าง public static void main ใน class นี้เลยเพราะพี่ขี้เกียจสร้าง class test แยก */
}
