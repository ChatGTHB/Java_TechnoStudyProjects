

public class Account {

    // FIELDS
    private int accountId;
    private int customerId;
    private double balance;
    private AccountType accountType;

    // CONSTRUCTORS
    public Account() {
    }

    public Account(int accountId, int customerId, AccountType accountType) {
        this.accountId = accountId;
        this.customerId = customerId;
        this.accountType = accountType;
    }

    // GETTER AND SETTER METHODS
    // TODO GETTER VE SETTER METODLARINI OLUŞTURUN






    ////////////////////////////////////////////////////////////////////////////


    // TODO PARA EKLE (DEPOSIT) METODU
    //  YATIRILACAK TUTARIN SIFIRDAN BÜYÜK OLMASI GEREKİR.
    //  ŞART SAĞLANDIĞINDA İLGİLİ HESABIN BAKİYESİ ARTMIŞ OLMALIDIR.
    public void depositToAmount(double amount) {
    /*
      1. BU METODU BankSimulation SINIFINDAKİ depositToAccount() METODUNDA DİREKT ÇAĞIRARAK KULLANIN
      2. YATIRILMAK İSTENEN TUTAR, SIFIRDAN BÜYÜK MÜ DEĞİL Mİ KONTROL EDİN
      3. BÜYÜKSE BAKİYEYE İLAVE EDİP KULLANICIYA MESAJ VERİN
      4. YATIRILMAK İSTENEN TUTAR SIFIRDAN KÜÇÜKSE KULLANICIYA MESAJ VERİN, YENİDEN DENEMESİNİ İSTEYİN...
     */





    }
    ////////////////////////////////////////////////////////////////////////////////////////


    // TODO PARA ÇEK (WITHDRAW) METODU
    //  ÇEKİLECEK TUTARIN SIFIRDAN BÜYÜK OLMASI GEREKİR.
    //  ŞART SAĞLANDIĞINDA İLGİLİ HESABIN BAKİYESİ TUTAR KADAR AZALMIŞ OLMALIDIR.
    public void withdrawToAmount(double amount) {

        /*
         1. BU METODU BankSimulation SINIFINDAKİ withdrawToAccount() METODUNDA DİREKT ÇAĞIRARAK KULLANIN
         2. ÇEKİLMEK İSTENEN TUTAR, NEGATİF Mİ, DEĞİL Mİ KONTROL EDİN
         3. ÇEKİLMEK İSTENEN TUTAR BAKİYEDEN BÜYÜK MÜ, DEĞİL Mİ KONTROL EDİN
         4. ÇEKİLMEK İSTENEN TUTAR (amount) POZİTİFSE VE BAKİYEDEN KÜÇÜKSE,BAKİYEDEN DÜŞÜP,YENİ BAKİYEYİ KULLANICIYA BİLDİRİN...
         5. YATIRILMAK İSTENEN TUTAR SIFIRDAN KÜÇÜKSE YA DA BAKİYEDEN BÜYÜKSE,KULLANICIYA MESAJ VERİN, YENİDEN DENEMESİNİ İSTEYİN
         */





    }
    /////////////////////////////////////////////////////////////////////////////////////

    // TODO TO STRING METODUNU OLUŞTURUN






    ////////////////////////////////////////////////////////////////////////////////////////
}
