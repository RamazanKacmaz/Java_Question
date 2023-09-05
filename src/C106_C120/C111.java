package C106_C120;

import java.util.Scanner;

public class C111 {
    /* Basit bir 5 ürünlü manav alisveris programi yaziniz.

   1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
   2. Adim : Baska bir urun almak isteyip istemedigini sor. istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir. Bu islemi alisverisi
    bitirmek isteyene kadar tekrarla.
            3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
   4. Adim : Alisveris bitince toplam odemesi gereken tutari goster*/
    static Scanner scanner = new Scanner(System.in);
    public static String istek;
    public static int toplamFiyat = 0;

    public static void main(String[] args) {
        giris();


    }

    private static void giris() {
        System.out.println("--------  Manavımıza Hoşgeldiniz  -------");
        System.out.println("---BUGUN LISTEMİZDEKİ URUNLERİMİZ---\n" +
                "1. Domates.....20 TL\n" +
                "2. Salatalık...20 TL\n" +
                "3. Karpuz......12 TL\n" +
                "4. Patates.....25 TL\n" +
                "5. Soğan.......15 TL\n" +
                "istediğiniz ürünün başındaki numarayı giriniz: ");
        String secim = scanner.next();
        switch (secim) {
            case "1":
                domates();
            case "2":
                salatalik();
            case "3":
                karpuz();
            case "4":
                patates();
            case "5":
                sogan();
            default:
                System.out.println("Hatalı giriş yaptınız.");
                giris();
                break;
        }
        
    }

    private static void sogan() {
    }

    private static void patates() {
    }

    private static void karpuz() {
    }

    private static void salatalik() {
    }

    private static void domates() {
        System.out.println("İstediğiniz domates miktarını giriniz:");
        int miktar = scanner.nextInt();
        int alisverismiktari =miktar * 20;
        toplamFiyat += alisverismiktari;
        System.out.println("Borcunuz: " + alisverismiktari);
        System.out.println("Başka bir isteğiniz var mı? Evet için 'E'; Hayır için 'H'yi seçiniz... ");
        istek = scanner.next();
        if (istek.equalsIgnoreCase("E")) giris();
        else kasa();
    }

    private static void kasa() {
        System.out.println("Bizi tercih ettiğiniz için teşekkürler\n" +
                "toplam borcunuz: " + toplamFiyat);
        System.exit(0);
    }
}
