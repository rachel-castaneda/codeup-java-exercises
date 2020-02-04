package shapes;

import org.w3c.dom.css.Rect;

public class Rectangle {
    protected double length;
    protected double width;

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return this.length*2 + this.width*2;
    }
}
