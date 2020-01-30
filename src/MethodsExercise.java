import java.util.Scanner;
import java.lang.Math;
public class MethodsExercise {
    public static void main (String [] args){
//        System.out.println(add(1,3));       //addition
//        System.out.println(subtract(7,3));  //subtraction
//        System.out.println(multiply(6,3));  //multiplication
//        System.out.println(divide(21,7));   //division
//        System.out.println(modulus(21,7));  //remainder
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        System.out.println(diceRolling(3));
//        System.out.print("enter a number: ");
//        factorial();
        diceRolling();
    }

    // 1.a method to add 2 numbers
    public static int add (int num1, int num2){
        return num1 + num2;
    }
    // 1.b method to subtract
    public static int subtract (int num1, int num2){
        return num1 - num2;
    }
    // 1.c method to multiply 2 numbers
    public static int multiply (int num1, int num2){
        return num1 * num2;
    }
    // 1.d method to divide 2 numbers
    public static int divide (int num1, int num2){
        return num1/num2;
    }
    // 1.e method to find the remainder of 2 numbers
    public static int modulus (int num1, int num2){
        return num1%num2;
    }
    // 2. method to receive an integer between 1-10
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
    // 3. method to find the factorial of a number
    public static void factorial () {
        int base = getInteger(1,10);
        long fact = 1;
        String output = "! = 1";
        System.out.printf("1%s\n", output);
        for (int i =2; i <= base; i++) {
            fact *= i;
            output += " x " + i;
            System.out.printf("%d%s = %d\n", i, output, fact);
        }
    }

    // 4. method to create an app that simulates dice rolling
    public static int diceRolling () {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("enter the number of sides for your pair of dice: ");
            int sides = scanner.nextInt();
            int dice1 = (int) (Math.random() * sides + 1);
            int dice2 = (int) (Math.random() * sides + 1);
            System.out.println("here is your roll: " + add(dice1, dice2));
            System.out.println("would you like to roll again? ");
            String answer = scanner.next();
            if (answer.toLowerCase().contains("n")) return (int) add(dice1, dice2);
        }
    }

}
