# Şifre Yönetici Uygulaması

## Proje Açıklaması
Bu proje, kullanıcıların çeşitli online hesaplarına ait şifreleri güvenli bir şekilde yönetmelerini sağlayan bir şifre yönetici uygulaması geliştirmektir. Kullanıcılar, bu uygulama aracılığıyla şifre ekleyebilecek, ekledikleri şifreleri görüntüleyebilecek ve güvenli bir şekilde saklayabilecektir.

## Proje Özellikleri

### Ana Menü:
- Kullanıcı, programı başlattığında bir ana menü ile karşılaşacaktır.
- Ana menüde "Şifre Ekle", "Şifre Göster" ve "Çıkış" seçenekleri bulunacaktır.

### Şifre Ekle:
- Kullanıcı, "Şifre Ekle" seçeneğini seçtiğinde, uygulama kullanıcıdan aşağıdaki bilgileri alacaktır:
    - Hesap adı (örneğin, Gmail, Facebook)
    - Kullanıcı adı
    - Şifre
- Girilen bilgilerle bir şifre kaydı oluşturularak, bu kayıt uygulama tarafından güvenli bir şekilde saklanacaktır.
- Eklenen şifre kaydının ardından program otomatik olarak sona erecektir.

### Şifre Göster:
- Kullanıcı, "Şifre Göster" seçeneğini seçtiğinde, uygulama kullanıcıdan aşağıdaki bilgiyi alacaktır:
    - Hesap adı
- Girilen hesap adına ait şifre kaydı varsa, bu kayda ait kullanıcı adı ve şifre ekrana yazdırılacaktır.
- Eğer belirtilen hesap adına ait bir kayıt bulunmuyorsa, kullanıcı bilgilendirilecek ve program otomatik olarak sona erecektir.

### Çıkış:
- Kullanıcı, "Çıkış" seçeneğini seçtiğinde, uygulama kapatılacaktır.

## Teknik Detaylar

### Veri Yapıları:
- Şifre kayıtları için `Map<String, Map<String, String>>` kullanılacaktır.
- İlk `String` anahtar, hesap adını temsil eder.
- İkinci `Map` yapısı, kullanıcı adı ve şifreyi içerir.

### Kullanıcı Girişi:
- Kullanıcı girişleri `Scanner` sınıfı ile alınacaktır.
- Kullanıcıdan alınan hesap adları ve bilgiler küçük harfe dönüştürülerek saklanacaktır.

### Harf Duyarlılığı:
- Hesap adlarında ve kullanıcı adlarında harf duyarlılığı olmayacaktır.
- Kullanıcılar büyük veya küçük harf karışımı kullanarak giriş yapabilirler.

### Güvenlik:
- Şifreler ve diğer bilgiler program içinde güvenli bir şekilde saklanacaktır.
- Kullanıcıya, şifreleri güvenli bir şekilde saklamaları konusunda bilgilendirme yapılacaktır.

## Kullanım Senaryosu

1. Kullanıcı programı başlatır.
2. Ana menüde "Şifre Ekle" seçeneğini seçer.
3. Hesap adı, kullanıcı adı ve şifre bilgilerini gireceği bir ekranla karşılaşır.
4. Bilgileri girdikten sonra şifre kaydı oluşturulur ve kullanıcıya başarıyla eklediği bildirilir.
7. Ana menüde "Şifre Göster" seçeneğini seçer.
8. Hesap adı sorulur, kullanıcı girişi yapar.
9. Eğer hesaba ait bir kayıt varsa, kullanıcı adı ve şifre ekrana yazdırılır.
10. Eğer hesaba ait bir kayıt yoksa, kullanıcı bilgilendirilir ve programdan çıkar.

![PasswordManager.gif](PasswordManager.gif)