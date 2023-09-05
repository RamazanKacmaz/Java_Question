package C61_C75;

import java.util.Scanner;

public class C69_String_Manipulations {

    public static void main(String[] args) {

       /* Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
                - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
        yazdirin
                - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
        harflerle yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  isminizi  giriniz...");
        String isim = scanner.nextLine();
        System.out.println("Lütfen soyisminizi giriniz..");
        String soyisim = scanner.nextLine();

        if (isim.length() > soyisim.length()){
            System.out.println("isim" + (isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase()) + "Soyisim : "+ soyisim.toUpperCase().charAt(0)+soyisim.substring(1).toLowerCase() );
        }else {
            System.out.println((isim.toUpperCase().charAt(0)+isim.substring(1).toLowerCase()) + " soyisim :" + (soyisim.toUpperCase()) );
        }
    }
}
