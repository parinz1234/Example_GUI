package MouseMotionListener;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyMouseMotionListener implements MouseMotionListener {
    @Override
    // event ลาก mouse
    public void mouseDragged(MouseEvent mouseEvent) {
        System.out.println("mouseDragged x is " + mouseEvent.getX() + " y is " + mouseEvent.getY());
    }

    @Override
    // event mouse เคลื่อนที่
    public void mouseMoved(MouseEvent mouseEvent) {
        System.out.println("mouseMoved x is " + mouseEvent.getX() + " y is " + mouseEvent.getY());
    }
}
