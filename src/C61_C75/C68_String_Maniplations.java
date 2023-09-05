package C61_C75;

import java.util.Scanner;

public class C68_String_Maniplations {
    /*Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
    duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
    basariyla kaydedildi" yazdirin
            - ilk harf kucuk harf olmali
    - son karakter rakam olmali
    - sifre bosluk icermemeli
    - uzunlugu en az 10 karakter olmali*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  sifrenizi giriniz...");
        String sifre = scanner.nextLine();
        char ilkharf =sifre.charAt(0);
        
        boolean sartlarsaglandi = true;

        // İlk harf küçük harf olmalı
        if (!Character.isLowerCase(sifre.charAt(0))){
            sartlarsaglandi = false;
            System.out.println("İlk harf küçük harf olmalı\"");
        }

        // Son karakter rakam olmalı
        if (!Character.isDigit(sifre.length()-1)){
            sartlarsaglandi = false;
            System.out.println("Son karakter rakam olmalı");
        }
        // Şifre boşluk içermemeli
        if (sifre.contains(" ")){
            sartlarsaglandi =false;
            System.out.println("Şifre boşluk içermemeli");
        }

        // Uzunluğu en az 10 karakter olmalı
        if (sifre.length() < 10){
            sartlarsaglandi = false;
            System.out.println("Şifre en az 10 karakter olmalı");
        }

        if (sartlarsaglandi){
            System.out.println("sifre basariyla kaydedildi");
        }



    }
}
