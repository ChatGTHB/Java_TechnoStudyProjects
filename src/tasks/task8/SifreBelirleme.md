# Kullanıcı Adı ve Şifre Kontrol Programı

Bu program, kullanıcıdan bir kullanıcı adı ve şifre belirlemesini isteyen, şifre girişini doğrulamak için şifreyi iki kez üst üste alan ve ardından kullanıcı adı ve şifre ile giriş yapma işlemi gerçekleştiren bir programdır.

## Program Açıklaması

1. **Kullanıcı Adı ve Şifre Belirleme:**
   - Kullanıcıdan bir kullanıcı adı ve şifre belirlemesini isteyin.
   - Şifreyi doğrulamak için şifreyi iki kez üst üste girmesini isteyin.
   - Eğer şifreler uyuşmuyorsa, kullanıcıya uyarı verip tekrar şifre girişi yapmasını isteyin.

2. **Giriş Yapma:**
   - Kullanıcıya, az önce belirlenen kullanıcı adı ve şifre ile giriş yapması için bir seçenek sunun.
   - Kullanıcı adını girmesini isteyin.
   - Programı bir döngü içinde çalıştırarak, kullanıcıdan şifreyi girmesini isteyin ve bu işlemi 3 kez tekrarlamasına izin verin.
   - Her hatalı girişte kalan hakkını bildirin (3 hakkınız var, 2 hakkınız kaldı, son hakkınız kaldı).

3. **Giriş Kontrolü:**
   - Kullanıcının 3 kez üst üste yanlış giriş yapması durumunda, programı sonlandırın ve kullanıcıya "Üzgünüm, 3 kez üst üste yanlış giriş yaptınız." mesajını gönderin.
   - Eğer giriş doğruysa, kullanıcıya "Başarılı bir şekilde giriş yaptınız, ... kullanıcısı olarak sisteme hoş geldiniz!" mesajını gönderin.

## Tasarım İpuçları

- `Scanner` sınıfını kullanarak kullanıcıdan giriş alabilirsiniz.
- Kullanıcı adını ve şifreyi depolamak için değişkenler kullanabilirsiniz.
- `while` döngüsü ile kullanıcının 3 kez yanlış giriş yapmasına izin verebilirsiniz.
- Şifreleri karşılaştırmak için `equals` metodunu kullanabilirsiniz.
- `System.out.println` kullanarak kullanıcıya mesajlar gönderebilirsiniz.

![SifreBelirleme.gif](SifreBelirleme.gif)