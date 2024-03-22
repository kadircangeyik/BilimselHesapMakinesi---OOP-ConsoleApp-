import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean devamEdilsinMi = false;

        System.out.println("Bilimsel Hesap Makinesine Hoş Geldiniz! /n" +
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

        int islem = scanner.nextInt();
        // İşlem numarasına göre işlemi yap
        do {
            switch (islem) {
                case 1 -> islemler.toplama();
                case 2 -> islemler.cikarma();
                case 3 -> islemler.carpma();
                case 4 -> islemler.bolme();
                case 5 -> islemler.turev();
                case 6 -> islemler.integral();
                case 7 -> islemler.fonksiyon();
                case 8 -> islemler.parabol();
                case 9 -> {
                    System.out.println("Çıkış Yapılıyor...");
                    return;
                }
                default -> {
                    System.out.println("Geçersiz işlem! Lütfen tekrar deneyin:");
                    islem = scanner.nextInt();
                    devamEdilsinMi = false;
                }

        }

        }while (!devamEdilsinMi);
    }
}
