package _07_DepremOlcegi;

import java.util.Scanner;

public class DepremOlcegi {

    public static void main(String[] args) {

        // Kullanıcıdan deprem büyüklüğü girişi alınacak
        Scanner scanner = new Scanner(System.in);
        System.out.print("Deprem Büyüklüğünü Girin: ");
        double buyukluk = scanner.nextDouble();

        // Tanımlayıcıyı belirle ve ekrana yazdır
        String tanimlayici;

        if (buyukluk < 2.0) {
            tanimlayici = "Micro - Mikro";
        } else if (buyukluk < 3.0) {
            tanimlayici = "Very minor - Çok küçük";
        } else if (buyukluk < 4.0) {
            tanimlayici = "Minor - Küçük";
        } else if (buyukluk < 5.0) {
            tanimlayici = "Light - Hafif";
        } else if (buyukluk < 6.0) {
            tanimlayici = "Moderate - Orta";
        } else if (buyukluk < 7.0) {
            tanimlayici = "Strong - Ağır";
        } else if (buyukluk < 8.0) {
            tanimlayici = "Major - Büyük";
        } else if (buyukluk < 10.0) {
            tanimlayici = "Great - Çok Büyük";
        } else {
            tanimlayici = "Meteoric - Meteorik";
        }

        System.out.println("Deprem Tanımlayıcı: " + tanimlayici);

        // Scanner kapat
        scanner.close();
    }
}

