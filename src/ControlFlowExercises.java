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


        for (int i=2; i<=1000000; i=(int) Math.pow(i,2)){
            System.out.println(i);
        }
//        for(long l =2; l <1000000; l++){
//            if (l >= 1000000){
//                break;
//            } else {
//                System.out.println(l);
//                l*=l;
//            }
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

//        System.out.println("enter an integer to start at: ");
//        System.out.println("enter an integer to end at: ");
//        System.out.println("Here's your table: ");
//        System.out.println("   number   |   squared   |   cubed   ");
//        System.out.println("   ------   |   -------   |   -----   ");


    }
}
