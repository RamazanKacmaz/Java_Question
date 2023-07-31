package C76_C90;

import java.util.Scanner;

public class C82_While_Loop {

   // Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.
   public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);
       System.out.println("Lütfen   pozitif bir  tamsayi  giriniz...");
       int sayi = scanner.nextInt();

       int girilensyi = sayi;
       int birler = 0;
       int toplam = 0;

       while (sayi > 0){
           birler = sayi% 10;
           toplam += birler;
           sayi /= 10;
       }
       System.out.println(toplam);
   }
}
