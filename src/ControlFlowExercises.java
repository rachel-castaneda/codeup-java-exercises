import java.util.Scanner;

public class ControlFlowExercises {
    public static void  main (String[] args){

//        count to 15 starting at 5
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//        for (int i =5;i <=15; i++ ){
//            System.out.println(i);
//        }
//        System.out.println("=============");

//        count by 2's from 0-100
//        int j = 0;
//        do {
//            System.out.println(j);
//            j+=2;
//        } while (j <= 100);

//          for (int j=0; j<=100; j+=2) {
//                System.out.println(j);
//          }
//        System.out.println("=============");
//
//    count down from 100 by 5's
//        int j = 100;
//        do {
//            System.out.println(j);
//            j-=5;
//        } while (j >= -10);

//          for (int j=100; j>=-10;j-=5){
//              System.out.println(j);
//          }
//        System.out.println("=============");

//      count by squared iterations from 2 - 1,000,000
//        long k = 2;
//        do {
//            System.out.println(k);
//            k*=k;
//        } while (k < 1000000);

//        for (int i=2; i<=1000000; i=(int) Math.pow(i,2)){
//            System.out.println(i);
//        }
//        System.out.println("=============");

// FizzBuzz
//        int i;
//        for (i=1; i<=100; ++i){
//            if (i %15==0)
//                System.out.println(i+" : FizzBuzz");
//            else if ((i%3)==0)
//                System.out.println(i+" : Fizz");
//            else if (i % 5 ==0)
//                System.out.println(i+" : Buzz");
//            else
//                System.out.println(i);
//        }

// table of squares and cubes
//        System.out.println("What number would you like to go up to?");
//        Scanner scanner = new Scanner(System.in);
//        int userNumber = (int) scanner.nextFloat();
//        System.out.println("Here is your table!\n");
//        System.out.println("number | squared | cubed");
//        System.out.println("------ | ------- | -----");
//        for (var i = 1; i <= userNumber; i++){
//            int squared = (int) Math.pow(i, 2);
//            int cubed = (int) Math.pow(i, 3);
//            System.out.println(i + "      | " + squared + "      | " + cubed);
//        }


        // grading system method

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a grade between 0-100: ");
        int grade = scanner.nextInt();
        if (grade > 100) {
            System.out.println("that is not a real grade, you overachiever. smh");
        } else if (grade >= 88 && grade < 100){
            System.out.println("A");
        } else if (grade >=80 && grade <= 87) {
            System.out.println("B");
        } else if (grade >=67 && grade <= 79) {
            System.out.println("C");
        } else if (grade >= 60 && grade <= 66) {
            System.out.println("D");
        } else if (grade >= 0 && grade <=59) {
            System.out.println("F");
        } else {
            System.out.println("are you even in school?");
        }
    }


}
//take integer and sum all values from 1 to integer return long