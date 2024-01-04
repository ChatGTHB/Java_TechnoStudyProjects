package practises.practise_01;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        System.out.println("*****For Loop*****");
        // Find the sum of the 10 numbers entered.

        Scanner input = new Scanner(System.in);

        int num = 0;
        int total = 0;

//        for (int i = 0; i < 10; i++) {
//            System.out.print("Enter a number : ");
//            num = input.nextInt();
//            total += num;
//        }
//        System.out.println("Total of Numbers = " + total);

        System.out.println("*****While Loop*****");
        // Find the sum of the 10 numbers entered.
        int counter=0;
        while(counter<10){
            System.out.print("Enter a number : ");
            num = input.nextInt();
            total += num;
            counter++;
        }
        System.out.println("Total of Numbers= " + total);


        System.out.println("*****Do While Loop*****");
        // Add the numbers entered until they add up to 100.

//        do {
//            System.out.print("Enter a number : ");
//            num = input.nextInt();
//            total += num;
//        }
//        while (total <= 100);
//
//        System.out.println("Total of Numbers = " + total);
    }
}
