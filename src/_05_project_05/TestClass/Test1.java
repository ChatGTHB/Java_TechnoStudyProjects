package _05_project_05.TestClass;

import _05_project_05.Mortgage.HousePrices;
import _05_project_05.Mortgage.StatesTax;
import org.junit.Assert;
import org.junit.Test;

public class Test1 {

    /*

        Test1 class i icerisinde hiçbir şey değiştirmemize gerek yoktur, tek yapmamız gereken işlem:
            - Kırmızı yanan "junit" icin import islemi gercekleştirmeliyiz.
            Kirmiziliğin üzerine sağ tık -> Show Content Actions -> Add "JUnit4" to classpath -> Acilan pop-up ta Ok tuşu
            (JUnit4NasılEklenir.png)

        Bu class i bir main method olarak düşünebiliriz, içeride geçen "@Test" anahtarlarını en ince ayrıntılarına
    kadar ileride öğreneceğiz, su anlık bilmemize gerek yok... Buradaki class i calistirmak istersek de, "public class
    Test1" in yani 8. satirin en solundaki yeşil ok üzerinden calistirabiliriz.

        Aşşağıdaki her bir "@Test" in altindaki method bir test e karşılık gelir yani şuanda 4 adet testimiz bulunmakta.
    Test içerisinde öncelikle fiyat bicilen evler icin bir faturamsı nesne oluşturuluyor, daha sonra ise verilen adın
    doğru olup olmadığını kontrol ediyor.

        Assert ile baslayan kodlari "kontrol edici kod" olarak düşünebiliriz şimdilik, ve içerisini değiştirmemize gerek yok.
    Assert ile baslayan methodun icerisine bir mesaj birakabiliyoruz, veya mesaj olmadan da iki nesnenin "string vs string"
    veya "int vs int" gibi... birbirine uygunluğunu kontrol edebiliyoruz. En ince ayrintisina kadar ileriki derslerde ögreneceğiz.
    Simdilik ne işe yaradığını bilmemiz yeterli olur.

        Daha sonra ise bir evin toplam ücretini ve vade ücretini ayri değişkenlere atip bunlarin doğruluğuna bakiyoruz.
    Yani buradan cikarmamiz gereken durum: eğer algoritmalarimi dogru yazdıysam, hesaplamalarimi doğru yaptiysam, method
    isimlerini birbirine uygun yazdıysam, access modifiers lara dikkat ettiysem, bu class i calistirdiğimda hiçbir hata
    almamalıyım. Projenin bittiğini, bu class i calistirdiktan sonra sol altta tüm testlerin yeşil tikli olmasından anlayabilirim.
    (Ornek.png)

    */

    @Test
    public void test1(){

        HousePrices housePrices= new HousePrices("Fernando" , "new" ,  "Apartment" ,3 ,40000 ,30 , StatesTax.OHIO);

        Assert.assertEquals("Fernando",housePrices.getUsername());

        int total = housePrices.getPriceTotal();
        int eachMonth = housePrices.getPriceEachMonth();

        Assert.assertEquals("Result should be 123200 but your result is " + total, 123200, total);
        Assert.assertEquals("Result should be 2773 but your result is " +eachMonth, 2773, eachMonth);

    }

    @Test
    public void test2(){

        HousePrices housePrices= new HousePrices("David" , "Like New"  , "House" ,5 ,50000 ,30 , StatesTax.NEWYORK);

        Assert.assertEquals("David",housePrices.getUsername());

        int total = housePrices.getPriceTotal();
        int eachMonth = housePrices.getPriceEachMonth();

        Assert.assertEquals("Result should be 120000 but your result is " + total, 168000, total);
        Assert.assertEquals("Result should be 2333 but your result is " +eachMonth, 3933, eachMonth);

    }

    @Test
    public void test3(){

        HousePrices housePrices= new HousePrices("Emily" , "Old" ,  "condo" ,4,30000 ,36 , StatesTax.FLORIDA);

        Assert.assertEquals("Emily",housePrices.getUsername());

        int total = housePrices.getPriceTotal();
        int eachMonth = housePrices.getPriceEachMonth();

        Assert.assertEquals("Result should be 115498 but your result is " + total, 115500, total);
        Assert.assertEquals("Result should be 2374 but your result is " +eachMonth, 2375, eachMonth);


    }

    @Test
    public void test4(){

        HousePrices housePrices= new HousePrices("Rinda" , "Renew Required" ,  "condo" ,1,50000 ,35 , StatesTax.NEWJERSEY);

        Assert.assertEquals("Rinda",housePrices.getUsername());

        int total = housePrices.getPriceTotal();
        int eachMonth = housePrices.getPriceEachMonth();

        Assert.assertEquals("Result should be 74748 but your result is " + total, 74750, total);
        Assert.assertEquals("Result should be 707 but your result is " +eachMonth, 707, eachMonth);

    }
}
