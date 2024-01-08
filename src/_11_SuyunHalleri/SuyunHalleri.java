package _11_SuyunHalleri;

import java.util.Scanner;

public class SuyunHalleri {
    public static void main(String[] args) {

        // Değişkeni tanımlama
        int suSicakligi;

        // Kullanıcıdan girdiyi alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Su sıcaklığını girin: ");
        suSicakligi = scanner.nextInt();

        // Suyun halini belirleme
        if (suSicakligi < 0) {
            System.out.println("Su katı haldedir.");
        } else if (suSicakligi <= 100) {
            System.out.println("Su sıvı haldedir.");
        } else {
            System.out.println("Su gaz halindedir.");
        }

        // Scanner'ı kapatma
        scanner.close();
    }
}

