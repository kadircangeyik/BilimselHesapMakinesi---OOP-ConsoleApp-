import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean devamEdilsinMi = false;
        // Dosya okuma işlemi
        String dosyaYolu = "strings.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(dosyaYolu))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Tüm satırları ekrana yaz
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        int islem = scanner.nextInt();
        // İşlem numarasına göre işlemi yap
        do {
            switch (islem) {
                case 1 -> islemler.toplama();
                case 2 -> islemler.cikarma();
                case 3 -> islemler.carpma();
                case 4 -> islemler.bolme();
                case 5 -> islemler.usAlma();
                case 6 -> islemler.karekokAlma();
                case 7 -> islemler.faktoriyel();
                case 8 -> islemler.modAlma();
                case 9 -> islemler.logaritmaAlma();
                case 10 -> islemler.sinAlma();
                case 11 -> islemler.cosAlma();
                case 12 -> islemler.tanAlma();
                case 13 -> islemler.cotanAlma();
                case 14 -> islemler.secantAlma();
                case 15 -> islemler.cosecantAlma();
                case 16 -> islemler.permutasyonAlma();
                case 17 -> islemler.kombinasyonAlma();
                case 18 -> {
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
