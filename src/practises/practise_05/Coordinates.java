package practises.practise_05;

import java.util.Scanner;

public class Coordinates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number for \"x\" that inside \"P(x,y)\" :");
        int x = input.nextInt();
        System.out.print("Enter a number for \"y\" that inside \"P(x,y)\" :");
        int y = input.nextInt();


        if ((x > -2 && x < 8) && (y > 1 && y < 4)) {
            System.out.println("İçinde");
        } else if (((y < 4 && y > 1) && ((x == -2) || (x == 8))) || ((x < 8 && x > -2) && ((y == 1) || (y == 4)))) {
            System.out.println("Üstünde");
        } else {
            System.out.println("Dışında");
        }
    }
}


