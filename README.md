# Bilimsel Hesap Makinesi Uygulaması

Bu Java uygulaması, temel aritmetik işlemleri, trigonometrik fonksiyonları, logaritmaları, faktöriyel hesaplamaları, mod alma işlemlerini ve daha fazlasını gerçekleştiren bir matematik kütüphanesini içerir.

## Nasıl Kullanılır

`Main` sınıfındaki `main` metodu, kullanıcıdan bir işlem numarası alır ve bu işleme göre ilgili matematiksel işlemi gerçekleştirir. İşlemler aşağıdaki gibidir:

1. Toplama
2. Çıkarma
3. Çarpma
4. Bölme
5. Üs alma
6. Karekök alma
7. Faktoriyel hesaplama
8. Mod alma
9. Logaritma alma
10. Sinüs alma
11. Cosinus alma
12. Tanjant alma
13. Cotanjant alma
14. Sekant alma
15. Kosekant alma
16. Permütasyon alma
17. Kombinasyon alma
18. Çıkış

Örneğin, kullanıcı 1'i seçerse, toplama işlemi yapılır.

## Giriş Gereksinimleri

- Kullanıcı, işlem numarasını girerek bir işlem seçer.
- Bazı işlemler için ekstra parametreler istenebilir, bu durumda kullanıcı yönergeleri takip etmelidir.

## Çıktı

- Her işlemin sonucu ekrana yazdırılır.
- Hatalı girişler için uygun hata mesajları gösterilir.

## Hata Yönetimi

- Bölme işlemi için sıfıra bölme hatası kontrol edilir.
- Negatif sayılar için karekök alma ve faktöriyel hesaplama işlemlerinde hata kontrolü yapılır.
- Kullanıcı hatalı bir işlem numarası girdiğinde uygun bir hata mesajı gösterilir ve tekrar denemesi istenir.

## Örnek Kod

```java
public class Main {
    public static void main(String[] args) {
        // Main sınıfı, matematiksel işlemleri gerçekleştirmek için Islemler sınıfını kullanır
        Islemler.islemSec();
    }
}
