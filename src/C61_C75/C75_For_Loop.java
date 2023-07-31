package C61_C75;

import java.util.Scanner;

public class C75_For_Loop {
    public static void main(String[] args) {
        /*Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        hesaplayin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  20 den kucuk pozitif bir  tamsayi  giriniz...");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;

        for (int i = 1; i <= sayi ; i++) {
            faktoriyel *= i ;
        }

        System.out.println(sayi + "  Sayisinin faktoriyel degeri : " + faktoriyel);
    }
}
