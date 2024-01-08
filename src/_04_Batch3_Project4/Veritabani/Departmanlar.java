package _04_Batch3_Project4.Veritabani;


import _04_Batch3_Project4.Modeller.Departmanlar.BilisimTeklonojileriDepartmani;
import _04_Batch3_Project4.Modeller.Departmanlar.Departman;
import _04_Batch3_Project4.Modeller.Departmanlar.InsanKaynaklariDepartmani;
import _04_Batch3_Project4.Modeller.Departmanlar.YonetimDepartmani;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Departmanlar {


    // Bunu bir veritabani gibi düsünmeliyiz bu yüzden proje calistiği zaman, ilk once veritabani olusmali ki
    // ekleme cikarma islemlerini rahatca yapabilelim bu yüzden tüm değerleri static verip, departmanList i ise
    // new leyip, bu departmanlari içerisine bulunduralim.
    static private final Departman BILISIM_TEKLONOJILERI_DEPARTMANI = new BilisimTeklonojileriDepartmani();
    static private final Departman YONETIM_DEPARTMANI = new YonetimDepartmani();
    static private final Departman INSAN_KAYNAKLARI_DEPARTMANI = new InsanKaynaklariDepartmani();
    static private List<Departman> DepartmanList = new ArrayList<>(Arrays.asList(BILISIM_TEKLONOJILERI_DEPARTMANI, YONETIM_DEPARTMANI, INSAN_KAYNAKLARI_DEPARTMANI));

    // Basit bir getter method
    public static List<Departman> getDepartmanList() {
        return DepartmanList;
    }


}
