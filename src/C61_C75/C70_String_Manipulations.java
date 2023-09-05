package C61_C75;

import java.util.Scanner;

public class C70_String_Manipulations {
    public static void main(String[] args) {

        /*Soru 6 : Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
                yazdirin.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen  isminizi  giriniz...");
        String isim = scanner.nextLine();

        if (isim.length() % 2 == 0){
            System.out.println( isim.substring(0,isim.length()/2) + ":)" + isim.substring(isim.length()/2) );
        }else {
            System.out.println(isim.substring(0,isim.length()/2) + ":(" + isim.substring(isim.length()/2+1));
        }


    }
}
