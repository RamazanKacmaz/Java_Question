package C01_C15;

import java.util.Scanner;

public class C13_EbobEkok {
    /*Soru 22-)
    Kullanıcıdan 2 tamsayı girmesini isteyin, ardından GCD (En Büyük Ortak Bölen) ve LCM'yi bulun (En Küçük Ortak Kat)
    Giriş :
    30 ve 40
    Beklenen Çıktı:
            30 ve 40 için EBOB= 10
    30 ve 40 için EKOK= 120
    ipucu:
    Loopları kullanarak çözebiliriz. İki sayının EKOK'u sayıların çarpımının sayıların EBOB'una bölünerek bulunabilir.*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki tam sayi giriniz...");
        int sayi1 = scanner.nextInt();
        System.out.println("Ikinci sayi :");
        int sayi2 = scanner.nextInt();
        int EBOB = sayi1 ;


        for (int i = 1; i < sayi1 ; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0){

                EBOB = i;
            }
        }
        int EKOK = ((sayi1*sayi2)/EBOB);

        System.out.println(EBOB);
        System.out.println(EKOK);


    }
}
