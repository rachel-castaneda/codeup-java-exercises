import java.util.Scanner;
public class Bob {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("ask bob something: ");
        String qForBob = scanner.nextLine();
        if (qForBob.endsWith("?")) {
            System.out.println("Sure.");
        } else if (qForBob.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if (qForBob.equals("")) {
            System.out.println("Fine. Be that way!");
        } else {
            System.out.println("whatever.");
        }
    }
}
