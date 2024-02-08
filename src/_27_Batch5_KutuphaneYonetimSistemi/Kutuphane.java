package _27_Batch5_KutuphaneYonetimSistemi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kutuphane {


    public static void main(String[] args) {
        Map<String, String> kitaplar = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Kitapları Listele");
            System.out.println("2. Kitap Ekle");
            System.out.println("3. Kitap Sil");
            System.out.println("4. Çıkış");
            System.out.print("Seçiminizi yapın (1-4): ");

            int secim = scanner.nextInt();
            scanner.nextLine(); // dummy

            switch (secim) {
                case 1:
                    listeleKitaplar(kitaplar);
                    break;
                case 2:
                    kitapEkle(kitaplar, scanner);
                    break;
                case 3:
                    kitapSil(kitaplar, scanner);
                    break;
                case 4:
                    System.out.println("Programdan çıkılıyor...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Geçersiz seçim! Tekrar deneyin.");
            }
        }
    }

    private static void listeleKitaplar(Map<String, String> kitaplar) {
        if (kitaplar.isEmpty()) {
            System.out.println("Kütüphane boş.");
        } else {
            System.out.println("Kütüphanedeki Kitaplar:");
            for (Map.Entry<String, String> entry : kitaplar.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    private static void kitapEkle(Map<String, String> kitaplar, Scanner scanner) {
        System.out.print("Kitap adını girin: ");
        String kitapAdi = scanner.nextLine();

        System.out.print("Yazar adını girin: ");
        String yazarAdi = scanner.nextLine();

        kitaplar.put(kitapAdi, yazarAdi);
        System.out.println("Kitap eklendi: " + kitapAdi);
    }

    private static void kitapSil(Map<String, String> kitaplar, Scanner scanner) {
        System.out.print("Silmek istediğiniz kitap adını girin: ");
        String kitapAdi = scanner.nextLine();

        if (kitaplar.containsKey(kitapAdi)) {
            kitaplar.remove(kitapAdi);
            System.out.println(kitapAdi + " adlı kitap silindi.");
        } else {
            System.out.println("Bu isimde bir kitap bulunamadı.");
        }
    }
}

