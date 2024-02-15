package _04_Batch3_EmployeeRecordingProject.Modeller.Calisanlar;

import _04_Batch3_EmployeeRecordingProject.Modeller.Departmanlar.Departman;
import _04_Batch3_EmployeeRecordingProject.Veritabani.Calisanlar;
import _04_Batch3_EmployeeRecordingProject.Veritabani.Departmanlar;

public class Calisan {

    private String calisanId;
    private String adSoyad;
    private int maas;
    private Departman Departman;
    private String isimKodu = "";

    public Calisan(String adSoyad, int maas, String departmanKodu) {
        this.adSoyad = adSoyad;
        this.maas = maas;
        setDepartman(departmanKodu);
        this.setCalisanId();
        Calisanlar.addACalisan(this);
    }

    // Kullanicinin departman koduna göre, gerekli departman set edilmelidir.
    private void setDepartman(String departman) {
        for (Departman dprtmn : Departmanlar.getDepartmanList()) {
            if (departman.equals(dprtmn.getDepartmanKodu())) {
                this.Departman = dprtmn;
                break;
            }
        }
        /*
            İpucu: Departman listesinin (Veritabani.Departmanlar.DepartmanList) içerisindeki departmanların kodları var,
        bu kodlari donguye tutmak ise yarayabilir.
       */
    }
    // Calisanin ID sinin kendisine özel olduğundan bahsetmistik, ID nin nasil kaydedileceği CalisanKaydetmeProjesiTanıtım.txt
    // içerisinde yer aliyor.
    private void setCalisanId() {
        this.calisanId = this.Departman.getDepartmanKodu() + (Calisanlar.getCalisanList().size() + 1) + getCalisanIsimKodu();
        /*
            İpucu: Detayli anlatim CalisanKaydetmeProjesiTanıtım.txt içerisinde.
         */
    }

    // Calisanin ID sinin sonuna isim kodu eklenmesi için, ismi parçalayan bir method.
    private String getCalisanIsimKodu() {
        /*
            Basit string metodlari ise isinice cok yarayacaktir fakat dinamik olmasina dikkat edelim...
            Mesela 2 isim bir soyisim girildiğinde hata vermesin.
         */
        String[] diziAdSoyad = adSoyad.split(" ");

        String calisanIsimKodu = "";
        for (int i = 0; i < diziAdSoyad.length; i++) {
            String str = diziAdSoyad[i];
            calisanIsimKodu += str.toUpperCase().charAt(0);
        }
        return calisanIsimKodu;
    }

    // Calisanin id sini almak icin basit getter method
    public String getCalisanId() {
        return this.calisanId;
    }

    // Calisanin departmanini almak icin basit getter method
    public Departman getDepartman() {
        return this.Departman;
    }

    // Departman adini verebilmek için bir method
    public String getDepartmanAdi() {
        /*
                İpucu: Departman Kodu YD ise departman adi Yonetim Departmani olarak kaydedilmelidir.
         */
        String departmanAdi = "";

        if (getDepartman().getDepartmanKodu().equals("YD")) {
            departmanAdi = "Yonetim Departmani";
        } else if (getDepartman().getDepartmanKodu().equals("IKD")) {
            departmanAdi = "Insan Kaynaklari Departmani";
        } else if (getDepartman().getDepartmanKodu().equals("BTD")) {
            departmanAdi = "Bilisim Teknolojileri Departmani";
        }
        return departmanAdi;
    }

    // Calisana zam yapilmasi için gerekli bir method
    public static void zamYap(String calisanId) {
        for (Calisan calisan : Calisanlar.getCalisanList()) {
            if (calisanId.equals(calisan.getCalisanId())) {
                calisan.maas += calisan.maas * calisan.getDepartman().getZamOrani() / 100;
                break;
            }
        }

        /*
            İpucu: Calisan ID si kullanilarak yapilmalidir, diğer attributelarin aynilarindan 1 er tane daha
            olabilirdi.
         */
    }

    // Calisanlari yazdırmak için gerekli bir override

    @Override
    public String toString() {
        return "Calisan ID : \'" +calisanId + "\'" +
                ", Isim Soyisim : \'"+ adSoyad +"\'"+
                ", Maas : \'" + maas +"\'" +
                ", Departman : \'" + Departman.getClass().getSimpleName() +"\'";
    }

}
