import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Scanner sınıfı ile kullanıcıdan veri almak için bir nesne oluşturuyoruz.
        Scanner scanner = new Scanner(System.in);
        double sayi1, sayi2,sonuc;
        System.out.println("Bilimsel Hesap Makinesine Hoş Geldiniz! \n" +
                "\nLütfen işlem yapmak istediğiniz işlemi seçiniz." +
                "\n1- Toplama İşlemi" +
                "\n2- Çıkarma İşlemi" +
                "\n3- Çarpma İşlemi" +
                "\n4- Bölme İşlemi" +
                "\n5- Üs Alma İşlemi" +
                "\n6- Karekök Alma İşlemi" +
                "\n7- Faktoriyel Alma İşlemi" +
                "\n8- Mod Alma İşlemi" +
                "\n9- Logaritma Alma İşlemi" +
                "\n10- Sinüs Alma İşlemi" +
                "\n11- Cosinüs Alma İşlemi" +
                "\n12- Tanjant Alma İşlemi" +
                "\n13- Cotanjant Alma İşlemi" +
                "\n14- Secant Alma İşlemi" +
                "\n15- Cosecant Alma İşlemi" +
                "\n16- Permütasyon Alma İşlemi" +
                "\n17- Kombinasyon Alma İşlemi" +
                "\n18- Çıkış Yapma");

        int islem = scanner.nextInt();

        switch (islem) {

            case 1:
                System.out.println("Toplama İşlemine Hoş Geldiniz! \n Lütfen toplamak istediğiniz iki sayıyı giriniz: \n");
                sayi1 = scanner.nextDouble();
                sayi2 = scanner.nextDouble();
                sonuc = sayi1 + sayi2;
                System.out.println("Sonuc: " + sonuc);
                break;

            case 2:
                System.out.println("Çıkarma İşlemine Hoş Geldiniz! \n Lütfen çıkarmak istediğiniz iki sayıyı giriniz: \n");
                sayi1 = scanner.nextDouble();
                sayi2 = scanner.nextDouble();
                sonuc = sayi1 - sayi2;
                System.out.println("Sonuc: " + sonuc);
                break;

            case 3:
                System.out.println("Çarpma İşlemine Hos Geldiniz! \n Lütfen çarpmak istediğiniz iki sayıyı giriniz: \n");
                sayi1 = scanner.nextDouble();
                sayi2 = scanner.nextDouble();
                sonuc = sayi1 * sayi2;
                System.out.println("Sonuc: " + sonuc);
                break;

            case 4:
                System.out.println("Bölme İşlemine Hoş Geldiniz! \n Lütfen bölmek istediğiniz iki sayıyı giriniz: \n");
                sayi1 = scanner.nextDouble();
                sayi2 = scanner.nextDouble();
                sonuc = sayi1 / sayi2;
                System.out.println("Sonuc: " + sonuc);
                break;
                
            case 5:
                System.out.println("Üs Alma İşlemine Hoş Geldiniz! \n Lütfen üs almak istediğiniz iki sayıyı giriniz: \n");
                System.out.println("Taban sayıyı giriniz: ");
                sayi1 = scanner.nextDouble();
                System.out.println("Üs sayıyı giriniz: ");
                sayi2 = scanner.nextDouble(); // Taban sayi 2  Üs alınacak sayı 3
                System.out.println("Sonuc: " + Math.pow(sayi1,sayi2));
                break;
            case 6:
                System.out.println("Karekök Alma İşlemi");
                break;
            case 7:
                System.out.println("Faktoriyel Alma İşlemi");
                break;
            case 8:
                System.out.println("Mod Alma İşlemi");
                break;
            case 9:
                System.out.println("Logaritma Alma İşlemi");
                break;
            case 10:
                System.out.println("Sinüs Alma İşlemi");
                break;
            case 11:
                System.out.println("Cosinüs Alma İşlemi");
                break;
            case 12:
                System.out.println("Tanjant Alma İşlemi");
                break;
            case 13:
                System.out.println("Cotanjant Alma İşlemi");
                break;
            case 14:
                System.out.println("Secant Alma İşlemi");
                break;
            case 15:
                System.out.println("Cosecant Alma İşlemi");
                break;
            case 16:
                System.out.println("Permütasyon Alma İşlemi");
                break;
            case 17:
                System.out.println("Kombinasyon Alma İşlemi");
                break;
            case 18:
                System.out.println("Çıkış Yapma");
                break;
            default:
                System.out.println("Geçersiz işlem!");
                break;
        }

    }
}