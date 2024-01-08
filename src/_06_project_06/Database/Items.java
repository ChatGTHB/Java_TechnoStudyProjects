package _06_project_06.Database;
public class Items {
    /*
        Item class ını bir veritabanı olarak düşünebiliriz fakat burada bir static method kullanmak yerine satın alınmak
    istenen ürüne göre işlem yapacağız. Örneğin satın alınmak istenen ürün bir telefon ise bize o telefon için bir ücret
    döndürecek ve bu ücreti user in bakiyesine ekliyeceğiz.
     */
    //---------------------------------------------------------------------------------------
    /*
        Bir method oluşturalım ve adına "ItemName" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir itemName almalı
        Eğer ki itemName:
            "Rose teddy bear" ise 30,
            "Iphone max" ise 850.23,
            "laptop mouse" ise 23.50,
            "Monitor" ise 90.23,
            "charger" ise 43.20,
            "hdmi cable" ise 5.90,
            "mug" ise 30
        değerlerini döndürmeli
     */
    // Method buraya yazılacak
    public static double ItemName(String itemName) {
        double itemPrice = 0;
        switch (itemName) {
            case "Rose teddy bear":
                itemPrice = 30;
                break;
            case "Iphone max":
                itemPrice = 850.23;
                break;
            case "laptop mouse":
                itemPrice = 23.50;
                break;
            case "Monitor":
                itemPrice = 90.23;
                break;
            case "charger":
                itemPrice = 43.20;
                break;
            case "hdmi cable":
                itemPrice = 5.90;
                break;
            case "mug":
                itemPrice = 30;
                break;
        }
        return itemPrice;
    }
    //---------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------
    /*
        Bir method oluşturalım ve adına "colorPrice" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir color almalı
        Eğer ki color:
            "Red" ise 10,
            "Blue" ise 6,
            "Black" ise 4,
            "White" ise 2
        değerlerini döndürmeli
     */
    // Method buraya yazılacak

    public static double colorPrice(String color) {
        double colorPrice = 0;
        switch (color) {
            case "Red":
                colorPrice = 10;
                break;
            case "Blue":
                colorPrice = 6;
                break;
            case "Black":
                colorPrice = 4;
                break;
            case "White":
                colorPrice = 2;
                break;
        }
        return colorPrice;
    }
    //---------------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------------
    /*
        Bir method oluşturalım ve adına "customText" diyelim,
            Tipi: static
            Return tipi: double
            Parametre: String türünden bir text almalı
        Eğer ki text:
            10 karakterden uzun ise 5,
            10 karakterden kısa veya eşit ise 3
        değerlerini döndürmeli

     */
    // Method buraya yazılacak
    public static double customText(String text) {
        double textPrice = 0;
        if (text.length() > 10) {
            textPrice = 5;
        } else if (text.length() <= 10) {
            textPrice = 3;
        }
        return textPrice;
    }
    //---------------------------------------------------------------------------------------
}



