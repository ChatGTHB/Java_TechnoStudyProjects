# İki Sayı Dizisini Birleştirme Projesi

Bu proje, kullanıcıdan alınan iki diziyi birleştirerek, tekrar eden elemanları çıkartmayı amaçlamaktadır. Program, bu iki diziyi birleştirip tekrar eden elemanları tek bir dizi içinde tutacak ve sonucu kullanıcıya gösterecektir.

## Program Açıklaması

1. **Kullanıcıdan İki Dizi Alın:**
    - Kullanıcıdan iki farklı dizi girişi istenir.
    - Diziler, virgülle ayrılmış elemanlar şeklinde girilmelidir (örneğin: 1,2,3,4).

2. **Dizileri Birleştir:**
    - İki diziyi birleştirip tekrar eden elemanları çıkartın.
    - Birleştirilmiş diziyi oluşturun.

3. **Sonucu Kullanıcıya Göster:**
    - Elde edilen birleştirilmiş diziyi ekrana yazdırın.
    - Kullanıcıya sonucu gösterin.

## Analiz

Birleştirilmiş diziyi oluşturmak için, her iki diziyi birleştirmek ve ardından tekrar eden elemanları çıkartmak gerekmektedir. Bu işlem sırasında veri türleri uyumlu olmalıdır.

## Tasarım

1. Değişkenleri tanımlayın:
    - `array1` ve `array2` adında iki dizi değişkeni.
    - `mergedArray` adında birleştirilmiş diziyi tutacak bir değişken.

2. Kullanıcıdan girdileri alın:
    - `array1` ve `array2` dizilerini kullanıcıdan alın.

3. Dizileri birleştirin ve tekrar eden elemanları çıkartın:
    - İki diziyi birleştirin ve tekrar eden elemanları kaldırın.

4. Sonucu kullanıcıya gösterin:
    - Elde edilen birleştirilmiş diziyi ekrana yazdırın.

## Örnek Çalışma

**inputs:**
1. Dizi Elemanlarını Girin: 1,2,3,4,5,99,100
2. Dizi Elemanlarını Girin: 3,5,8,9,85,100 

**output:**
3. Birleştirilmiş Dizi: 1,2,3,4,5,8,9,85,99,100

![DiziBirlestirme.gif](DiziBirlestirme.gif)