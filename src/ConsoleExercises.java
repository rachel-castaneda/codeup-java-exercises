import java.util.Scanner;
public class ConsoleExercises {
    public static void main (String[] args) {

        double pi = 3.14159;
        System.out.print("the value of pi is approximately ");
        System.out.format("%.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
            int i =0;
            while (i != -1) {
                System.out.print("enter an integer: ");
                i = scanner.nextInt();
                System.out.println("/nThe number is " + i + "");
            }

            System.out.print("enter three words: ");
            String word1, word2, word3;
            word1 = scanner.next();
            word2 = scanner.next();
            word3 = scanner.next();
            System.out.printf("\n the words are \"%s\", \"%s\", and \"%s\".\n", word1, word2, word3);
            scanner.nextLine();

            System.out.print("\nEnter a sentence: ");
            scanner.useDelimiter("\n");
            String sentence = scanner.next();
            scanner.nextLine();
            System.out.printf("\nThe sentence is \"%s\"\n", sentence);

//            Scanner scan = new Scanner (System.in);
//            scanner.useDelimiter("\n");
//            System.out.print("\nEnter the width: ");
//            String sWidth = scan.nextLine();
//            double width = Double.parseDouble(sWidth);
//            System.out.print("Enter the Length: ");
//            String sLength = scan.nextLine();
//            double length = Double.parseDouble(sLength);
//            System.out.print(" the dimensions are %f by %f. the perimeter of the area is %f and the area is %f.\n", length, width 2*(length+width), length*width);

            scanner.useDelimiter("\n");
            System.out.print("\n hey! yo, enter the width: ");
            double width = scanner.nextFloat();
            System.out.print("enter the length: ");
            double length = scanner.nextFloat();
            System.out.printf("the dimensions are %f by %f. the perimeter is %f and the area is %f.\n", length, width, 2*(length+width), (length*width));

    }
}
