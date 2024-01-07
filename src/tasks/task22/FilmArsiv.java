package Task22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FilmArsiv {

    public static void main(String[] args) {
        // Film bilgilerini saklamak için HashMap oluşturuluyor.
        Map<String, Map<String, String>> filmKutuphanesi = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıya devam etmek isteyip istemediğini sormak için bir döngü ekleniyor.
        while (true) {
            System.out.print("Film Bilgisi eklemek istiyor musunuz? (Evet/Hayır): ");
            String devamEt = scanner.next().toLowerCase();

            if (!devamEt.equals("evet")) {
                break; // Kullanıcı devam etmek istemiyorsa döngüden çıkılıyor.
            }

            // Kullanıcıdan film bilgileri alınıyor.
            scanner.nextLine(); // Boşluğu tüketmek için kullanılıyor
            System.out.print("Film adı: ");
            String filmAdi = scanner.nextLine();

            System.out.print("Türü: ");
            String tur = scanner.nextLine();

            System.out.print("Yönetmen (isim ve soyisim): ");
            String yonetmen = scanner.nextLine();

            System.out.print("Yayın yılı: ");
            String yayinYili = scanner.next();

            // Film bilgilerini Map'e ekleniyor.
            Map<String, String> filmBilgileri = new HashMap<>();
            filmBilgileri.put("Tür", tur);
            filmBilgileri.put("Yönetmen", yonetmen);
            filmBilgileri.put("Yayın Yılı", yayinYili);

            filmKutuphanesi.put(filmAdi, filmBilgileri);
        }

        // Film bilgileri ekrana yazdırılıyor.
        System.out.println("\nFilm Kütüphanesi:");
        for (Map.Entry<String, Map<String, String>> entry : filmKutuphanesi.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Belirli bir filmi sorgulama
        System.out.print("\nBilgilerini öğrenmek istediğiniz film adı: ");
        scanner.nextLine(); // Boşluğu tüketmek için kullanılıyor
        String sorgulananFilm = scanner.nextLine();
        if (filmKutuphanesi.containsKey(sorgulananFilm)) {
            System.out.println(sorgulananFilm + ": " + filmKutuphanesi.get(sorgulananFilm));
        } else {
            System.out.println("Bu film bulunamadı.");
        }

        scanner.close();
    }
}
