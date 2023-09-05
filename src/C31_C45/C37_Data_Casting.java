package C31_C45;

import java.util.Scanner;

public class C37_Data_Casting {
    /*Soru 4- Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
    isleminin sonucununun tamsayi kismini yazdirin.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen iki Doublle sayi giriniz");
        double sayi1 = scanner.nextDouble();
        double sayi2 = scanner.nextDouble();

        int bolum = (int) (sayi1/sayi2);

        System.out.println("Bolumun sonucu = " + bolum);

    }
}
