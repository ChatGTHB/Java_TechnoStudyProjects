package practises.practise_03;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        int number=5;

        int studentGrade;
        int studentGrade1;
        int studentGrade2;
        //...
        //...
        //...
        int studentGrade9;

        int[]studentsGrade=new int[10];
        studentsGrade[0]=73;
        studentsGrade[1]=81;
        studentsGrade[2]=39;
        //...
        //...
        //...
        //...
        studentsGrade[9]=98;

        for (int i = 0; i < 10; i++) {
            System.out.println(studentsGrade[i]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter "+(i+1)+ ". student's grade : ");
            Scanner input=new Scanner(System.in);
            studentsGrade[i]= input.nextInt();
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+". student's grade = "+studentsGrade[i]);
        }




    }
}
