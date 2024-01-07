package tasks.task7;

import java.util.Scanner;

public class Mevsimler {
    public static void main(String[] args) {

        // Kullanıcıdan girdileri alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ayı girin (1-12): ");
        int ay = scanner.nextInt();

        System.out.print("Günü girin: ");
        int gun = scanner.nextInt();

        // Belirlenen tarih aralıklarına göre mevsimi belirleme
        String mevsim = "";
        if ((ay == 3 && gun >= 20) || (ay == 4 || ay == 5) || (ay == 6 && gun < 21)) {
            mevsim = "İlkbahar";
        } else if ((ay == 6 && gun >= 21) || (ay == 7 || ay == 8) || (ay == 9 && gun < 21)) {
            mevsim = "Yaz";
        } else if ((ay == 9 && gun >= 22) || (ay == 10 || ay == 11) || (ay == 12 && gun < 21)) {
            mevsim = "Sonbahar";
        } else if ((ay == 12 && gun >= 21) || (ay == 1 || ay == 2) || (ay == 3 && gun < 20)) {
            mevsim = "Kış";
        } else {
            mevsim = "Geçersiz tarih";
        }

        // Mevsimi kullanıcıya bildirme
        System.out.println("İçinde bulunduğunuz mevsim: " + mevsim);

        // Scanner'ı kapatma
        scanner.close();
    }
}



