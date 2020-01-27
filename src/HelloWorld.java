public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

//        data types
        byte num1 = 127;       //very short integers from -128 to 127
        short num2 = num1;    //short integers from -32,768 to 32,767 (2 bytes)
        int num3 = num2;     //integers from -2,147,483,648 to 2,147,483,647 (4 bytes)
        long num4 = num3;   // long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (8 bytes)

        float num5 = 3.333f;    // single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
        // (4 bytes)
        double num6 = num5;    //double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
        // (8 bytes)

        boolean yesNo = true;   // true or false value
        yesNo = false;

        char initial;   //a single Unicode character that’s stored in two bytes
        initial = 'D';

        System.out.println(num4);
        System.out.println(num6);
        System.out.println(yesNo);
        System.out.println(initial);
    }
}


