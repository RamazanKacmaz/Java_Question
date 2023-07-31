package C61_C75;

import java.util.Scanner;

public class C73_For_Loop {
    public static void main(String[] args) {
       /* Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  pozitif bir baslangic tamsayi  giriniz...");
        int baslangic = scanner.nextInt();
        System.out.println("Lütfen  pozitif bir bitis tamsayi  giriniz...");
        int bitis = scanner.nextInt();

        int toplam = 0;

       if (baslangic < bitis){
           for (int i = baslangic; i <= bitis ; i++) {
               toplam += i;
           }
       }else {
           System.out.println("Uyari...");
           return;
       }

        System.out.println(toplam);




    }
}
