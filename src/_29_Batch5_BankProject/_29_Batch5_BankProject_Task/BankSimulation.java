

import java.util.*;

public class BankSimulation {

    // FIELDS
    // TODO AÇIKLAMADA BELİRTİLEN FIELD LARI OLUŞTURUN.
    // Dokumanda istenilen (customers,accounts,scanner) fieldlari final olarak olusturun






    ////////////////////////////////////////////////////////////////////////////////////////////////

    // CONSTRUCTORS
    // public BankSimulation() metodu bir constructor'dır.
    // Constructor, bir sınıfın nesnesi oluşturulduğunda otomatik olarak çağrılan bir metottur
    // ve nesnenin başlatılması için kullanılır.
    // BankSimulation sınıfındaki bu constructor,
    // sınıfın nesnesi oluşturulduğunda müşteri ve hesapları saklamak için
    // customers ve accounts değişkenlerini uygun şekilde başlatır.
    // Aynı zamanda kullanıcıdan girdiler almak için scanner değişkenini de başlatır.
    // Bu constructor sayesinde, BankSimulation sınıfından bir nesne oluşturduğunuzda,
    // müşteri ve hesap verilerini saklamak ve kullanıcıdan girdiler almak için gerekli olan
    // başlangıç durumu hazırlanmış olur.

    // TODO AÇIKLAMADA BELİRTİLEN CONSTRUCTORLARI OLUŞTURUN







    ///////////////////////////////////////////////////////////////////////////////////////////

    public static void main(String[] args) {

        // TODO BANKSIMULATION SINIFININ NESNESİNİ OLUŞTURUNUZ
        // TODO  RUN METODUNU ÇAĞIRINIZ





    }

    ///////////////////////////////////////////////////////////////////////////////////////////

    // public void run() METODU, ÇIKIŞ YAPILANA KADAR ÇALIŞACAK OLAN ANA METOD
    public void run() {
        int choice;

        // TODO ANA MENÜYÜ OLUŞTURUN VE MÜŞTERİYE YAPTIRDIĞINIZ SEÇİMLERLE, İLGİLİ METODLARA YÖNLENDİRİN
        /*
         * "\n----- BANKA İŞLEMLERİ -----"
         * "1. Müşteri Listele"
         * "2. Yeni Müşteri Ekle"
         * "3. Müşteri İşlemleri"
         * "0. Çıkış"
         * "Seçiminizi yapın: "
         */
        //1//   listCustomers();
        //2//   addCustomer();
        //3//   customerOperationsMenu();
        //0//   System.out.println("Çıkış yapılıyor...");
        // //   System.out.println("Geçersiz seçim! Tekrar deneyin.");

        // NOT: MÜŞTERİ ÇIKIŞ YAPMADIĞI SÜRECE MENÜDE KALMAYA DEVAM ETSİN


    }

    ///////////////////////////////////////////////////////////////////////////////////////////

    // MÜŞTERİLERİ LİSTELEYECEK OLAN METHOD
    // TODO MÜŞTERLERİ LİSTELEYECEK METODU DOLDURUNUZ
    public void listCustomers() {
        System.out.println("\n----- MÜŞTERİLER -----");



    }
    ////////////////////////////////////////////////////////////////////////////////////////////


    // MÜŞTERİLER LİSTELENİRKEN HESAP BİLGİSİ DE LİSTELENMESİ İÇİN GEREKLİ METOD.
    public void listCustomerAccounts(Customer customer) {
        System.out.println("----- " + customer.getCustomerId() +
                " " + customer.getFirstName() +
                " " + customer.getLastName() +
                " HESAPLARI -----");
        boolean hasAccounts = false;
        for (Account account : accounts) {
            if (account.getCustomerId() == customer.getCustomerId()) {
                System.out.println(account.getAccountId() +
                        " - " + account.getAccountType() +
                        " - " + account.getBalance() +
                        " TL");
                hasAccounts = true;
            }
        }
        System.out.println("===============================================");

        if (!hasAccounts) {
            System.out.println("Müşterinin açılmış hesabı bulunmamaktadır.\n" +
                    "===============================================");
        }
    }

    //////////////////////////////////////////////////////////////////////////////////////////////


    // TODO KONSOLDAN İSİM, SOYİSİM VE ŞEHİR BİLGİSİ ALARAK MÜŞTERİ EKLEME METODU.
    public void addCustomer() {
        System.out.println("\n----- YENİ MÜŞTERİ EKLE -----");

        /*
        1. KONSOLDAN İSİM, SOYİSİM VE ŞEHİR BİLGİSİ İSTEYİNİZ
        2. UNIQUE (TEKİL BİR MÜŞTERİ ID Sİ OLUŞTURUNUZ
        3. ELDE ETTİĞİNİZ BU BİLGİLERLE YENİ MÜŞTERİ OLUŞTURUNUZ
        4. OLUŞTURDUĞUNUZ BİLGİLERİ BU SINIFIN FIELD ALANINDA TANIMLANAN MAP'E EKLEYİNİZ
        */

        System.out.println("Müşteri başarıyla eklendi. Müşteri ID: " + "customerId");
    }
    /////////////////////////////////////////////////////////////////////////////////////////////

    // HANGİ MÜŞTERİ DEMEK, HANGİ MÜŞTERİ ID'Sİ DEMEK, BU KONTROLÜ YAPMAMIZ GEREK...
    // KONSOLDAN MÜŞTERİ ID Sİ YANLIŞ GİRİLİRSE, GEÇERSİZ MÜŞTERİ MESAJI VE TEKRAR ID İSTEMESİ GEREKECEK...
    public void customerOperationsMenu() {
        int customerId;
        do {
            System.out.println("\n----- MÜŞTERİ İŞLEMLERİ -----");
            System.out.println("0. Ana Menüye Dön");
            System.out.print("Müşteri ID girin (0 çıkış yapar): ");
            customerId = scanner.nextInt();
            scanner.nextLine();

            if (customerId != 0) {
                Customer customer = customers.get(customerId); // Konsoldan girilen ID'yi bir müşteri nesnesine atadık...
                if (customer != null) { // Atadığımız nesne (customer) null ise, map içerisinde bu id de bir müşteri yok demektir!!!
                    customerOperations(customer); // null değilse, bu müşterinin işlemlerini göster...
                } else {
                    System.out.println("Geçersiz Müşteri ID. Tekrar deneyin.");
                }
            }
        } while (customerId != 0);
    }
        ///////////////////////////////////////////////////////////////////////////////////////////
        public void customerOperations (Customer customer){
            int choice;
            do {
                System.out.println("\n----- " + customer.getFirstName() +
                        " " + customer.getLastName() +
                        " İŞLEMLERİ -----");
                System.out.println("1. Yeni Hesap Aç");
                System.out.println("2. Hesapları Listele");
                System.out.println("3. Para Yatır");
                System.out.println("4. Para Çek");
                System.out.println("5. Bakiye Sorgula");
                System.out.println("0. Ana Menüye Dön");
                System.out.print("Seçiminizi yapın: ");
                choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        openNewAccount(customer);
                        break;
                    case 2:
                        listCustomerAccounts(customer);
                        break;
                    case 3:
                        depositToAccount(customer);
                        break;
                    case 4:
                        withdrawToAccount(customer);
                        break;
                    case 5:
                        checkBalance(customer);
                        break;
                    case 0:
                        System.out.println("Ana menüye dönülüyor...");
                        break;
                    default:
                        System.out.println("Geçersiz seçim! Tekrar deneyin.");
                }
            } while (choice != 0);
        }

    ///////////////////////////////////////////////////////////////////////////////////////////

        // TODO openNewAccount() methodunu olusturun
        // HESAP AÇARKEN, AÇILACAK HESAP TÜRÜNÜ SEÇMEK İÇİN BİR MENÜ OLACAK...
        // HESAP TÜRÜNÜ SEÇTİKTEN SONRA DA, ID ATAYARAK accounts LIST İNE YENİ HESABI EKLEYEN METOD
        public void openNewAccount (Customer customer){
            System.out.println("\n----- YENİ HESAP AÇ -----");
            System.out.println("Hesap Türü Seçin:");

            /** SEÇİM YAPMASI İÇİN KULLANICIYA HESAP TÜRLERİNİ (ENUM) LİSTELEYİN... */
            /** KULLANICIYA KONSOLDAN SEÇİM YAPTIRIN... */
            /** SEÇİLEN DEĞERE GÖRE HESAP TÜRÜNÜ ATAYIN >> accountType (CHECKING-VADESİZ HES,
             * SAVINGS-TASARRUF HES, CREDIT-KREDİ HES) GİBİ...*/

            /** TEKİL BİR HESAP ID'Sİ ATAYIN... HESAP LİSTESİNİN SİZE'INI KULLANARAK SAYAÇ ŞEKLİNDE ID ATANABİLİR...*/

            /** ELDE ETTİĞİNİZ DEĞERLERE GÖRE HESAP LİSTESİNE (accounts) YENİ HESABI EKLEYİNİZ... */

            /** NETİCE OLARAK HESAP EKLEME DURUMUNA GÖRE KULLANICIYA AŞAĞIDAKİ MESAJLARDAN BİRİNİ GÖSTERİN... */
            System.out.println("Hesap başarıyla açıldı. Hesap Numarası: " + "accountId");
            System.out.println("Geçersiz seçim! Yeni hesap açma işlemi iptal edildi.");

        }
        ///////////////////////////////////////////////////////////////////////////////////////////


        // TODO PARA EKLE ( deposit() ) METODU
        public void depositToAccount (Customer customer){
            System.out.println("\n----- PARA YATIR -----");
            System.out.print("Hesap Numarasını Girin: ");
            /** KULLANICIDAN HESAP NUMARASINI ALARAK GEREKLİ KONTROLLERİ GERÇEKLEŞTİRİN
             * YATIRILMAK İSTENEN TUTAR NEGETİF Mİ? POZİTİF Mİ?
             * BU KONTROLÜ, Accounts SINIFINDAN OLUŞTURDUĞUNUZ NESNENİN İÇİNDE depositToAmount(amount) GİBİ
             * BİR METOD TANIMLAYARAK ORADA DA GERÇEKLEŞTİREBİLİRSİNİZ...
             */

            /** accountId VASITASIYLA İSTENEN HESABA ULAŞILABİLİR... */
            /** KULLANICININ GİRDİĞİ HESAP NUMARASI İLGİLİ MÜŞTERİYE AİT Mİ DİYE KONTROL EDİLMELİDİR...*/
            /** KONTROL SONUCUNDA HESAP SINIFI NESNESİNDEN ULAŞTIĞINIZ MÜŞTERİ ID Sİ İLE MÜŞTERİ SINIFININ
             * NESNESİNDEN ULAŞACAĞINIZ MÜŞTERİ ID Sİ AYNI İSE, YATIRILACAK TUTARI KONSOLDA KULLANICIDAN ALIN,
             * VE HESAP SINIFINDAKİ depositToAmount(amount) VASITASIYLA PARAYI YATIRIN...*/

            /** AKSİ HALDE: KULLANICIYA "Geçersiz Hesap Numarası veya hesap sizin değil! İşlem iptal edildi."
             * MESAJI VERİN...
             */
        }
        ////////////////////////////////////////////////////////////////////////////////////////////


        // TODO PARA ÇEK ( withdraw() ) METODU
        public void withdrawToAccount (Customer customer){
            System.out.println("\n----- PARA ÇEK -----");
            System.out.print("Hesap Numarasını Girin: ");

            /** KULLANICIDAN HESAP NUMARASINI İSTEYEREK PARA ÇEKME İŞLEMİNİ GERÇEKLEŞTİRİN... */
            /** İLGİLİ HESAPTAN PARA ÇEKERKEN, Accounts SINIFINDAKİ withdrawToAmount() METODUNU KULLANIN */
            /** BU METOD VASITASIYLA TUTARIN NEGATİF OLMA DURUMU KONTROL EDİLEBİLİR... */
            /** YİNE BU METOD VASITASIYLA ÇEKİLMEK İSTENEN TUTAR BAKİYEDEN BÜYÜK MÜ DİYE KONTROL EDİLEBİLİR...*/

            /** accountId VASITASIYLA İSTENEN HESABA ULAŞILABİLİR... */
            /** KULLANICININ GİRDİĞİ HESAP NUMARASI İLGİLİ MÜŞTERİYE AİT Mİ DİYE KONTROL EDİLMELİDİR...*/
            /** KONTROL SONUCUNDA HESAP SINIFI NESNESİNDEN ULAŞTIĞINIZ MÜŞTERİ ID Sİ İLE MÜŞTERİ SINIFININ
             * NESNESİNDEN ULAŞACAĞINIZ MÜŞTERİ ID Sİ AYNI İSE, ÇEKİLECEK TUTARI KONSOLDA KULLANICIDAN ALIN,
             * VE HESAP SINIFINDAKİ withDrawToAmount(amount) VASITASIYLA PARAYI ÇEKİN...*/

            /** AKSİ HALDE: KULLANICIYA "Geçersiz Hesap Numarası veya hesap sizin değil! İşlem iptal edildi."
             * MESAJI VERİN...
             */
        }
        /////////////////////////////////////////////////////////////////////////////////////////////////////

        //  TODO BAKİYE SORGULAMA İPUCU METODU
        public void checkBalance (Customer customer){
            System.out.println("\n----- BAKİYE SORGULA -----");
            System.out.print("Hesap Numarasını Girin: ");
            int accountId = scanner.nextInt();
            scanner.nextLine();

            Account account = getAccountById(accountId);
            if (account != null && account.getCustomerId() == customer.getCustomerId()) {
                System.out.println("Güncel bakiye: " + account.getBalance() + " TL");
            } else {
                System.out.println("Geçersiz Hesap Numarası veya hesap sizin değil! İşlem iptal edildi.");
            }
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////


        // İPUCU METODU
        // Bu metot, accounts listesinde belirli bir hesabı aramak için kullanılır.
        // Bu sayede, hesap işlemleri sırasında müşteriye ait doğru hesabın bulunması sağlanır.
        // Örneğin, para çekme ve yatırma işlemlerinde, belirli bir müşteriye ait olan hesap bilgilerine
        // doğru bir şekilde ulaşmak için bu metot kullanılır. Girilen accountId (hesap ID) 'sine
        // sahip bir hesap bulunmazsa, metot null değerini döndürür (return null)
        public Account getAccountById ( int accountId){
            for (Account account : accounts) {
                if (account.getAccountId() == accountId) {
                    return account;
                }
            }
            return null;
        }
        ///////////////////////////////////////////////////////////////////////////////////////////////////
    }

