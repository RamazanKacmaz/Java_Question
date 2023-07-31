package C76_C90;

import java.util.Scanner;

public class C76_For_Loop {
    public static void main(String[] args) {

        /*Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  20 den kucuk pozitif bir  tamsayi  giriniz...");
        int sayi = scanner.nextInt();

        int faktoriyel = 1;

        for (int i = sayi; i > 0 ; i--) {


            faktoriyel *= i ;

        }
        System.out.print( sayi + "! = " + faktoriyel );


    }
}
