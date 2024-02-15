package _12_Batch5_SalaryAccount;

import java.util.Scanner;

public class MaasHesaplama {
    public static void main(String[] args) {

        // Değişkenleri tanımlama
        float toplamMaas, sabitMaas, prim, satisKazanci, primOrani, performansSeviyesi;

        // Kullanıcıdan girdileri alma
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sabit maaşı girin: ");
        sabitMaas = scanner.nextFloat();

        System.out.print("Satışlardan elde edilen toplam kazancı girin: ");
        satisKazanci = scanner.nextFloat();

        System.out.print("Belirlenen performans seviyesini (toplam kazanç hedefini) girin: ");
        performansSeviyesi = scanner.nextFloat();

        // Performans seviyesine göre prim oranını belirleme
        if (satisKazanci > performansSeviyesi) {
            primOrani = 0.10f;
        } else {
            primOrani = 0.05f;
        }

        // Prim hesaplama
        prim = satisKazanci * primOrani;

        // Toplam maaşı hesaplama
        toplamMaas = sabitMaas + prim;

        // Toplam maaşı yazdırma
        System.out.println("Toplam Maaş: " + toplamMaas + " TL");

        // Scanner'ı kapatma
        scanner.close();
    }
}


