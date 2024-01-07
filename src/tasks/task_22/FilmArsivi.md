# Film Arşivi Projesi

Bu proje, kullanıcıdan alınan film bilgilerini saklamak ve daha sonra bu bilgileri listeleyerek belirli bir filmi sorgulama imkanı sunan bir film arşivi uygulamasını içermektedir. Java programlama dilinde yazılmış olan bu proje, HashMap veri yapısını kullanarak film bilgilerini depolamaktadır.

## Proje Detayları

### `FilmArsiv` Sınıfı

Bu sınıf, film arşivi uygulamasının temel fonksiyonlarını içermektedir. Sınıfın `main` metodu kullanıcıya devam etmek isteyip istemediğini sormakta ve kullanıcının isteğine göre film bilgilerini almaktadır.

### Film Bilgilerinin Saklanması

Film bilgileri, `filmKutuphanesi` adlı bir HashMap içinde depolanmaktadır. Her bir film, film adıyla ilişkilendirilmiş bir alt HashMap içinde türü, yönetmeni ve yayın yılı gibi bilgilerle temsil edilmektedir. Her bir film nesnesi, HashMap<String, Map<String, String>> yapısında bir koleksiyona eklenmelidir. Bu koleksiyon, **_film adını anahtar (key)_** olarak ve **_diğer bilgileri içeren başka bir HashMap nesnesini değer (value)_** olarak içermelidir. Bu sayede her film, film adıyla ilişkilendirilmiş tüm bilgileri içeren bir yapıda saklanacaktır.

### Kullanıcı Girişi

Kullanıcıya devam etmek isteyip istemediğini sormaktadır. Eğer kullanıcı "Evet" derse, film bilgilerini sırayla sormaktadır. Her bir bilgi alındıktan sonra kullanıcıya devam etmek isteyip istemediği tekrar sorulmaktadır.

### Film Bilgilerinin Listelenmesi

Tüm film bilgileri, kullanıcıya daha sonra gösterilmek üzere ekrana yazdırılmaktadır. Her film, film adıyla ilişkilendirilmiş HashMap içindeki bilgilerle birlikte liste halinde görüntülenmektedir.

### Film Sorgulama

Kullanıcıdan bir film adı alınarak, bu film adının arşivde bulunup bulunmadığı kontrol edilmekte ve varsa ilgili film bilgileri ekrana yazdırılmaktadır.

## Kullanım

1. Program başlatıldığında, kullanıcıya film eklemek isteyip istemediği sorulur.
2. Eğer kullanıcı "Evet" derse, film bilgileri sırayla sorulur ve arşive eklenir.
3. Eğer kullanıcı "Hayır" derse, program film bilgilerini almaya son verir.
4. Tüm film bilgileri ekrana yazdırılır.
5. Kullanıcıdan bir film adı istenir.
6. Girilen film adı arşivde varsa ilgili film bilgileri ekrana yazdırılır, yoksa "Bu film bulunamadı." mesajı görüntülenir.

## Notlar

- Program, kullanıcıdan alınan bilgileri doğrudan ekrana yazdırmaktadır. Daha gelişmiş bir kullanıcı arayüzü için geliştirmeler yapılabilir.
- Film bilgileri, program sonlandırıldığında kaybolur. Kalıcı bir veritabanı veya dosya sistemi entegrasyonu eklemek, verilerin saklanmasını geliştirebilir.

![FilmArsiv.gif](FilmArsiv.gif)