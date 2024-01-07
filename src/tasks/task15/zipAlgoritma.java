package Task15;

public class zipAlgoritma {

    // Test için kullanılan main metodu
    public static void main(String[] args) {
        // Örnek bir giriş metni belirlenir
        String inputText = "aaaabbbccdddf";

        // Metin sıkıştırma işlemi yapılır
        String outputText = compressText(inputText);

        // Sonuç ekrana yazdırılır
        System.out.println(outputText);
    }

    // Metin sıkıştırma işlemini gerçekleştiren metot
    public static String compressText(String text) {
        // Sıkıştırılmış metni tutmak için boş bir dize oluşturulur
        String compressedText = "";
        // Karakter sayısını tutan bir sayaç başlatılır
        int count = 1;

        // Metnin ikinci karakterinden başlayarak her karakter için döngü
        for (int i = 1; i < text.length(); i++) {
            // Mevcut karakter önceki karaktere eşitse
            if (text.charAt(i) == text.charAt(i - 1)) {
                // Sayaç arttırılır
                count++;
            } else {
                // Eğer mevcut karakter önceki karakterden farklıysa,
                // önceki karakterin sayısı ve karakteri sıkıştırılmış metne eklenir,
                // sonra sayaç sıfırlanır
                compressedText += count + "" + text.charAt(i - 1);
                count = 1;
            }
        }

        // Döngüden çıktıktan sonra, son karakterin sayısı ve karakteri sıkıştırılmış metne eklenir
        compressedText += count + "" + text.charAt(text.length() - 1);

        // Sıkıştırılmış metin döndürülür
        return compressedText;
    }
}

