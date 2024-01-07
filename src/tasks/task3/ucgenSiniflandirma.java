package Task3;

import java.util.Scanner;
public class ucgenSiniflandirma {
        public static void main(String[] args) {
            // Kullanıcıdan üçgen kenar uzunluklarını okuma
            Scanner scanner = new Scanner(System.in);
            System.out.print("Üçgenin ilk kenar uzunluğunu girin: ");
            double kenar1 = scanner.nextDouble();

            System.out.print("Üçgenin ikinci kenar uzunluğunu girin: ");
            double kenar2 = scanner.nextDouble();

            System.out.print("Üçgenin üçüncü kenar uzunluğunu girin: ");
            double kenar3 = scanner.nextDouble();

            // Üçgenin türünü ve geçerliliğini kontrol etme
            if ((kenar1 + kenar2 > kenar3) && (kenar1 + kenar3 > kenar2) && (kenar2 + kenar3 > kenar1)) {
                if (kenar1 == kenar2 && kenar1 == kenar3) {
                    System.out.println("Bu bir eşkenar üçgendir.");
                } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
                    System.out.println("Bu bir ikizkenar üçgendir.");
                } else {
                    System.out.println("Bu bir çeşitkenar üçgendir.");
                }
            } else {
                System.out.println("Geçersiz üçgen uzunlukları. Bu bir üçgen oluşturmaz.");
            }

            // Scanner'ı kapat
            scanner.close();
        }
    }


