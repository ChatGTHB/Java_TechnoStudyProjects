# Sıkıştırma Algoritması Projesi

## Açıklama

Bu proje, basit bir metin sıkıştırma algoritması simülasyonunu gerçekleştirmektedir. Verilen bir metni sıkıştırmak için
temel bir algoritma kullanarak, metindeki ardışık tekrarlanan karakterleri sayı ve karakter kombinasyonlarına
dönüştürür. Bu, metni daha az bellek kullanarak temsil etmeye olanak tanır.

## Proje Adımları

1. **Giriş Metni Belirleme:**
    - Örnek bir giriş metni belirlenir.

2. **Metin Sıkıştırma Fonksiyonu Oluşturma:**
    - `compressText` adlı bir fonksiyon oluşturulur.
    - Bu fonksiyon, verilen bir metni sıkıştırır.
    - Ardışık tekrarlanan karakterleri sayı ve karakter kombinasyonlarına dönüştürerek sıkıştırma işlemi gerçekleştirir.

3. **Test İşlemi:**
    - Örnek bir giriş metni belirlenir.
    - Oluşturulan `compressText` fonksiyonuyla bu metin sıkıştırılır.
    - Sonuç ekrana yazdırılır.
   

    // Metnin ikinci karakterinden başlayarak her karakter için döngü
    // Mevcut karakter önceki karaktere eşitse
    // Sayaç arttırılır
    // Eğer mevcut karakter önceki karakterden farklıysa,
    // önceki karakterin sayısı ve karakteri sıkıştırılmış metne eklenir,
    // sonra sayaç sıfırlanır
    // Döngüden çıktıktan sonra, son karakterin sayısı ve karakteri sıkıştırılmış metne eklenir
    // Sıkıştırılmış metin döndürülür

## Örnek

```java
public static void main(String[]args){
        // Örnek bir giriş metni belirlenir
        String inputText="aaaabbbccdddf";

        // Metin sıkıştırma işlemi yapılır
        String outputText=compressText(inputText);

        // Sonuç ekrana yazdırılır
        System.out.println(outputText);
        }
```

| Sıra | inputs         | outputs  |
|------|----------------|----------|
| 1    | aaaabbbcccccdd | 4a3b5c2d |
| 2    | abbbbbbbccc    | 1a7b3c   |
| 3    | aaaaaaaaaa     | 10a      |
| 4    | aabbbccccccddd | 2a3b6c3d |
*_NOT : Interview Sorusu_*

![ZipAlgoritmasi.gif](ZipAlgoritmasi.gif)
