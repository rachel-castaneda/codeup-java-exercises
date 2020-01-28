public class Scanner {
    public static void  main (String[] args) {

        java.util.Scanner scanner = new java.util.Scanner(System.in);

//        System.out.print("Enter an integer: ");
//        Integer userInput = scanner.nextInt();
//        System.out.print("Enter something: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput1 + " " + userInput2 + " " + userInput3 +"\" <--");

        System.out.print("Enter a sentence: ");
        String userInput = scanner.next();

        System.out.println("You entered: --> \""+ userInput +"\" <--");
    }
}
