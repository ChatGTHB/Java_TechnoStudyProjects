package _01_Batch3_BasicJavaProject;

import java.util.Scanner;

public class Project_01_Final {
    public static void main(String[] args) {

        Scanner input = new Scanner((System.in));

        System.out.print("Lütfen adınızı giriniz : ");
        String isim = input.nextLine();
        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1);

        System.out.print(isim + "; hoşgeldiniz. Soyisminizi girer misiniz? :");
        String soyisim = input.nextLine();

        isim = isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase();
        soyisim = soyisim.substring(0, 1).toUpperCase() + soyisim.substring(1).toLowerCase();
        System.out.println(isim + " " + soyisim);

        char onay;
        char girilen = 'Y';

        System.out.print(isim + " " + soyisim + ", isminiz doğru ise devam etmek için \"Y\" tuşuna basınız : ");
        onay = input.nextLine().toUpperCase().charAt(0);

        if (onay != girilen) {
            while (onay != girilen) {
                System.out.print("Tercihinizi dogru yapmadiniz. Lutfen tekrar deneyin :");
                onay = input.nextLine().toUpperCase().charAt(0);
            }
        }
        System.out.println("İsminiz ve Soyisminiz başarılı bir şekilde sisteme kaydedilmiştir.");

        System.out.print("Lütfen kullanıcı adınızı belirleyiniz : ");
        String kullaniciAdi = input.nextLine();

        System.out.print("Lütfen şifrenizi belirleyiniz : ");
        String sifre = input.nextLine();

        System.out.print("Lütfen şifrenizi tekrar giriniz : ");
        String sifreTekrar = input.nextLine();

        System.out.println(sifre.equals(sifreTekrar) ? "Tebrikler! " + kullaniciAdi + " kullanıcı adıyla sisteme kaydoldunuz." : "Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
    }
}
