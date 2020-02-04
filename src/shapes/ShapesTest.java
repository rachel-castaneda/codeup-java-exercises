package shapes;

import org.w3c.dom.css.Rect;

public class ShapesTest {
    public static void main (String [] args) {
        Rectangle box1 = new Rectangle(5,4);
        System.out.println(box1.getPerimeter());
        System.out.println(box1.getArea());

        Rectangle box2 = new Rectangle(5,5);
        System.out.println(box2.getPerimeter());
        System.out.println(box2.getArea());
    }
}
