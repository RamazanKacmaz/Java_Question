package C46_C60;

import java.util.EventListener;
import java.util.Scanner;

public class C48_If_Else {
    public static void main(String[] args) {

        /*Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
        olarak yazdirin, yoksa girilen harfi yazdirin*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz...");
        char harf = scanner.next().charAt(0);

        if (harf >= 'a' && harf <= 'z' ){
            System.out.println("BUYUK  HARF : " + Character.toUpperCase(harf));
        } else {
            System.out.println("kucuk harf : " +harf );
        }

    }
}
