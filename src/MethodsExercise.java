import java.util.Scanner;
public class MethodsExercise {
    public static void main (String [] args){
//        System.out.println(add(1,3));       //addition
//        System.out.println(subtract(7,3));  //subtraction
//        System.out.println(multiply(6,3));  //multiplication
//        System.out.println(divide(21,7));   //division
//        System.out.println(modulus(21,7));  //remainder
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
        System.out.println(factorial(7));
    }
    public static int add (int num1, int num2){
        return num1 + num2;
    }
    public static int subtract (int num1, int num2){
        return num1 - num2;
    }
    public static int multiply (int num1, int num2){
        return num1 * num2;
    }
    public static int divide (int num1, int num2){
        return num1/num2;
    }
    public static int modulus (int num1, int num2){
        return num1%num2;
    }
    public static int getInteger (int min, int max){
       Scanner scanner = new Scanner(System.in);
       int userInput = scanner.nextInt();
       if (userInput >10 || userInput <1) {
           System.out.print("Enter an integer please: ");
           getInteger(min, max);
       }
       System.out.println("thank you for your number ;)");
       return userInput;
    }
    public static int factorial (int num) {
        System.out.println("enter a number between 1-10: ");
        return num;
    }
}
