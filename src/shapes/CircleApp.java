package shapes;

import util.Input;
public class CircleApp {

    public static void main (String [] args) {
        Input input = new Input();
        do {
            double radius = input.getDouble("what is the radius of the circle?");
            Circle circle = new Circle(radius);
            System.out.println("area of a circle = " + circle.getArea());
            System.out.println("circumference of a circle = " + circle.getCircumference());
        } while (input.yesNo("do you want to make another? "));
        System.out.println(Circle.getCirclesCreated() + "circles created: ");
    } // main method close

} // class CircleApp close
