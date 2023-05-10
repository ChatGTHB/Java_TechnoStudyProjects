package project_05.Mortgage;

public enum StatesTax {
    /*
        StatesTax class i bir "enum class"tir ve bizim tax (vergi) lerimi belirleyecektir.
        4 adet state (bölge) imiz var ve her birinin vergisi birbirinden farkli olacak.

        Newyork -> 20
        NewJersey -> 15
        Florida -> 5
        Ohio -> 12

        Buradaki vergilerin amaci evin toplam ücretinin üzerine eklenecek vergilerdir.
     */

    /*
        Yukarida belirtilen her bir enum attribute unu tanimlayalim.
     */

    //--------------------------------------------------------------
    // -> Attributes
    NEWYORK(20),
    NEWJERSEY(15),
    FLORIDA(5),
    OHIO(12);

    //--------------------------------------------------------------

    /*

        Enum tarafindan gelen int degerler yani vergi oranlari, bir vergi nesnesine eşit olmaldır. O yüzden aşşağıdaki
    adimlari takip ediniz.

    1- Bir private attrube oluştururunuz ve bunun sınıfı int olsun, adina tax diyebilirsiniz.
    2- Bir constructor tanimlayalim ve oluşturduğumuz bu attribute u gelen parametreye göre eşitleyelim.
    3- "tax" adinda oluşturduğumuz bu attribute icin sadece getter method tanımlayalım ki bu methodu her bir ev ücreti
    icin hesaplama yaparken kullanabilelim.

     */

    //--------------------------------------------------------------
    // -> Attributes
    private int tax;
    //--------------------------------------------------------------

    //--------------------------------------------------------------
    // -> Constructor

    StatesTax(int tax) {
        this.tax = tax;
    }

    //--------------------------------------------------------------

    //--------------------------------------------------------------
    // -> Method

    public int getTax() {
        return tax;
    }

    //--------------------------------------------------------------



}



