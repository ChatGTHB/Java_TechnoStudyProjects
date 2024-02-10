package _08_Batch5_MoneyPersonAddition;

import java.util.Scanner;

public class ParaKisiEsleme {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Kullanıcıdan bölge veya ülke seçimi
        System.out.println("Lütfen bir bölge veya ülke seçin: Amerika, Avrupa, Türkiye");
        String secilenBolge = scanner.nextLine();

        // Kullanıcıdan bir para birimi seçimi (tutar) alın
        System.out.println("Lütfen bir para birimi değeri girin:");
        int girilenTutar = scanner.nextInt();

        // Eser veya kişiyi bulma işlemi
        String eserVeyaKisi = bulEserVeyaKisi(secilenBolge, girilenTutar);

        // Eğer bölge veya ülke seçimi geçerli değilse veya para birimi tanınmıyorsa, uygun bir hata mesajı gösterin
        if (eserVeyaKisi.equals("Geçersiz bölge") || eserVeyaKisi.equals("Geçersiz para birimi")) {
            System.out.println(eserVeyaKisi);
        } else {
            // Sonucu konsolda görüntüle
            System.out.println("Seçilen bölge/ülke: " + secilenBolge);
            System.out.println("Seçilen para birimi değeri: " + girilenTutar);
            System.out.println("Para üzerindeki kişi veya eser: " + eserVeyaKisi);
        }
    }

    // Eser veya kişiyi bulma metodu
    public static String bulEserVeyaKisi(String bolge, int tutar) {
        if (tutar < 1) {
            return "Geçersiz para birimi";
        }

        // Amerika için
        if (bolge.equalsIgnoreCase("amerika")) {
            if (tutar == 1) return "George Washington";
            else if (tutar == 2) return "Thomas Jefferson";
            else if (tutar == 5) return "Abraham Lincoln";
            else if (tutar == 10) return "Alexander Hamilton";
            else if (tutar == 20) return "Andrew Jackson";
            else if (tutar == 50) return "Ulysses S. Grant";
            else if (tutar == 100) return "Benjamin Franklin";
            else return "Geçersiz para birimi";
        }

        // Avrupa için
        else if (bolge.equalsIgnoreCase("avrupa")) {
            if (tutar == 5) return "Ponte Vecchio Köprüsü, Floransa, İtalya";
            else if (tutar == 10) return "Rheinbrücke Kemerli Köprü, Heidelberg, Almanya";
            else if (tutar == 20) return "Pont du Gard Su Kemeri, Nîmes, Fransa";
            else if (tutar == 50) return "Artemis Tapınağı, Efes, Türkiye";
            else if (tutar == 100) return "Sistine Madonna, Michelangelo'nun eseri, Floransa, İtalya";
            else if (tutar == 200) return "Gizemli Çiçekler Buketi, Jan van Huysum'un Eseri, Amsterdam, Hollanda";
            else if (tutar == 500) return "Altın Kapı, Köln Katedrali, Köln, Almanya";
            else return "Geçersiz para birimi";
        }

        // Türkiye için
        else if (bolge.equalsIgnoreCase("türkiye")) {
            if (tutar == 5) return "Atatürk ve Ordinaryus Profesör Doktor Aydın Sayılı";
            else if (tutar == 10) return "Atatürk ve Profesör Doktor Cahit Arf";
            else if (tutar == 20) return "Atatürk ve Mimar Ahmed Kemaleddin";
            else if (tutar == 50) return "Atatürk ve Fatma Aliye Hanım";
            else if (tutar == 100) return "Atatürk ve Buhurizade Mustafa Itrî";
            else if (tutar == 200) return "Atatürk ve Yunus Emre";
            else return "Geçersiz para birimi";
        }
        return "Geçersiz bölge";
    }
}



