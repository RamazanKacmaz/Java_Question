package C76_C90;

import java.util.Scanner;

public class C84_While_Loop {
    public static void main(String[] args) {

        /*Soru 4- Kullanicidan toplanmak uzere pozitif tamsayilar isteyin Kullaniciya bitirmek
        istediginde 0'a basmasini soyleyin
        Kullanici bitirmek istediginde toplam kac adet pozitif tam sayi girdiginive
        bunlarin toplaminin kac oldugunu yazdirin
        Kullanici negatif sayi girerse "negatif sayi kullanamazsiniz " yazdirin bu
        negatif sayiyi sayi adedine ve toplama eklemeyin*/

        Scanner scanner ;
        int sayac = 0;
        int toplam = 0;
        int girilensayi = 9;

        while (girilensayi != 0){
            scanner = new Scanner(System.in);
            System.out.println("lütfen toplanmak uzere sayi gitniz");
            girilensayi = scanner.nextInt();

            if (girilensayi != 0){
                toplam += girilensayi;
                sayac++;
            }
        }

        System.out.println(sayac);
        System.out.println(toplam);
    }

}
