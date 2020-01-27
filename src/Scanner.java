public class Scanner {
    public static void  main (String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

    }
}
