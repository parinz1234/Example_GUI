import javax.swing.*;

public class ExampleJFrameExtends extends JFrame {
    public ExampleJFrameExtends() {
        setTitle("Example JFrame 2");
        setSize(200, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        ExampleJFrameExtends frame = new ExampleJFrameExtends();
    }
    /* **** ปล ที่เห็นพี่สร้าง public static void main ใน class นี้เลยเพราะพี่ขี้เกียจสร้าง class test แยก */
}
