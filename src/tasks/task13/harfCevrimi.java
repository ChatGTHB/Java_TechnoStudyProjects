package Task13;
import java.util.Scanner;
public class harfCevrimi {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan cümle alınır
            System.out.print("Lütfen bir cümle giriniz: ");
            String kullaniciGirdisi = scanner.nextLine();

            // Her bir fonksiyon kullanılarak cümle farklı formatlarda yazdırılır
            yazdir("BÜYÜK HARF FORMATI", buyukHarfFormati(kullaniciGirdisi));
            yazdir("küçük harf formatı", kucukHarfFormati(kullaniciGirdisi));
        }

        public static String buyukHarfFormati(String str) {
            return str.toUpperCase();
        }

        public static String kucukHarfFormati(String str) {
            return str.toLowerCase();
        }

        public static void yazdir(String format, String cikti) {
            System.out.println(format + ": " + cikti);
        }
    }
