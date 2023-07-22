package C16_C30;

import java.util.Scanner;

public class C17_MükemmelSayi {
   /* Soru 26-)
    Sayının Mükemmel sayı olup olmadığını kontrol eden kodu yazalım.
            NOT:  Kendisi hariç, pozitif bölenlerinin toplamı o sayıya eşitse, bu tür sayılar Mükemmel Sayı olabilir.
    Örnek:
    Giriş :6
    Çıkış: 6 Mükemmel Sayıdır
    Giriş :7
    Çıkış:7 Mükemmel Sayı Değildir
    ipucu: For Loop kullanarak ve belki biraz da if else yardımı ile bu soruyu çözebilirsiniz :wink:*/
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Lütfen bir sayi yazin ve mukemmel bir sayi olup olmadigini igrenin..");
       int mukemmel = scanner.nextInt();
       int toplam = 0;

       for (int i = 1; i < mukemmel ; i++) {

           if (mukemmel % i == 0){
               toplam += i;
           }

       }

       if (toplam == mukemmel){
           System.out.println("mükemmel");
       }else {
           System.out.println("degil");
       }
   }
}
