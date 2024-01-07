# Su Sıcaklığı Projesi

## Problem

Sıcaklığına bağlı olarak suyun fiziksel halini belirleyin (gaz, sıvı veya katı).

## Analiz

Sıcaklık 0 °C'nin altında ise buzdur, dolayısıyla katıdır. 100 °C'nin üzerinde ise gazdır. Aksi halde sıvıdır.

## Tasarım

1. **Değişkenleri Tanımlayın:**
    - `su_sicakligi` (integer)

2. **Kullanıcıdan Girdi Alın:**
    - `su_sicakligi` (integer)

3. **Suyun Halini Belirleyin:**
    - Eğer `su_sicakligi` 0 °C'nin altındaysa, "Su katı haldedir."
    - Eğer `su_sicakligi` 0 ile 100 °C arasındaysa, "Su sıvı haldedir."
    - Aksi halde, "Su gaz halindedir."

4. **Çıktıyı Gösterin:**
    - Örneğin:
        - Eğer `su_sicakligi` -5 ise, çıktı "Su katı haldedir."
        - Eğer `su_sicakligi` 25 ise, çıktı "Su sıvı haldedir."
        - Eğer `su_sicakligi` 105 ise, çıktı "Su gaz halindedir."

![SuyunHalleri.gif](SuyunHalleri.gif)