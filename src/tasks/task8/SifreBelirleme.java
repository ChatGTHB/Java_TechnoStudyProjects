package tasks.task8;

import java.util.Scanner;

public class SifreBelirleme {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcı adı ve şifre değişkenleri
        String kullaniciAdi, sifre, sifreTekrar;

        // Kullanıcıdan kullanıcı adı belirleme
        System.out.print("Kullanıcı Adınızı Belirleyin: ");
        kullaniciAdi = scanner.nextLine();

        // Kullanıcıdan şifre belirleme ve doğrulama
        do {
            System.out.print("Şifrenizi Belirleyin: ");
            sifre = scanner.nextLine();

            System.out.print("Şifrenizi Tekrar Girin: ");
            sifreTekrar = scanner.nextLine();

            if (!sifre.equals(sifreTekrar)) {
                System.out.println("Hata: Şifreler uyuşmuyor. Lütfen tekrar deneyin. ");
            }
        } while (!sifre.equals(sifreTekrar));

        // Giriş yapma işlemi
        System.out.println("\n--- Giriş Yap ---");

        int girisHakki = 3;

        while (girisHakki > 0) {
            System.out.print("Kullanıcı Adı: ");
            String girilenKullaniciAdi = scanner.nextLine();

            System.out.print("Şifre: ");
            String girilenSifre = scanner.nextLine();

            if (girilenKullaniciAdi.equals(kullaniciAdi) && girilenSifre.equals(sifre)) {
                System.out.println("Başarılı bir şekilde giriş yaptınız, " + kullaniciAdi + " kullanıcısı olarak hoş geldiniz!");
                break;
            } else {
                girisHakki--;
                if (girisHakki > 0) {
                    System.out.println("Hatalı giriş. Kalan hakkınız: " + girisHakki);
                } else {
                    System.out.println("Üzgünüm, 3 kez üst üste yanlış giriş yaptınız.");
                }
            }
        }
        // Scanner'ı kapat
        scanner.close();
    }
}

