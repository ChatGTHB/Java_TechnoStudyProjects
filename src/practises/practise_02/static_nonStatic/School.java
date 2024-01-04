package practises.practise_02.static_nonStatic;

import java.util.Scanner;

public class School {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number= input.nextInt();
        oddOrEven(number);

        System.out.println();

        Student student=new Student();
        student.printID("Hakan","Alp","98765432");

        System.out.println();

        Student.print();

    }

    public static void oddOrEven(int number){
        if(number%2!=0){
            System.out.println(number+ " is odd number");
        }else{
            System.out.println(number+ " is even number");
        }
    }
}
