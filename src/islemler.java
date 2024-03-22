import java.util.Scanner;

public class islemler {
    private static double sayi1, sayi2, sonuc;
    static Scanner scanner = new Scanner(System.in);

    public static void toplama() {
        System.out.println("Toplama İşlemine Hoş Geldiniz!");
        System.out.println("Birinci Sayi:");
        sayi1 = scanner.nextDouble();
        System.out.println("İkinci Sayi:");
        sayi2 = scanner.nextDouble();
        sonuc = sayi1 + sayi2;
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    public static void cikarma() {
        System.out.println("Çıkarma İşlemine Hoş Geldiniz!");
        System.out.println("Birinci Sayi:");
        sayi1 = scanner.nextDouble();
        System.out.println("İkinci Sayi:");
        sayi2 = scanner.nextDouble();
        sonuc = sayi1 - sayi2;
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    public static void carpma() {
        System.out.println("Çarpma İşlemine Hoş Geldiniz!");
        System.out.println("Birinci Sayi:");
        sayi1 = scanner.nextDouble();
        System.out.println("İkinci Sayi:");
        sayi2 = scanner.nextDouble();
        sonuc = sayi1 * sayi2;
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    public static void bolme() {
        System.out.println("Bölme İşlemine Hoş Geldiniz!");
        System.out.println("Birinci Sayi:");
        sayi1 = scanner.nextDouble();
        System.out.println("Birinci Sayi:");
        sayi2 = scanner.nextDouble();
        if (sayi2 == 0) {
            System.out.println("Hata: Sıfıra bölme hatası!");
            return;
        }
        sonuc = sayi1 / sayi2;
        System.out.println("Sonuc: " + formatSonuc(sonuc));
    }

    //Samet
    public static void turev() {
        Scanner input = new Scanner(System.in);
        System.out.println("f(x)=c.x^n türevini alma programı ");
        System.out.println("katsayi giriniz (c) = ");
        int katsayi = input.nextInt();
        if (katsayi == 0) {
            System.out.println("f(x)=" + katsayi + "*x^n ise f(x)=0");
            System.out.println("f'(x)=0");
        } else {
            System.out.println("us giriniz(n)=");
            int us = input.nextInt();
            System.out.println("f(x)=" + katsayi + "*x^" + us);
            System.out.println("f'(x)=" + (katsayi * us) + "*x^" + (us - 1));

        }
    }


    //Serhat
    public static void integral() {

    }

    //Kadir
    public static void fonksiyon() {

    }

    //Kaan
    public static void parabol() {

    }
    public static String formatSonuc(double sonuc) {
        String formattedSonuc = String.valueOf(sonuc);
        if (formattedSonuc.contains(".")) {
            formattedSonuc = formattedSonuc.replaceAll("0*$", "").replaceAll("\\.$", "");
        }
        return formattedSonuc;
    }
}
