import java.util.Scanner;

public class islemler {
    private static double sayi1, sayi2, sonuc;
    static Scanner scanner = new Scanner(System.in);

    public static void toplama() {

        System.out.println("Toplama İşlemine Hoş Geldiniz!");
        System.out.println("Lütfen toplamak istediğiniz iki sayıyı giriniz: (Bir Üst Menüye Dönmek İçin B - Çıkış Yapmak İçin C)");
        sayi1 = scanner.nextDouble();
        sayi2 = scanner.nextDouble();
        sonuc = sayi1 + sayi2;
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    public static void cikarma() {
        System.out.println("Çıkarma İşlemine Hoş Geldiniz!");
        System.out.println("Lütfen çıkarmak istediğiniz iki sayıyı giriniz:");
        sayi1 = scanner.nextDouble();
        sayi2 = scanner.nextDouble();
        sonuc = sayi1 - sayi2;
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    public static void carpma() {
        System.out.println("Çarpma İşlemine Hoş Geldiniz!");
        System.out.println("Lütfen çarpmak istediğiniz iki sayıyı giriniz:");
        sayi1 = scanner.nextDouble();
        sayi2 = scanner.nextDouble();
        sonuc = sayi1 * sayi2;
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    public static void bolme() {
        System.out.println("Bölme İşlemine Hoş Geldiniz!");
        System.out.println("Lütfen bölmek istediğiniz iki sayıyı giriniz:");
        sayi1 = scanner.nextDouble();
        sayi2 = scanner.nextDouble();
        if (sayi2 == 0) {
            System.out.println("Hata: Sıfıra bölme hatası!");
            return;
        }
        sonuc = sayi1 / sayi2;
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    public static void usAlma() {
        System.out.println("Üs Alma İşlemine Hoş Geldiniz!");
        System.out.println("Lütfen üs almak istediğiniz iki sayıyı giriniz:");
        System.out.println("Taban sayıyı giriniz:");
        sayi1 = scanner.nextDouble();
        System.out.println("Üs sayıyı giriniz:");
        sayi2 = scanner.nextDouble();
        sonuc = Math.pow(sayi1, sayi2);
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    public static void karekokAlma() {
        System.out.println("Karekök Alma İşlemine Hoş Geldiniz!");
        System.out.println("Lütfen karekök almak istediğiniz sayıyı giriniz:");
        sayi1 = scanner.nextDouble();
        if (sayi1 < 0) {
            System.out.println("Hata: Negatif sayının karekökü alınamaz!");
            return;
        }
        sonuc = Math.sqrt(sayi1);
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    public static void faktoriyel() {
        System.out.println("Faktoriyel Alma İşlemine Hoş Geldiniz!");
        System.out.println("Lütfen faktoriyel hesaplamak istediğiniz sayıyı giriniz:");
        int sayi = scanner.nextInt();
        if (sayi < 0) {
            System.out.println("Hata: Negatif sayının faktoriyeli hesaplanamaz!");
            return;
        }
        sonuc = 1;
        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    public static void modAlma() {
        System.out.println("Mod Alma İşlemine Hoş Geldiniz!");
        System.out.println("Lütfen mod almak istediğiniz iki sayıyı giriniz:");
        sayi1 = scanner.nextDouble();
        sayi2 = scanner.nextDouble();
        sonuc = sayi1 % sayi2;
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    public static void logaritmaAlma() {
        System.out.println("Logaritma Alma İşlemine Hoş Geldiniz!");
        System.out.println("Lütfen logaritma türünü seçiniz:");
        System.out.println("1 - Doğal Logaritma");
        System.out.println("2 - İkili Logaritma");
        System.out.println("3 - Adi Logaritma");
        int logaritmaTürü = scanner.nextInt();
        switch (logaritmaTürü) {
            case 1:
                System.out.println("Doğal Logaritma Alma İşlemi");
                System.out.println("Lütfen logaritmasını almak istediğiniz sayıyı giriniz:");
                sayi1 = scanner.nextDouble();
                sonuc = Math.log(sayi1);
                System.out.println("Sonuc: " + formatSonuc(sonuc));
                break;
            case 2:
                System.out.println("İkili Logaritma Alma İşlemi");
                System.out.println("Lütfen logaritmasını almak istediğiniz sayıyı giriniz:");
                sayi1 = scanner.nextDouble();
                sonuc = Math.log10(sayi1);
                System.out.println("Sonuc: " + formatSonuc(sonuc));
                break;
            case 3:
                System.out.println("Adi Logaritma Alma İşlemi");
                System.out.println("Lütfen logaritmasını almak istediğiniz sayıyı ve tabanı giriniz:");
                sayi1 = scanner.nextDouble();
                sayi2 = scanner.nextDouble();
                sonuc = Math.log(sayi1) / Math.log(sayi2);
                System.out.println("Sonuc: " + formatSonuc(sonuc));
                break;
            default:
                System.out.println("Geçersiz logaritma türü!");
        }
    }

    public static void sinAlma() {
        System.out.println("Sinüs Alma İşlemine Hoş Geldiniz!");
        System.out.println("Lütfen açı derecesini giriniz:");
        double derece = scanner.nextDouble();
        sonuc = Math.sin(Math.toRadians(derece));
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    public static void cosAlma() {
        System.out.println("Cosinus Alma İşlemine Hoş Geldiniz!");
        System.out.println("Lütfen açı derecesini giriniz:");
        double derece = scanner.nextDouble();
        sonuc = Math.cos(Math.toRadians(derece));
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    public static void tanAlma() {
        System.out.println("Tanjant Alma İşlemine Hoş Geldiniz!");
        System.out.println("Lütfen açı derecesini giriniz:");
        double derece = scanner.nextDouble();
        sonuc = Math.tan(Math.toRadians(derece));
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    public static void cotanAlma() {
        System.out.println("Cotanjant Alma İşlemine Hoş Geldiniz!");
        System.out.println("Lütfen açı derecesini giriniz:");
        double derece = scanner.nextDouble();
        double tanDegeri = Math.tan(Math.toRadians(derece));
        if (tanDegeri != 0) {
            sonuc = 1 / tanDegeri;
            System.out.println("Sonuc: " + formatSonuc(sonuc));
        } else {
            System.out.println("Tanjant değeri sıfır olduğu için cotanjant hesaplanamaz.");
        }
    }

    public static void secantAlma() {
        System.out.println("Secant Alma İşlemine Hoş Geldiniz!");
        System.out.println("Lütfen açı derecesini giriniz:");
        double derece = scanner.nextDouble();
        sonuc = 1 / Math.cos(Math.toRadians(derece));
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    public static void cosecantAlma() {
        System.out.println("Cosecant Alma İşlemine Hoş Geldiniz!");
        System.out.println("Lütfen açı derecesini giriniz:");
        double derece = scanner.nextDouble();
        double sinDegeri = Math.sin(Math.toRadians(derece));
        if (sinDegeri != 0) {
            sonuc = 1 / sinDegeri;
            System.out.println("Sonuc: " + formatSonuc(sonuc));
        } else {
            System.out.println("Sinüs değeri sıfır olduğu için cosecant hesaplanamaz.");
        }
    }

    public static void permutasyonAlma() {
        System.out.println("Permütasyon Alma İşlemine Hoş Geldiniz!");
    }

    public static void kombinasyonAlma() {
        System.out.println("Kombinasyon Alma İşlemine Hoş Geldiniz!");
    }
    public static String formatSonuc(double sonuc) {
        String formattedSonuc = Double.toString(sonuc);
        if (formattedSonuc.contains(".")) {
            formattedSonuc = formattedSonuc.replaceAll("0*$", "").replaceAll("\\.$", "");
        }
        return formattedSonuc;
    }
}
