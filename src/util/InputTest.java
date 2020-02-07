package util;

public class InputTest {

    public static void main (String [] args) {
        Input input = new Input();

//        try {
//            input.getInt("enter an integer: ");
//        } catch (NumberFormatException nfe) {
//            System.out.println("error");
//        }
        input.getDouble(77, 77.77);
//        System.out.println(input.yesNo());
    }

}
