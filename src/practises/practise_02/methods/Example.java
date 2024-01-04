package practises.practise_02.methods;
import java.util.Scanner;
public class Example {
    public static void main(String[] args) {
        // Print what is larger than two numbers entered
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number1 = input.nextInt();
        System.out.print("Enter another number : ");
        int number2 = input.nextInt();


        findTheBiggest(number1,number2);
        findTheBiggest();

    }
    public static void findTheBiggest() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number1 = input.nextInt();
        System.out.print("Enter another number : ");
        int number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println("The "+number1 + " is bigger.");
        } else if (number2 > number1) {
            System.out.println("The "+number2 + " is bigger.");
        } else {
            System.out.println("The numbers entered are equal.");
        }
    }

    private static void findTheBiggest(int number1, int number2) {
        if (number1 > number2) {
            System.out.println("The "+number1 + " is bigger.");
        } else if (number2 > number1) {
            System.out.println("The "+number2 + " is bigger.");
        } else {
            System.out.println("The numbers entered are equal.");
        }
    }
}
