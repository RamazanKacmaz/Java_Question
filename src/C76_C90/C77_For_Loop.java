package C76_C90;

import java.util.Scanner;

public class C77_For_Loop {
    public static void main(String[] args) {

        //Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen   pozitif bir  tamsayi  giriniz...");
        int sayi = scanner.nextInt();


        int birler = 0;
        int toplam = 0;

        int basamak = (String.valueOf(sayi)).length();
        System.out.println(basamak);


        for (int i = 1; i <= basamak ; i++) {
            birler = sayi % 10;
            toplam += birler;
            sayi /= 10 ;
        }

        System.out.println(toplam);
    }
}
