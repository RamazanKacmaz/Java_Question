package C76_C90;

import java.util.Scanner;

public class C85_While_Loop {
    public static void main(String[] args) {

       /* Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin. While loop
        kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method
        olusturun.*/

      Scanner scanner = new Scanner(System.in);
      System.out.println(" sayi giriniz...");
      double sayi = scanner.nextDouble();

        System.out.println("us gir");
        int us = scanner.nextInt();

        ushesapla(sayi,us);



    }

    private static void ushesapla(double sayi , int bes) {

        double sonuc = 1;

        while (bes > 0){
            sonuc *= sayi;
            bes--;
        }
        System.out.println(sonuc);
    }
}
