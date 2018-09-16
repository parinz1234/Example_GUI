import javax.swing.*;

public class ExampleJFrame {
    public static void main(String[] args) {
        JFrame frame = new JFrame(); // การสร้างตัวแปร Object ของ JFrame ชื่อตัวแปรว่า frame
        frame.setTitle("Example Frame"); // set ชื่อให้กับ Jframe
        frame.setSize(200, 200); // set ขนาดของ Jframe กว้าง , สูง
        frame.setVisible(true); // set ให้ Jframe แสดงผล
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set ว่าเมื่อปิดหน้าต่าง jframe ให้โปรแกรมหยุดทำงาน
    }
    /* **** ปล ที่เห็นพี่สร้าง public static void main ใน class นี้เลยเพราะพี่ขี้เกียจสร้าง class test แยก */
}
