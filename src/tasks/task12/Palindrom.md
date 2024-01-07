# Palindrom Kontrol Programı

Palindrom, tersten de düzden de yazılışı aynı olan ifadelerdir. Girilen bir stringin palindrom olup olmadığını test eden programı geliştiriniz.

## Program Açıklaması

1. Kullanıcıdan bir string girişi alınacak.
2. Girilen stringin palindrom olup olmadığını kontrol edecek bir fonksiyon oluşturun.
3. Palindrom kontrolü için girilen stringin normal ve ters yöndeki hallerini karşılaştırın.
4. Eğer string palindrom ise, kullanıcıya "Girilen string bir palindromdur." mesajını gösterin. Değilse "Girilen string bir palindrom değildir." mesajını gösterin.

## Fonksiyon Tanımlaması

### `isPalindrom(String str): Boolean`

1. Verilen stringin normal ve ters yöndeki hallerini karşılaştırarak palindrom olup olmadığını kontrol eder.
2. Eğer palindrom ise `true`, değilse `false` döndürür.

## Örnek Kullanım
input : `Kayak`
output: `Girilen ifade bir palindromdur`

input : `Müdür müdür müdür?`
output: `Girilen ifade bir palindrom değildir`

input : `Oreo`
output: `Girilen ifade bir palindrom değildir`

![Palindrom.gif](Palindrom.gif)