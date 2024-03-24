import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean devamEdilsinMi = false;

        // Kullanıcıya hoş geldiniz mesajını ve menü seçeneklerini göster
        System.out.println("Bilimsel Hesap Makinesine Hoş Geldiniz!\n" +
                "1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme İşlemi\n" +
                "5- Türev Hesaplama\n" +
                "6- İntegral Hesaplama\n" +
                "7- Fonksiyon Hesaplama\n" +
                "8- Parabol Hesaplama\n" +
                "9- Çıkış Yap\n" +
                "\n" +
                "Lütfen yapmak istediğiniz işlemi seçiniz: ");

        // Kullanıcının seçtiği işlemi al
        int islem = scanner.nextInt();

        // Kullanıcının işlem seçeneğine göre işlem yap
        do {
            switch (islem) {
                case 1 -> islemler.toplama(); // Toplama işlemini çağır
                case 2 -> islemler.cikarma(); // Çıkarma işlemini çağır
                case 3 -> islemler.carpma(); // Çarpma işlemini çağır
                case 4 -> islemler.bolme();  // Bölme işlemini çağır
                case 5 -> islemler.turev();  // Türev hesaplama işlemini çağır
                case 6 -> islemler.integral(); // İntegral hesaplama işlemini çağır
                case 7 -> islemler.fonksiyon(); // Fonksiyon hesaplama işlemini çağır
                case 8 -> islemler.parabol(); // Parabol hesaplama işlemini çağır
                case 9 -> {
                    System.out.println("Çıkış Yapılıyor..."); // Çıkış mesajı
                    return;
                }
                default -> {
                    System.out.println("Geçersiz işlem! Lütfen tekrar deneyin:"); // Geçersiz işlem mesajı
                    islem = scanner.nextInt(); // Yeniden işlem seç
                    devamEdilsinMi = false;
                }
            }

        } while (!devamEdilsinMi);
    }
}
