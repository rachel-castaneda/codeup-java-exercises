public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int myFavoriteNumber = 3;
        System.out.println(myFavoriteNumber);

        String myString = "wassup";
        System.out.println(myString);

        float myNumber = 3.14f;
        System.out.println(myNumber);

//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        int y = 5;
//        System.out.println(++y);
//        System.out.println(y);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";

//        System.out.println(theNumberThree);
//        System.out.println(three);

        Integer theNumberFour = 4;
        Object o = theNumberFour;
        int four = (int) o;

        System.out.println(four);

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(y);

        byte num = 127;
//        System.out.println(num++);
//        System.out.println(++num);

        int num2 = Integer.MAX_VALUE;
        num2++;
        System.out.println(num2++);
        System.out.println(num2);

    }
}

