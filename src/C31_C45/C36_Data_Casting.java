package C31_C45;

import java.util.Scanner;

public class C36_Data_Casting {
    public static void main(String[] args) {
        /*Soru 3- Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        ile 127 arasindaki bir sayiya donusturup yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfrn bir sayi giriniz...");
        int sayi = scanner.nextInt();

        byte newnummer = (byte) sayi;

        System.out.println(newnummer);
    }
}
