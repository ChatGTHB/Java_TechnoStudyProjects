package Task9;
public class parolaUretici {

        public static void main(String[] args) {
            // Rastgele parolayı alın
            String rastgeleParola = rastgeleParolaUret();

            // Elde edilen parolayı ekrana yazdırın
            System.out.println("Oluşturulan Parola: " + rastgeleParola);
        }

    public static String rastgeleParolaUret() {

        // Parola uzunluğunu 8 ile 10 arasında rastgele seçin
        int parolaUzunlugu = (int) (Math.random() * 3) + 8;

        // Oluşturulan parolayı tutacak bir String oluşturun
        String parola = "";

        // Her karakteri ASCII tablosundaki 33 ila 126 konumları arasından rastgele seçerek parolayı oluşturun
        for (int i = 0; i < parolaUzunlugu; i++) {
            char rastgeleKarakter = (char) ((Math.random() * 94) + 33);
            parola += rastgeleKarakter;
        }

        // Oluşturulan parolayı döndürün
        return parola;
    }

}
