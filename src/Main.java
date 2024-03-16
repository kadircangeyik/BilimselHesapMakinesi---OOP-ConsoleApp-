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
                System.out.println("Karakök alma İşlemine Hoş Geldiniz! \nLütfen Karakök almaK istediğiniz sayıyı giriniz: \n");
                sayi1 = scanner.nextDouble();
                System.out.println("Sonuc: " + Math.sqrt(sayi1));
                break;
            case 7:
                int faktoriyel=1;
                System.out.println("Faktoriyel hesaplama işlemine Hoş Geldiniz! \n Lütfen faktoriyel hesaplamak istediğiniz sayıyı giriniz: \n");
                sayi1 = scanner.nextDouble();
                for (int i=1; i<=sayi1; i++ )
                {
                    faktoriyel *= i;
                }
                System.out.println("Sonuc: " + faktoriyel);
                break;
            case 8:
                System.out.println("Mod alma işlemine Hoş Geldiniz! \nLütfen Mod almaK istediğiniz sayıyı giriniz: \n");
                sayi1 = scanner.nextDouble();
                sayi2 = scanner.nextDouble();
                sonuc = sayi1 % sayi2;
                System.out.println("Sonuc: " + sonuc);
                break;
            case 9:
                    System.out.println("Logaritma hesaplama işlemine Hoş Geldiniz! \n1 -Doğal Logaritma\n2-İkili Logaritma\n3-Adi Logaritma");
                    int logaritmaTürü = scanner.nextInt();
                    switch (logaritmaTürü) {
                        case 1:
                            System.out.println("Doğal Logaritma Alma İşlemi");
                            System.out.println("Lütfen logaritmasını almak istediğiniz sayıyı giriniz: ");
                            sayi1 = scanner.nextDouble();
                            System.out.println("Sonuc: " + Math.log(sayi1));
                            break;
                        case 2:
                            System.out.println("İkili Logaritma Alma İşlemi");
                            System.out.println("Lütfen logaritmasını almak istediğiniz sayıyı giriniz: ");
                            sayi1 = scanner.nextDouble();
                            System.out.println("Sonuc: " + Math.log10(sayi1));
                            break;
                        case 3:
                            System.out.println("Adi Logaritma Alma İşlemi");
                            System.out.println("Lütfen logaritmasını almak istediğiniz sayıyı giriniz: ");
                            sayi1 = scanner.nextDouble();
                            System.out.println("Lütfen logaritma tabanını giriniz: ");
                            sayi2 = scanner.nextDouble();
                            System.out.println("Sonuc: " + (Math.log(sayi1) / Math.log(sayi2)));
                            break;
                    }
            case 10:
                System.out.println("Sinüs hesaplama işlemine Hoş Geldiniz! \nLütfen Açı derecesini giriniz: \n");
                sayi1 = scanner.nextDouble();
                System.out.println("Sonuc: " + Math.sin(sayi1));
                break;

            case 11:
                System.out.println("Cosinus Alma İşlemine Hoş Geldiniz! \nLütfen Cosinus Almak İstediğiniz sayıyı giriniz: \n");
                sayi1 = scanner.nextDouble();
                System.out.println("Sonuc: " + Math.cos(sayi1));
                break;

           //CASE 12 HATALI
            case 12:
                System.out.println("Tanjant Alma İşlemine Hoş Geldiniz! \nLütfen Tanjant almak istediğiniz açıyı derece cinsinden giriniz: \n");
                double derece = scanner.nextDouble();
                double radyan = Math.toRadians(derece);
                double tanjant = Math.tan(radyan);
                System.out.println("Tanjant " + derece + " derecenin değeri: " + tanjant);
                break;
            case 13:
                System.out.println("Cotanjant alma İşlemine Hoş Geldiniz! \nLütfen açıyı derece cinsinden giriniz:\n");
                System.out.println("Lütfen açıyı derece cinsinden giriniz:");
                sayi1 = scanner.nextDouble();
                double tan = Math.tan(Math.toRadians(sayi1));
                if (tan != 0) {
                    double cotan = 1 / tan;
                    System.out.println("Cotanjant " + sayi1 + " derecenin değeri: " + cotan);
                } else {
                    System.out.println("Tanjant değeri sıfır olduğu için cotanjant hesaplanamaz.");
                }
                break;
            case 14:
                System.out.println("Secant alma işlemine hoş geldiniz! \nLütfen secant almak istediğiniz sayıyı giriniz: \n");
                sayi1 = scanner.nextDouble();
                System.out.println("Sonuc: " + 1 / Math.tan(Math.toRadians(sayi1)));
                break;
            case 15:
                System.out.println("Tanjant alma İşlemine Hoş Geldiniz! \nLütfen açıyı derece cinsinden giriniz:");
                sayi1 = scanner.nextDouble();
                double sin = Math.sin(Math.toRadians(sayi1));
                if (sin != 0) {
                    double cosecant = 1 / sin;
                    System.out.println("Cosecant " + sayi1 + " derecenin değeri: " + cosecant);
                } else {
                    System.out.println("Sinüs değeri sıfır olduğu için cosecant hesaplanamaz.");
                }
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