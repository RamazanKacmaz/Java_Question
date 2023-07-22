package C01_C15;

import java.util.Scanner;
import java.util.SortedMap;

public class C14_Faktöriyel {
    /*Soru 23-)
    Girdi olarak bir tamsayı kabul eden ve bu tam sayının faktöriyelini hesaplayan bir method yazın.
    Method bize çıktıyı döndürsün.
    Örnek:
    Girdi: 6
    Çıktı: 6!=65432*1=720
    ipucu: Aldıgınız sayıyı methoda gönderin. Methodun içinde For Loop ile faktöriyelini hesaplayın.*/

    public static void main(String[] args) {

        faktoriyel();
    }

    private static void faktoriyel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayi giriniz");
        int sayi = scanner.nextInt();
        int faktoroyel = 1 ;
        String metin = "";

        for (int i = 1; i <= sayi  ; i++) {

            faktoroyel *= i ;
            metin += i + "*";
        }
        metin= metin.substring(0, metin.length()-1);

        System.out.println(sayi + "!= " +  metin + " ="+  faktoroyel );
    }

}
