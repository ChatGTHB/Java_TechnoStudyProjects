package Task18;
import java.util.Scanner;
public class pascal {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Kullanıcıdan satır sayısını alın
            System.out.print("Satır sayısını girin: ");
            int numRows = scanner.nextInt();

            // Pascal üçgenini oluşturup ekrana yazdırın
            printPascalTriangle(numRows);

            scanner.close();
        }

        // Pascal üçgenini oluşturan fonksiyon
        public static void printPascalTriangle(int numRows) {
            System.out.println("Pascal Üçgeni:");

            for (int i = 0; i < numRows; i++) {
                int number = 1;
                for (int j = 0; j <= i; j++) {
                    System.out.print(number + " ");
                    number = number * (i - j) / (j + 1);
                }
                System.out.println();
            }
        }
    }

