import java.util.Scanner;

public class islemler {
    private static double sayi1, sayi2, sonuc;
    static Scanner scanner = new Scanner(System.in);

    // Toplama işlemini gerçekleştiren metod
    public static void toplama() {
        System.out.println("Toplama İşlemine Hoş Geldiniz!");
        System.out.println("Birinci Sayı:");
        sayi1 = scanner.nextDouble();
        System.out.println("İkinci Sayı:");
        sayi2 = scanner.nextDouble();
        sonuc = sayi1 + sayi2;
        System.out.println("Sonuç: " + formatSonuc(sonuc));
    }

    // Çıkarma işlemini gerçekleştiren metod
    public static void cikarma() {
        System.out.println("Çıkarma İşlemine Hoş Geldiniz!");
        System.out.println("Birinci Sayı:");
        sayi1 = scanner.nextDouble();
        System.out.println("İkinci Sayı:");
        sayi2 = scanner.nextDouble();
        sonuc = sayi1 - sayi2;
        System.out.println("Sonuç: " + formatSonuc(sonuc));
    }

    // Çarpma işlemini gerçekleştiren metod
    public static void carpma() {
        System.out.println("Çarpma İşlemine Hoş Geldiniz!");
        System.out.println("Birinci Sayı:");
        sayi1 = scanner.nextDouble();
        System.out.println("İkinci Sayı:");
        sayi2 = scanner.nextDouble();
        sonuc = sayi1 * sayi2;
        System.out.println("Sonuç: " + formatSonuc(sonuc));
    }

    // Bölme işlemini gerçekleştiren metod
    public static void bolme() {
        System.out.println("Bölme İşlemine Hoş Geldiniz!");
        System.out.println("Birinci Sayı:");
        sayi1 = scanner.nextDouble();
        System.out.println("İkinci Sayı:");
        sayi2 = scanner.nextDouble();
        if (sayi2 == 0) {
            System.out.println("Hata: Sıfıra bölme hatası!");
            return;
        }
        sonuc = sayi1 / sayi2;
        System.out.println("Sonuç: " + formatSonuc(sonuc));
    }

    // Türev hesaplama işlemini gerçekleştiren metod
    public static void turev() {
        System.out.println("Türev Hesaplama İşlemine Hoş Geldiniz!");
        System.out.println("Fonksiyonu ax^n şeklinde giriniz.");
        System.out.print("a değeri: ");
        double a = scanner.nextDouble();
        System.out.print("n değeri: ");
        double n = scanner.nextDouble();
        System.out.print("x değeri: ");
        double x = scanner.nextDouble();

        double sonuc = hesaplaTurev(a, n, x);
        System.out.println("Sonuç: " + sonuc);
    }

    // Verilen değerlerle türev hesaplayan metod
    public static double hesaplaTurev(double a, double n, double x){
        // Türev formülü: n * a * x^(n-1)
        double turevSonuc = n * a * Math.pow(x, n - 1);
        return turevSonuc;
    }

    // İntegral hesaplama işlemini gerçekleştiren metod
    public static void integral() {
        System.out.println("Integral Hesaplama İşlemine Hoş Geldiniz!");
        System.out.println("Fonksiyonu ax^n şeklinde giriniz.");
        System.out.print("a değeri: ");
        double a = scanner.nextDouble();
        System.out.print("n değeri: ");
        double n = scanner.nextDouble();
        System.out.print("x değeri: ");
        double x = scanner.nextDouble();

        double sonuc = hesaplaIntegral(a, n, x);
        System.out.println("Sonuç: " + sonuc);
    }

    // Verilen değerlerle integral hesaplayan metod
    public static double hesaplaIntegral(double a, double n, double x) {
        // İntegral formülü: (a/(n+1)) * x^(n+1)
        double integralSonuc = (a / (n + 1)) * Math.pow(x, n + 1);
        return integralSonuc;
    }

    // Verilen katsayılarla bir polinomun sonucunu hesaplayan metod
    public static void fonksiyon() {
        System.out.println("Fonksiyon Hesaplama İşlemine Hoş Geldiniz!");
        System.out.println("Fonksiyonu ax^2 + bx + c şeklinde giriniz.");
        System.out.print("a değeri: ");
        double a = scanner.nextDouble();
        System.out.print("b değeri: ");
        double b = scanner.nextDouble();
        System.out.print("c değeri: ");
        double c = scanner.nextDouble();
        System.out.print("x değeri: ");
        double x = scanner.nextDouble();

        double sonuc = hesaplaFonksiyon(a, b, c, x);
        System.out.println("Sonuç: " + sonuc);
    }

    // Verilen katsayılarla bir polinomun sonucunu hesaplayan metod
    public static double hesaplaFonksiyon(double a, double b, double c, double x) {
        return a * Math.pow(x, 2) + b * x + c;
    }

    // Verilen noktalar arasındaki parabolün denklemi ve tepe noktasını hesaplayan metod
    public static void parabol() {
        System.out.print("X1'i giriniz: ");
        double x1 = scanner.nextDouble();
        System.out.print("Y1'i giriniz: ");
        double y1 = scanner.nextDouble();

        System.out.print("X2'yi giriniz: ");
        double x2 = scanner.nextDouble();
        System.out.print("Y2'yi giriniz: ");
        double y2 = scanner.nextDouble();

        System.out.print("X3'ü giriniz: ");
        double x3 = scanner.nextDouble();
        System.out.print("Y3'ü giriniz: ");
        double y3 = scanner.nextDouble();

        // Lagrange polinomu kullanarak katsayıları hesapla
        double a = y1 / ((x1 - x2) * (x1 - x3)) + y2 / ((x2 - x1) * (x2 - x3)) + y3 / ((x3 - x1) * (x3 - x2));
        double b = -y1 * (x2 + x3) / ((x1 - x2) * (x1 - x3)) - y2 * (x1 + x3) / ((x2 - x1) * (x2 - x3)) - y3 * (x1 + x2) / ((x3 - x1) * (x3 - x2));
        double c = y1 * x2 * x3 / ((x1 - x2) * (x1 - x3)) + y2 * x1 * x3 / ((x2 - x1) * (x2 - x3)) + y3 * x1 * x2 / ((x3 - x1) * (x3 - x2));

        // Parabol denklemi ve tepe noktasını yazdır
        System.out.println("Kuadratik: y = (" + a + ")x^2 + (" + b + ")x + (" + c + ")");
        System.out.println("Tepe noktası: (x - " + (-b / (2 * a)) + ")^2 + " + ((4 * a * c - b * b) / (4 * a)));
    }

    // Sonucun formatını düzenleyen metod (virgülden sonraki sıfırları siler)
    public static String formatSonuc(double sonuc) {
        String formattedSonuc = String.valueOf(sonuc);
        if (formattedSonuc.contains(".")) {
            formattedSonuc = formattedSonuc.replaceAll("0*$", "").replaceAll("\\.$", "");
        }
        return formattedSonuc;
    }
}
