package _01_Batch3_Project1;

import java.util.Scanner;

public class Project_01_Exercise {

    public static void main(String[] args) {

        // Scanner class tanimlayin...
        Scanner input=new Scanner(System.in);
        // Kullanicidan ismini girmesini isteyin ve girilen ismin ilk hafrini buyuk harfe donusturun...
        System.out.print("Lütfen isminizi giriniz : ");
        String isim=input.nextLine();
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1);
        // Kullanicinin girdigi ismi ekrana yazdirarak, " Ahmet hosgeldin, soyismini girer misin?" diye soralim...
        System.out.print(isim+" hoşgeldiniz. Soyisminizi girer misiniz? : ");
        String soyisim=input.nextLine();
        // Kullanici nin ismini ve soyismini ilk harfi buyuk digerleri kucuk olacak sekilde yazdiralim...
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        // Ekranda gorulen isim soyisim dogru ise "Y" tusuna basarak devam edilecek sekilde dongu olusturalim...
        // Eger kullanici "Y" haricinde bir tusa basarsa "Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin..."
        // ikazi verelim
        // Kullaniciyi tekrar "Y" tusuna basana kadar donguye devam edelim...
        // Kullanici "Y" tusuna bastiginda "Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir..."
        // ikazi verelim

        char girilen='Y';
        char onay;

        System.out.print(isim+" "+soyisim+ " isminiz doğru ise devam etmek için \"Y\" tuşuna basınız : ");
        onay=input.nextLine().toUpperCase().charAt(0);

        if(onay!=girilen){
            while(onay!=girilen){
                System.out.print("Tercihinizi dogru yapmadiniz...Lutfen tekrar deneyin..:");
                onay=input.nextLine().toUpperCase().charAt(0);
            }
        }

        System.out.println("Isim ve Soyisminiz sisteme basarili bir sekilde kayit edilmistir...");

        // Kullanici adi belirleme adimi ile devam edelim ->" Lutfen kullanici adnizi belirleyin...:"
        System.out.print("Lütfen kullanıcı adınızı belirleyiniz :");
        String kullaniciAdi=input.nextLine();
        // Sifre belirleme ile devam edelim...->" Lutfen sifrenizi belirleyiniz...:"
        System.out.print("Lütfen şifrenizi belirleyiniz :");
        String sifre=input.nextLine();
        // Sifre tekrar girilmelidir -> " Sifrenizi tekrar giriniz...:"
        System.out.print("Lütfen şifrenizi tekrar giriniz :");
        String sifreTekrar=input.nextLine();
        // Girilen iki girilen birbiri ile ayni olmalidir... Degilse "Yanlis veya hatali bir girilen girdiniz,
        // lutfen tekrar deneyin..." ikazi verelim
        // Sifreler birbiri ile ayni ise "Tebrikler... "+ username + " kullanici adiyla sisteme kayit oldunuz..."
        // ikazi verelim...

        if(sifre.equals(sifreTekrar)){
            System.out.println("Tebrikler "+kullaniciAdi+" kullanıcı adıyla sisteme kaydoldunuz.");
        }else{
            System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");
        }

       // System.out.println(sifre.equals(sifreTekrar)?"Tebrikler "+kullaniciAdi+" kullanıcı adıyla sisteme kaydoldunuz."
       //         :"Hatalı giriş yaptınız. Lütfen tekrar deneyiniz.");

    }
}



