package practises.practise_01;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        // Find the sum, mean and product of the numbers up to an entered number
        // (including the entered number)
        Scanner input=new Scanner(System.in);
        int limit;
        System.out.print("Enter a number : ");
        limit=input.nextInt();

        // Sum
        findTotal(limit);

        // Multiply
        findMultiply(limit);

        // Average
        findAverage(limit);


    }

    private static void findAverage(int limit) {
        int total=0;
        int counter=0;
        for (int i = 1; i <= limit; i++) {
            total+=i;
            counter++;
        }
        System.out.println("Average of numbers = " + total/counter);

    }

    private static void findMultiply(int limit) {
        int total=1;
        for (int i = 1; i <= limit; i++) {
            total*=i;
        }
        System.out.println("Multiplication of numbers = " + total);
    }

    private static void findTotal(int limit) {
        int total=0;
        for (int i = 1; i <= limit; i++) {
            total+=i;
        }
        System.out.println("Total of numbers = " + total);
    }
}
