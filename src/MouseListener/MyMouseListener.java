package MouseListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {
    @Override
    // event mouse ถูกคลิกไปแล้ว
    public void mouseClicked(MouseEvent mouseEvent) {
        System.out.println("mouseClicked x is " + mouseEvent.getX() + " y is " + mouseEvent.getY());
    }

    @Override
    // event กด mouse
    public void mousePressed(MouseEvent mouseEvent) {
        System.out.println("mousePressed x is " + mouseEvent.getX() + " y is " + mouseEvent.getY());
    }

    @Override
    // event ปล่อย mouse หลังจากกด
    public void mouseReleased(MouseEvent mouseEvent) {
        System.out.println("mouseReleased x is " + mouseEvent.getX() + " y is " + mouseEvent.getY());
    }

    @Override
    // event mouse เข้าไปยังกรอบของ JFrame (เพราะในที่นี้เราจะเอาไปใช้กับ JFrame นะ)
    public void mouseEntered(MouseEvent mouseEvent) {
        System.out.println("mouseEntered x is " + mouseEvent.getX() + " y is " + mouseEvent.getY());
    }

    @Override
    // event mouse ออกไปจากกรอบของ JFrame (เพราะในที่นี้เราจะเอาไปใช้กับ JFrame นะ)
    public void mouseExited(MouseEvent mouseEvent) {
        System.out.println("mouseExited x is " + mouseEvent.getX() + " y is " + mouseEvent.getY());
    }
}
