package C01_C15;

import java.util.Scanner;

public class C12_Interwiev {

    /*Soru 21-)  ---> Mülakat Sorusu / Interview Sorusu / Leak Year
    Bir aydaki gün sayısını bulmak için bir Java programı yazın

    Örnek:
    Bir ay numarası girin: 2
    Bir yıl girin: 2016
    Şubat 2016'da 29 gün vardır
    ipucu:
    Switch Case kullanarak çözebiliriz. Şubat ayı senelere göre farklılık gösterir. Bunu çözmek için Şubat ayı için method kullanmamız gerekiyor!
    Artık yıl ile ilgili olarak NOT düşeyim değerli arkadaşlar!
    ipucu2:
    ARTIK YILI BULABİLMENİZ İÇİN İKİ KOŞULU GÖZ ÖNÜNDE BULUNDURUN!:
            1-) Bir yılın son iki rakamı "00" değilse ve bu sayı 4 e tam bölünebiliyorsa bu yıl artık yıldır.
            Mesela 2008 yılı artık yıldır. Son iki rakamı "00" değildir ve 4 e bölünebilen bir sayıdır.
            2-) Bir yılın son iki rakamı "00" ise ve bu sayı 400 e tam bölünüyorsa, yine bu yıl yine artık yıldır.
    Mesela 2000 yılı artık yıldır.Son iki rakamı "00" ve 400 e bölünebilen bir sayıdır.*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir ay numarasi giriniz...");
        int ay = scanner.nextInt();
        System.out.println("Lütfen yil yaziniz");
        int yil = scanner.nextInt();

        switch (ay) {
            case 1:
                System.out.println("Ocak " + yil + "'de 31 gun var");
                break;
            case 2:
                artikyil(yil);
                break;
            case 3:
                System.out.println("Mart " + yil + "'da 31 gun var");
                break;
            case 4:
                System.out.println("Nisan " + yil + "'da 30 gun var");
                break;
            case 5:
                System.out.println("Mayis " + yil + "'da 31 gun var");
                break;
            case 6:
                System.out.println("Haziran " + yil + "'da 30 gun var");
                break;
            case 7:
                System.out.println("Temmuz " + yil + "'da 31 gun var");
                break;
            case 8:
                System.out.println("Agustos " + yil + "'da 31 gun var");
                break;
            case 9:
                System.out.println("Eylül " + yil + "'da 30 gun var");
                break;
            case 10:
                System.out.println("Ekim " + yil + "'da 31 gun var");
                break;
            case 11:
                System.out.println("Kasim " + yil + "'da 30 gun var");
                break;
            case 12:
                System.out.println("Aralik " + yil + "'da 31 gun var");
                break;
            default:
                System.out.println(ay + "bir ay degil , yanlis girdiniz");


        }


    }

    private static void artikyil(int yil) {
        if ((yil%4 == 0 && yil%100 !=0) || (yil%100 == 0 && yil%400 ==0)){
            System.out.println(yil + " artik yildir " + " Subat " + yil + "de 29 gun vardir");
        }else {
            System.out.println("Subat" + yil + "'da 28 gun vardir");
        }
    }
}
