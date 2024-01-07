package Task11;
import java.util.Scanner;
public class internetFaturasi {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (islemeDevamMi(scanner)) {
                float aylikFatura = faturaHesapla(scanner);
                System.out.printf("Aylık Internet Faturası: %.2f TL%n", aylikFatura);
            }

            System.out.println("Program sonlandırıldı.");
            scanner.close();
        }

        public static boolean islemeDevamMi(Scanner scanner) {
            System.out.print("Yeni bir müşteri için hesaplama yapmak ister misiniz? (Evet için 'E', Hayır için 'H'): ");
            String cevap = scanner.next();
            return cevap.equalsIgnoreCase("E");
        }

        public static float faturaHesapla(Scanner scanner) {
            float aylikFatura;
            float aylikSabitUcret;
            float ekstraUcret;
            float ekUcretBirimFiyati = 0.0f; // Başlangıç değeri atandı

            System.out.print("Aylık sabit ücreti girin: ");
            aylikSabitUcret = scanner.nextFloat();

            System.out.print("Kategori (1, 2 veya 3) girin: ");
            int kategori = scanner.nextInt();

            System.out.print("Fazla kullanım miktarını (GB) girin: ");
            int fazlaKullanimMiktariGB = scanner.nextInt();

            // 3.1. Ekstra ücret birim fiyatını belirle
            if (kategori == 1) {
                ekUcretBirimFiyati = 0.10f;
            } else if (kategori == 2) {
                ekUcretBirimFiyati = 0.20f;
            } else if (kategori == 3) {
                ekUcretBirimFiyati = 0.30f;
            } else {
                System.out.println("Geçersiz kategori! Program sonlandırıldı.");
                System.exit(0);
            }

            // 3.2. Ekstra ücreti hesapla
            ekstraUcret = fazlaKullanimMiktariGB * ekUcretBirimFiyati;

            // 3.3. Toplam aylık faturayı hesapla
            aylikFatura = aylikSabitUcret + ekstraUcret;

            return aylikFatura;
        }
    }
