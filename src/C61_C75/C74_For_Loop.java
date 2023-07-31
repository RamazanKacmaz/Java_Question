package C61_C75;

import java.util.Scanner;

public class C74_For_Loop {
    public static void main(String[] args) {
       /* Soru 4- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucuk olsa da program calissin*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  pozitif bir baslangic tamsayi  giriniz...");
        int baslangic = scanner.nextInt();
        System.out.println("Lütfen  pozitif bir bitis tamsayi  giriniz...");
        int bitis = scanner.nextInt();

        int toplam = 0;

        for (int i = baslangic; i <= bitis ; i++) {
            toplam += i;
        }

        System.out.println(toplam);
    }
}
