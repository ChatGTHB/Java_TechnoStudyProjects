package _26_Batch5_SifreYoneticisi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PasswordManager {

    public static void main(String[] args) {
        Map<String, Map<String, String>> passwords = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Şifre Ekle");
            System.out.println("2. Şifre Göster");
            System.out.println("3. Çıkış");
            System.out.print("Seçiminizi yapın (1, 2 veya 3): ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Dummy read to consume the newline

            switch (choice) {
                case 1:
                    // Şifre Ekle
                    System.out.print("Hesap Adını Girin: ");
                    String hesapAdiEkle = scanner.nextLine();
                    System.out.print("Kullanıcı Adını Girin: ");
                    String kullaniciAdiEkle = scanner.nextLine();
                    System.out.print("Şifreyi Girin: ");
                    String sifreEkle = scanner.nextLine();

                    sifreEkle(passwords, hesapAdiEkle, kullaniciAdiEkle, sifreEkle);
                    System.out.println("Şifre başarıyla eklendi.\n");
                    break;

                case 2:
                    // Şifre Göster
                    System.out.print("Hesap Adını Girin: ");
                    String hesapAdiGoster = scanner.nextLine().toLowerCase();

                    if (passwords.containsKey(hesapAdiGoster)) {
                        Map<String, String> hesapBilgileri = passwords.get(hesapAdiGoster);
                        String kullaniciAdi = hesapBilgileri.get("username");
                        String sifre = hesapBilgileri.get("password");

                        // Kullanıcı Adı ve Şifrenin Yazdırılması
                        System.out.println("Hesap Bilgileri:");
                        System.out.println("Kullanıcı Adı: " + kullaniciAdi);
                        System.out.println("Şifre: " + sifre + "\n");
                    } else {
                        System.out.println("Belirtilen hesap adına sahip bir kayıt bulunamadı.\n");
                    }
                    break;

                case 3:
                    // Çıkış
                    System.out.println("Programdan çıkılıyor...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Geçersiz seçim. Lütfen 1, 2 veya 3 girin.\n");
            }
        }
    }

    private static void sifreEkle(Map<String, Map<String, String>> passwords, String hesapAdi, String kullaniciAdi, String sifre) {
        Map<String, String> hesapBilgileri = new HashMap<>();
        hesapBilgileri.put("username", kullaniciAdi);
        hesapBilgileri.put("password", sifre);
        passwords.put(hesapAdi.toLowerCase(), hesapBilgileri);
    }
}


