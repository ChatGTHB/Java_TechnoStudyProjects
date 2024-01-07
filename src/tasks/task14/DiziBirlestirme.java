package tasks.task14;

import java.util.*;

public class DiziBirlestirme {

    public static void main(String[] args) {
        // Değişkenleri tanımla
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();
        Set<Integer> mergedSet = new HashSet<>();

        // Kullanıcıdan girişleri al
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Dizi Elemanlarını Girin (virgülle ayrılmış): ");
        String array1Input = scanner.nextLine();
        System.out.print("2. Dizi Elemanlarını Girin (virgülle ayrılmış): ");
        String array2Input = scanner.nextLine();

        // Girişleri diziye çevir
        String[] array1String = array1Input.split(",");
        String[] array2String = array2Input.split(",");

        for (String num : array1String) {
            array1.add(Integer.parseInt(num.trim()));
        }

        for (String num : array2String) {
            array2.add(Integer.parseInt(num.trim()));
        }

        // Dizileri birleştir ve tekrar eden elemanları çıkar
        mergedSet.addAll(array1);
        mergedSet.addAll(array2);

        // Sonucu ekrana yazdır
        System.out.print("Birleştirilmiş Dizi: ");
        for (Integer num : mergedSet) {
            System.out.print(num + " ");
        }
    }
}
