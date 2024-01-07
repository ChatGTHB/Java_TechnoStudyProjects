package Task4;
import java.util.Scanner;
public class elektrikFaturasiHesaplama {
        public static void main(String[] args) {
            // Değişkenleri tanımlama
            float aylikFatura;
            int elektrikTuketimi;
            float birimFiyat;
            int yeniOkuma, eskiOkuma;

            // Kullanıcıdan girdileri alma
            Scanner scanner = new Scanner(System.in);
            System.out.print("Yeni okuma değerini girin: ");
            yeniOkuma = scanner.nextInt();

            System.out.print("Eski okuma değerini girin: ");
            eskiOkuma = scanner.nextInt();

            // Elektrik tüketimini hesaplama
            elektrikTuketimi = yeniOkuma - eskiOkuma;

            // Birim fiyatı belirleme
            if (elektrikTuketimi >= 0 && elektrikTuketimi <= 100) {
                birimFiyat = 1.1f;
            } else if (elektrikTuketimi <= 200) {
                birimFiyat = 1.3f;
            } else if (elektrikTuketimi <= 300) {
                birimFiyat = 1.5f;
            } else if (elektrikTuketimi <= 400) {
                birimFiyat = 1.7f;
            } else if (elektrikTuketimi <= 500) {
                birimFiyat = 1.9f;
            } else {
                birimFiyat = 2.3f;
            }

            // Aylık faturayı hesaplama
            aylikFatura = elektrikTuketimi * birimFiyat;

            // Aylık faturayı gösterme
            System.out.println("Aylık Fatura: " + aylikFatura + " TL");

            // Scanner'ı kapatma
            scanner.close();
        }
    }

