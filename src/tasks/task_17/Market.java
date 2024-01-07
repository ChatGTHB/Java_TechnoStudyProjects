package tasks.task_17;

import java.util.Scanner;

public class Market {

    public static void main(String[] args) {
        // Ürün tablosunu oluştur
        String[] urunIsimleri = {"Ekmek", "Un", "Süt", "Karpuz"};
        double[] urunFiyatlari = {10.0, 20.0, 15.0, 25.0};
        int[] urunStoklari = {5, 8, 3, 10};

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Kullanıcıya ürünleri listeleyin
            System.out.println("Ürünler:");
            for (int i = 0; i < urunIsimleri.length; i++) {
                System.out.println((i + 1) + ". " + urunIsimleri[i] + " - Fiyat: " + urunFiyatlari[i] + " TL - Stok: " + urunStoklari[i]);
            }

            // Kullanıcıdan seçim yapmasını isteyin
            System.out.println("Alışveriş yapmak istediğiniz ürünün numarasını girin (Çıkış için 0):");
            int secilenUrunNo = scanner.nextInt();

            if (secilenUrunNo == 0) {
                // Kullanıcı çıkış yapmak istiyor
                System.out.println("Alışverişten çıkılıyor. İyi günler!");
                break;
            }

            // Seçilen ürünün stok durumunu kontrol edin
            if (secilenUrunNo > 0 && secilenUrunNo <= urunIsimleri.length) {
                int index = secilenUrunNo - 1;

                // Güncel stok durumu
                System.out.println("Güncel stok durumu: " + urunStoklari[index]);

                // Kullanıcıdan almak istediği miktarı sorun
                System.out.println("Kaç adet almak istiyorsunuz?");
                int alinanMiktar = scanner.nextInt();

                if (urunStoklari[index] >= alinanMiktar) {
                    // Hesaplamalar ve çıktılar
                    double toplamFiyat = urunFiyatlari[index] * alinanMiktar;
                    urunStoklari[index] -= alinanMiktar;

                    System.out.println("Ürün adı: " + urunIsimleri[index]);
                    System.out.println("Alınan miktar: " + alinanMiktar);
                    System.out.println("Toplam fiyat: " + toplamFiyat + " TL");
                } else {
                    // Stok yetersizse
                    System.out.println("Üzgünüz, " + urunIsimleri[index] + " ürününden yeterli stok bulunmamaktadır.");
                    System.out.println("Mevcut stok: " + urunStoklari[index]);
                }
            } else {
                // Geçersiz ürün numarası
                System.out.println("Geçersiz ürün numarası!");
            }

            // Kullanıcıya tekrar alışveriş yapmak isteyip istemediğini sorun
            System.out.println("Yeni bir alışveriş yapmak ister misiniz? (Evet için 1, Hayır için 0)");
            int devamEt = scanner.nextInt();

            if (devamEt == 0) {
                // Kullanıcı çıkış yapmak istiyor
                System.out.println("Alışverişten çıkılıyor. İyi günler!");
                break;
            }
        }
    }
}

